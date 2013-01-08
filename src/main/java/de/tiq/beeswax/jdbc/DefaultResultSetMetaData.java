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

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class DefaultResultSetMetaData implements ResultSetMetaData {
	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isWrapperFor");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWritable(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isWritable");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSigned(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isSigned");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSearchable(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isSearchable");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isReadOnly(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isReadOnly");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int isNullable(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isNullable");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isDefinitelyWritable(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isDefinitelyWritable");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCurrency(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isCurrency");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCaseSensitive(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isCaseSensitive");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAutoIncrement(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.isAutoIncrement");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTableName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getTableName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSchemaName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getSchemaName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScale(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getScale");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPrecision(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getPrecision");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColumnTypeName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnTypeName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColumnType(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnType");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColumnName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnLabel(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnLabel");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColumnDisplaySize(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnDisplaySize");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnCount");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColumnClassName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getColumnClassName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCatalogName(int arg0) throws SQLException {
		System.out.println("TIQ ResultSetMetaData.getCatalogName");
		// TODO Auto-generated method stub
		return null;
	}
}