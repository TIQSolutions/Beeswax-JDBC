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

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

import de.tiq.jdbc.ConnectionMetaDataProvider;
import de.tiq.jdbc.annotations.ConnectionMetaData;

@ConnectionMetaData
public class BeeswaxMetaDataProvider implements ConnectionMetaDataProvider {

	public static class DefaultDatabaseMetaData implements DatabaseMetaData {

		@Override
		public boolean isWrapperFor(Class<?> iface) throws SQLException {
			System.out.println("XXX DatabaseMetaData.isWrapperFor");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public <T> T unwrap(Class<T> iface) throws SQLException {
			System.out.println("XXX DatabaseMetaData.T unwrap");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean allProceduresAreCallable() throws SQLException {
			System.out.println("XXX DatabaseMetaData.allProceduresAreCallable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean allTablesAreSelectable() throws SQLException {
			System.out.println("XXX DatabaseMetaData.allTablesAreSelectable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean autoCommitFailureClosesAllResultSets()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.autoCommitFailureClosesAllResultSets");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean dataDefinitionCausesTransactionCommit()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.dataDefinitionCausesTransactionCommit");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean dataDefinitionIgnoredInTransactions()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.dataDefinitionIgnoredInTransactions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deletesAreDetected(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.deletesAreDetected");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.doesMaxRowSizeIncludeBlobs");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public ResultSet getAttributes(String catalog, String schemaPattern,
				String typeNamePattern, String attributeNamePattern)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.getAttributes");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getBestRowIdentifier(String catalog, String schema,
				String table, int scope, boolean nullable) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getBestRowIdentifier");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCatalogSeparator() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getCatalogSeparator");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCatalogTerm() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getCatalogTerm");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getCatalogs() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getCatalogs");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getClientInfoProperties() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getClientInfoProperties");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getColumnPrivileges(String catalog, String schema,
				String table, String columnNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getColumnPrivileges");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getColumns(String catalog, String schemaPattern,
				String tableNamePattern, String columnNamePattern)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.getColumns");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Connection getConnection() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getConnection");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getCrossReference(String parentCatalog,
				String parentSchema, String parentTable, String foreignCatalog,
				String foreignSchema, String foreignTable) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getCrossReference");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getDatabaseMajorVersion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getDatabaseMajorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getDatabaseMinorVersion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getDatabaseMinorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getDatabaseProductName() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getDatabaseProductName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDatabaseProductVersion() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.getDatabaseProductVersion");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getDefaultTransactionIsolation() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.getDefaultTransactionIsolation");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getDriverMajorVersion() {
			System.out.println("XXX DatabaseMetaData.getDriverMajorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getDriverMinorVersion() {
			System.out.println("XXX DatabaseMetaData.getDriverMinorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getDriverName() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getDriverName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDriverVersion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getDriverVersion");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getExportedKeys(String catalog, String schema,
				String table) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getExportedKeys");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getExtraNameCharacters() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getExtraNameCharacters");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getFunctionColumns(String catalog,
				String schemaPattern, String functionNamePattern,
				String columnNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getFunctionColumns");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getFunctions(String catalog, String schemaPattern,
				String functionNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getFunctions");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getIdentifierQuoteString() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getIdentifierQuoteString");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getImportedKeys(String catalog, String schema,
				String table) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getImportedKeys");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getIndexInfo(String catalog, String schema,
				String table, boolean unique, boolean approximate)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.getIndexInfo");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getJDBCMajorVersion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getJDBCMajorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getJDBCMinorVersion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getJDBCMinorVersion");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxBinaryLiteralLength() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.getMaxBinaryLiteralLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxCatalogNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxCatalogNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxCharLiteralLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxCharLiteralLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnsInGroupBy() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnsInGroupBy");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnsInIndex() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnsInIndex");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnsInOrderBy() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnsInOrderBy");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnsInSelect() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnsInSelect");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxColumnsInTable() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxColumnsInTable");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxConnections() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxConnections");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxCursorNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxCursorNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxIndexLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxIndexLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxProcedureNameLength() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.getMaxProcedureNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxRowSize() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxRowSize");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxSchemaNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxSchemaNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxStatementLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxStatementLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxStatements() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxStatements");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxTableNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxTableNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxTablesInSelect() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxTablesInSelect");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMaxUserNameLength() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getMaxUserNameLength");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getNumericFunctions() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getNumericFunctions");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getPrimaryKeys(String catalog, String schema,
				String table) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getPrimaryKeys");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getProcedureColumns(String catalog,
				String schemaPattern, String procedureNamePattern,
				String columnNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getProcedureColumns");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getProcedureTerm() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getProcedureTerm");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getProcedures(String catalog, String schemaPattern,
				String procedureNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getProcedures");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getResultSetHoldability() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getResultSetHoldability");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public RowIdLifetime getRowIdLifetime() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getRowIdLifetime");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getSQLKeywords() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSQLKeywords");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getSQLStateType() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSQLStateType");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getSchemaTerm() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSchemaTerm");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getSchemas() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSchemas");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getSchemas(String catalog, String schemaPattern)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSchemas");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getSearchStringEscape() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSearchStringEscape");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getStringFunctions() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getStringFunctions");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getSuperTables(String catalog, String schemaPattern,
				String tableNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSuperTables");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getSuperTypes(String catalog, String schemaPattern,
				String typeNamePattern) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSuperTypes");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getSystemFunctions() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getSystemFunctions");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getTablePrivileges(String catalog,
				String schemaPattern, String tableNamePattern)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.getTablePrivileges");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getTableTypes() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getTableTypes");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getTables(String catalog, String schemaPattern,
				String tableNamePattern, String[] types) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getTables");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getTimeDateFunctions() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getTimeDateFunctions");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getTypeInfo() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getTypeInfo");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getUDTs(String catalog, String schemaPattern,
				String typeNamePattern, int[] types) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getUDTs");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getURL() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getURL");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUserName() throws SQLException {
			System.out.println("XXX DatabaseMetaData.getUserName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSet getVersionColumns(String catalog, String schema,
				String table) throws SQLException {
			System.out.println("XXX DatabaseMetaData.getVersionColumns");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean insertsAreDetected(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.insertsAreDetected");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCatalogAtStart() throws SQLException {
			System.out.println("XXX DatabaseMetaData.isCatalogAtStart");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isReadOnly() throws SQLException {
			System.out.println("XXX DatabaseMetaData.isReadOnly");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean locatorsUpdateCopy() throws SQLException {
			System.out.println("XXX DatabaseMetaData.locatorsUpdateCopy");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean nullPlusNonNullIsNull() throws SQLException {
			System.out.println("XXX DatabaseMetaData.nullPlusNonNullIsNull");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean nullsAreSortedAtEnd() throws SQLException {
			System.out.println("XXX DatabaseMetaData.nullsAreSortedAtEnd");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean nullsAreSortedAtStart() throws SQLException {
			System.out.println("XXX DatabaseMetaData.nullsAreSortedAtStart");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean nullsAreSortedHigh() throws SQLException {
			System.out.println("XXX DatabaseMetaData.nullsAreSortedHigh");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean nullsAreSortedLow() throws SQLException {
			System.out.println("XXX DatabaseMetaData.nullsAreSortedLow");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean othersDeletesAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.othersDeletesAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean othersInsertsAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.othersInsertsAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean othersUpdatesAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.othersUpdatesAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean ownDeletesAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.ownDeletesAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean ownInsertsAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.ownInsertsAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean ownUpdatesAreVisible(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.ownUpdatesAreVisible");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesLowerCaseIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesLowerCaseIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesLowerCaseQuotedIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesMixedCaseIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesMixedCaseIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesMixedCaseQuotedIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesUpperCaseIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesUpperCaseIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.storesUpperCaseQuotedIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsANSI92EntryLevelSQL() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsANSI92EntryLevelSQL");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsANSI92FullSQL() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsANSI92FullSQL");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsANSI92IntermediateSQL() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsANSI92IntermediateSQL");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsAlterTableWithAddColumn() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsAlterTableWithAddColumn");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsAlterTableWithDropColumn() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsAlterTableWithDropColumn");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsBatchUpdates() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsBatchUpdates");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCatalogsInDataManipulation() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCatalogsInDataManipulation");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCatalogsInIndexDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCatalogsInPrivilegeDefinitions()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCatalogsInPrivilegeDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCatalogsInProcedureCalls() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCatalogsInProcedureCalls");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCatalogsInTableDefinitions() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCatalogsInTableDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsColumnAliasing() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsColumnAliasing");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsConvert() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsConvert");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsConvert(int fromType, int toType)
				throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsConvert");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCoreSQLGrammar() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsCoreSQLGrammar");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsCorrelatedSubqueries() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsCorrelatedSubqueries");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsDataDefinitionAndDataManipulationTransactions()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsDataDefinitionAndDataManipulationTransactions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsDataManipulationTransactionsOnly()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsDataManipulationTransactionsOnly");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsDifferentTableCorrelationNames()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsDifferentTableCorrelationNames");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsExpressionsInOrderBy() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsExpressionsInOrderBy");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsExtendedSQLGrammar() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsExtendedSQLGrammar");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsFullOuterJoins() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsFullOuterJoins");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsGetGeneratedKeys() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsGetGeneratedKeys");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsGroupBy() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsGroupBy");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsGroupByBeyondSelect() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsGroupByBeyondSelect");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsGroupByUnrelated() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsGroupByUnrelated");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsIntegrityEnhancementFacility()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsIntegrityEnhancementFacility");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsLikeEscapeClause() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsLikeEscapeClause");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsLimitedOuterJoins() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsLimitedOuterJoins");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMinimumSQLGrammar() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMinimumSQLGrammar");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMixedCaseIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMixedCaseIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMixedCaseQuotedIdentifiers");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMultipleOpenResults() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMultipleOpenResults");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMultipleResultSets() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMultipleResultSets");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsMultipleTransactions() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsMultipleTransactions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsNamedParameters() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsNamedParameters");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsNonNullableColumns() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsNonNullableColumns");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsOpenCursorsAcrossCommit");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsOpenCursorsAcrossRollback");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsOpenStatementsAcrossCommit");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOpenStatementsAcrossRollback()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsOpenStatementsAcrossRollback");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOrderByUnrelated() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsOrderByUnrelated");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsOuterJoins() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsOuterJoins");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsPositionedDelete() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsPositionedDelete");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsPositionedUpdate() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsPositionedUpdate");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsResultSetConcurrency(int type, int concurrency)
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsResultSetConcurrency");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsResultSetHoldability(int holdability)
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsResultSetHoldability");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsResultSetType(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsResultSetType");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSavepoints() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsSavepoints");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSchemasInDataManipulation() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSchemasInDataManipulation");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSchemasInIndexDefinitions() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSchemasInIndexDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSchemasInPrivilegeDefinitions()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSchemasInPrivilegeDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSchemasInProcedureCalls() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSchemasInProcedureCalls");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSchemasInTableDefinitions() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSchemasInTableDefinitions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSelectForUpdate() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsSelectForUpdate");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsStatementPooling() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsStatementPooling");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsStoredFunctionsUsingCallSyntax()
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsStoredFunctionsUsingCallSyntax");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsStoredProcedures() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsStoredProcedures");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSubqueriesInComparisons() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSubqueriesInComparisons");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSubqueriesInExists() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSubqueriesInExists");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSubqueriesInIns() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsSubqueriesInIns");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsSubqueriesInQuantifieds() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsSubqueriesInQuantifieds");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsTableCorrelationNames() throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsTableCorrelationNames");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsTransactionIsolationLevel(int level)
				throws SQLException {
			System.out
					.println("XXX DatabaseMetaData.supportsTransactionIsolationLevel");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsTransactions() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsTransactions");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsUnion() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsUnion");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean supportsUnionAll() throws SQLException {
			System.out.println("XXX DatabaseMetaData.supportsUnionAll");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean updatesAreDetected(int type) throws SQLException {
			System.out.println("XXX DatabaseMetaData.updatesAreDetected");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean usesLocalFilePerTable() throws SQLException {
			System.out.println("XXX DatabaseMetaData.usesLocalFilePerTable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean usesLocalFiles() throws SQLException {
			System.out.println("XXX DatabaseMetaData.usesLocalFiles");
			// TODO Auto-generated method stub
			return false;
		}

	}

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
		};
	}

	@Override
	public void init(BeeswaxConnectionHandler con) {
		// TODO Auto-generated method stub

	}

}
