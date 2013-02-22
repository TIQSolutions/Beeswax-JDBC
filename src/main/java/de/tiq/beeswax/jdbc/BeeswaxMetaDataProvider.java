/*
 * Copyright (c) 2012, 2013 All Rights Reserved, www.tiq-solutions.com
 * 
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * This code is product of:
 * 
 * TIQ Solutions GmbH 
 * Weißenfelser Str. 84
 * 04229 Leipzig, Germany
 * 
 * info@tiq-solutions.com
 * 
 */
package de.tiq.beeswax.jdbc;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cloudera.beeswax.api.BeeswaxService.Client;
import com.cloudera.beeswax.api.Query;
import com.cloudera.beeswax.api.QueryHandle;
import com.cloudera.beeswax.api.Results;

import de.tiq.jdbc.ConnectionMetaDataProvider;
import de.tiq.jdbc.annotations.ConnectionMetaData;
import de.tiq.jdbc.impl.AbstractColumnsResultSet;
import de.tiq.jdbc.impl.AbstractTablesResultSet;
import de.tiq.jdbc.impl.ColumnDescription;
import de.tiq.jdbc.impl.DefaultColumnDescription;
import de.tiq.jdbc.impl.DefaultDatabaseMetaData;
import de.tiq.jdbc.impl.DefaultTableDescription;
import de.tiq.jdbc.impl.TableDescription;

@ConnectionMetaData
public class BeeswaxMetaDataProvider implements ConnectionMetaDataProvider<BeeswaxConnectionHandler> {

	private Client client;

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return new DefaultDatabaseMetaData() {
			@Override
			public String getDatabaseProductName() throws SQLException {
				return "beeswax";
			}
			
			@Override
			public String getDriverName() throws SQLException {
				return "BeeswaxDriver";
			}
			
			@Override
			public ResultSet getTables(String catalog, String schemaPattern,
					String tableNamePattern, String[] types)
					throws SQLException {
				return new AbstractTablesResultSet() {

					protected List<TableDescription> initialize() throws SQLException {
						List<TableDescription> retValue = new ArrayList<TableDescription>();
						
						Query query = new Query();
						query.setQuery("show tables");
						try {
							QueryHandle queryHandle = client.query(query);
							Results results = client.fetch(queryHandle,
									false, -1);
							for (String name : results.getData()) {
								retValue.add(new DefaultTableDescription(name, "TABLE", ""));
							}
						} catch (Exception e) {
							throw new SQLException(e);
						}
						
						return retValue;
					}
					
				};
			}
			
			@Override
			public ResultSet getColumns(String catalog, String schemaPattern,
					final String tableNamePattern, String columnNamePattern)
					throws SQLException {
				return new AbstractColumnsResultSet() {
					
					@Override
					protected List<ColumnDescription> initialize() throws SQLException {
						List<ColumnDescription> retValue = new ArrayList<ColumnDescription>();
						
						Query query = new Query();
						query.setQuery("describe " + tableNamePattern);
						try {
							QueryHandle queryHandle = client.query(query);
							Results results = client.fetch(queryHandle,
									false, -1);
							List<String> data = results.getData();
							for (int i = 0; i < data.size(); i++) {
								String[] split = data.get(i).split("\t+");
								retValue.add(new DefaultColumnDescription(i, split[1], HiveColumnTypeMapper.toJava(split[1]), split[0], tableNamePattern));
							}
						} catch (Exception e) {
							throw new SQLException(e);
						}
						
						return retValue;
					}
				};
			}
		};
	}

	@Override
	public void init(BeeswaxConnectionHandler con) {
		client = con.getClient();
	}

}
