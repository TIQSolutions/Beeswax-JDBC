package de.tiq.beeswax.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.hive.metastore.api.Schema;
import org.apache.thrift.TException;

import com.cloudera.beeswax.api.Query;
import com.cloudera.beeswax.api.QueryHandle;
import com.cloudera.beeswax.api.QueryNotFoundException;
import com.cloudera.beeswax.api.Results;
import com.cloudera.beeswax.api.ResultsMetadata;

import de.tiq.jdbc.QueryExecutor;
import de.tiq.jdbc.annotations.JdbcDriver;

@JdbcDriver(name = "BeeswaxDriver", packageDefinition = "de.tiq.beeswax.jdbc", scheme = "beeswax")
public class Executor extends QueryExecutor {

	private static class DefaultResultSetMetaData implements ResultSetMetaData {
		@Override
		public <T> T unwrap(Class<T> arg0) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isWrapperFor(Class<?> arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isWrapperFor");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isWritable(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isWritable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSigned(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isSigned");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSearchable(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isSearchable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isReadOnly(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isReadOnly");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int isNullable(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isNullable");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isDefinitelyWritable(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isDefinitelyWritable");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCurrency(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isCurrency");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCaseSensitive(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isCaseSensitive");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isAutoIncrement(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.isAutoIncrement");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getTableName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getTableName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getSchemaName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getSchemaName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getScale(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getScale");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getPrecision(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getPrecision");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getColumnTypeName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnTypeName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getColumnType(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnType");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getColumnName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getColumnLabel(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnLabel");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getColumnDisplaySize(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnDisplaySize");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getColumnCount() throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnCount");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getColumnClassName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getColumnClassName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCatalogName(int arg0) throws SQLException {
			System.out.println("XXX ResultSetMetaData.getCatalogName");
			// TODO Auto-generated method stub
			return null;
		}
	}

	private static class DefaultResultSet implements ResultSet {
		@Override
		public <T> T unwrap(Class<T> iface) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isWrapperFor(Class<?> iface) throws SQLException {
			System.out.println("XXX ResultSet.isWrapperFor");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean wasNull() throws SQLException {
			System.out.println("XXX ResultSet.wasNull");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void updateTimestamp(String columnLabel, Timestamp x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateTimestamp");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateTimestamp(int columnIndex, Timestamp x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateTimestamp");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateTime(String columnLabel, Time x) throws SQLException {
			System.out.println("XXX ResultSet.updateTime");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateTime(int columnIndex, Time x) throws SQLException {
			System.out.println("XXX ResultSet.updateTime");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateString(String columnLabel, String x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateString");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateString(int columnIndex, String x) throws SQLException {
			System.out.println("XXX ResultSet.updateString");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateShort(String columnLabel, short x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateShort");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateShort(int columnIndex, short x) throws SQLException {
			System.out.println("XXX ResultSet.updateShort");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateSQLXML(String columnLabel, SQLXML xmlObject)
				throws SQLException {
			System.out.println("XXX ResultSet.updateSQLXML");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateSQLXML(int columnIndex, SQLXML xmlObject)
				throws SQLException {
			System.out.println("XXX ResultSet.updateSQLXML");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateRowId(String columnLabel, RowId x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateRowId");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateRowId(int columnIndex, RowId x) throws SQLException {
			System.out.println("XXX ResultSet.updateRowId");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateRow() throws SQLException {
			System.out.println("XXX ResultSet.updateRow");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateRef(String columnLabel, Ref x) throws SQLException {
			System.out.println("XXX ResultSet.updateRef");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateRef(int columnIndex, Ref x) throws SQLException {
			System.out.println("XXX ResultSet.updateRef");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateObject(String columnLabel, Object x, int scaleOrLength)
				throws SQLException {
			System.out.println("XXX ResultSet.updateObject");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateObject(int columnIndex, Object x, int scaleOrLength)
				throws SQLException {
			System.out.println("XXX ResultSet.updateObject");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateObject(String columnLabel, Object x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateObject");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateObject(int columnIndex, Object x) throws SQLException {
			System.out.println("XXX ResultSet.updateObject");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNull(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.updateNull");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNull(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.updateNull");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNString(String columnLabel, String nString)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNString");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNString(int columnIndex, String nString)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNString");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(String columnLabel, Reader reader, long length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(int columnIndex, Reader reader, long length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(String columnLabel, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(int columnIndex, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(String columnLabel, NClob nClob)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNClob(int columnIndex, NClob nClob)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNCharacterStream(String columnLabel, Reader reader,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateNCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNCharacterStream(int columnIndex, Reader x,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateNCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNCharacterStream(String columnLabel, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateNCharacterStream(int columnIndex, Reader x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateNCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateLong(String columnLabel, long x) throws SQLException {
			System.out.println("XXX ResultSet.updateLong");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateLong(int columnIndex, long x) throws SQLException {
			System.out.println("XXX ResultSet.updateLong");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateInt(String columnLabel, int x) throws SQLException {
			System.out.println("XXX ResultSet.updateInt");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateInt(int columnIndex, int x) throws SQLException {
			System.out.println("XXX ResultSet.updateInt");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateFloat(String columnLabel, float x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateFloat");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateFloat(int columnIndex, float x) throws SQLException {
			System.out.println("XXX ResultSet.updateFloat");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateDouble(String columnLabel, double x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateDouble");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateDouble(int columnIndex, double x) throws SQLException {
			System.out.println("XXX ResultSet.updateDouble");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateDate(String columnLabel, Date x) throws SQLException {
			System.out.println("XXX ResultSet.updateDate");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateDate(int columnIndex, Date x) throws SQLException {
			System.out.println("XXX ResultSet.updateDate");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(String columnLabel, Reader reader, long length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(int columnIndex, Reader reader, long length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(String columnLabel, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(int columnIndex, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(String columnLabel, Clob x) throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateClob(int columnIndex, Clob x) throws SQLException {
			System.out.println("XXX ResultSet.updateClob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(String columnLabel, Reader reader,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(int columnIndex, Reader x, long length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(String columnLabel, Reader reader,
				int length) throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(int columnIndex, Reader x, int length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(String columnLabel, Reader reader)
				throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateCharacterStream(int columnIndex, Reader x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateCharacterStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBytes(String columnLabel, byte[] x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBytes");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBytes(int columnIndex, byte[] x) throws SQLException {
			System.out.println("XXX ResultSet.updateBytes");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateByte(String columnLabel, byte x) throws SQLException {
			System.out.println("XXX ResultSet.updateByte");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateByte(int columnIndex, byte x) throws SQLException {
			System.out.println("XXX ResultSet.updateByte");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBoolean(String columnLabel, boolean x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBoolean");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBoolean(int columnIndex, boolean x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBoolean");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(String columnLabel, InputStream inputStream,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(int columnIndex, InputStream inputStream,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(String columnLabel, InputStream inputStream)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(int columnIndex, InputStream inputStream)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(String columnLabel, Blob x) throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBlob(int columnIndex, Blob x) throws SQLException {
			System.out.println("XXX ResultSet.updateBlob");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(String columnLabel, InputStream x,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(int columnIndex, InputStream x,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(String columnLabel, InputStream x,
				int length) throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(int columnIndex, InputStream x,
				int length) throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(String columnLabel, InputStream x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBinaryStream(int columnIndex, InputStream x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBinaryStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBigDecimal(String columnLabel, BigDecimal x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBigDecimal");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateBigDecimal(int columnIndex, BigDecimal x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateBigDecimal");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(String columnLabel, InputStream x,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(int columnIndex, InputStream x,
				long length) throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(String columnLabel, InputStream x,
				int length) throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(int columnIndex, InputStream x, int length)
				throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(String columnLabel, InputStream x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateAsciiStream(int columnIndex, InputStream x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateAsciiStream");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateArray(String columnLabel, Array x)
				throws SQLException {
			System.out.println("XXX ResultSet.updateArray");
			// TODO Auto-generated method stub

		}

		@Override
		public void updateArray(int columnIndex, Array x) throws SQLException {
			System.out.println("XXX ResultSet.updateArray");
			// TODO Auto-generated method stub

		}

		@Override
		public void setFetchSize(int rows) throws SQLException {
			System.out.println("XXX ResultSet.setFetchSize");
			// TODO Auto-generated method stub

		}

		@Override
		public void setFetchDirection(int direction) throws SQLException {
			System.out.println("XXX ResultSet.setFetchDirection");
			// TODO Auto-generated method stub

		}

		@Override
		public boolean rowUpdated() throws SQLException {
			System.out.println("XXX ResultSet.rowUpdated");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean rowInserted() throws SQLException {
			System.out.println("XXX ResultSet.rowInserted");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean rowDeleted() throws SQLException {
			System.out.println("XXX ResultSet.rowDeleted");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean relative(int rows) throws SQLException {
			System.out.println("XXX ResultSet.relative");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void refreshRow() throws SQLException {
			System.out.println("XXX ResultSet.refreshRow");
			// TODO Auto-generated method stub

		}

		@Override
		public boolean previous() throws SQLException {
			System.out.println("XXX ResultSet.previous");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean next() throws SQLException {
			System.out.println("XXX ResultSet.next");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void moveToInsertRow() throws SQLException {
			System.out.println("XXX ResultSet.moveToInsertRow");
			// TODO Auto-generated method stub

		}

		@Override
		public void moveToCurrentRow() throws SQLException {
			System.out.println("XXX ResultSet.moveToCurrentRow");
			// TODO Auto-generated method stub

		}

		@Override
		public boolean last() throws SQLException {
			System.out.println("XXX ResultSet.last");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isLast() throws SQLException {
			System.out.println("XXX ResultSet.isLast");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isFirst() throws SQLException {
			System.out.println("XXX ResultSet.isFirst");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isClosed() throws SQLException {
			System.out.println("XXX ResultSet.isClosed");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBeforeFirst() throws SQLException {
			System.out.println("XXX ResultSet.isBeforeFirst");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isAfterLast() throws SQLException {
			System.out.println("XXX ResultSet.isAfterLast");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void insertRow() throws SQLException {
			System.out.println("XXX ResultSet.insertRow");
			// TODO Auto-generated method stub

		}

		@Override
		public SQLWarning getWarnings() throws SQLException {
			System.out.println("XXX ResultSet.getWarnings");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getUnicodeStream(String columnLabel)
				throws SQLException {
			System.out.println("XXX ResultSet.getUnicodeStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getUnicodeStream(int columnIndex)
				throws SQLException {
			System.out.println("XXX ResultSet.getUnicodeStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public URL getURL(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getURL");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public URL getURL(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getURL");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getType() throws SQLException {
			System.out.println("XXX ResultSet.getType");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Timestamp getTimestamp(String columnLabel, Calendar cal)
				throws SQLException {
			System.out.println("XXX ResultSet.getTimestamp");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Timestamp getTimestamp(int columnIndex, Calendar cal)
				throws SQLException {
			System.out.println("XXX ResultSet.getTimestamp");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Timestamp getTimestamp(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getTimestamp");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Timestamp getTimestamp(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getTimestamp");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Time getTime(String columnLabel, Calendar cal)
				throws SQLException {
			System.out.println("XXX ResultSet.getTime");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Time getTime(int columnIndex, Calendar cal) throws SQLException {
			System.out.println("XXX ResultSet.getTime");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Time getTime(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getTime");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Time getTime(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getTime");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getString(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getString");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getString(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getString");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public java.sql.Statement getStatement() throws SQLException {
			System.out.println("XXX ResultSet.getStatement");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public short getShort(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getShort");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public short getShort(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getShort");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public SQLXML getSQLXML(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getSQLXML");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SQLXML getSQLXML(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getSQLXML");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RowId getRowId(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getRowId");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RowId getRowId(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getRowId");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getRow() throws SQLException {
			System.out.println("XXX ResultSet.getRow");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Ref getRef(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getRef");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Ref getRef(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getRef");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getObject(String columnLabel, Map<String, Class<?>> map)
				throws SQLException {
			System.out.println("XXX ResultSet.getObject");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getObject(int columnIndex, Map<String, Class<?>> map)
				throws SQLException {
			System.out.println("XXX ResultSet.getObject");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getObject(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getObject");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getObject(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getObject");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getNString(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getNString");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getNString(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getNString");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NClob getNClob(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getNClob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NClob getNClob(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getNClob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reader getNCharacterStream(String columnLabel)
				throws SQLException {
			System.out.println("XXX ResultSet.getNCharacterStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reader getNCharacterStream(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getNCharacterStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultSetMetaData getMetaData() throws SQLException {
			System.out.println("XXX ResultSet.getMetaData");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getLong(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getLong");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long getLong(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getLong");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getInt(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getInt");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getInt(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getInt");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getHoldability() throws SQLException {
			System.out.println("XXX ResultSet.getHoldability");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float getFloat(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getFloat");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float getFloat(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getFloat");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getFetchSize() throws SQLException {
			System.out.println("XXX ResultSet.getFetchSize");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getFetchDirection() throws SQLException {
			System.out.println("XXX ResultSet.getFetchDirection");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getDouble(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getDouble");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getDouble(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getDouble");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Date getDate(String columnLabel, Calendar cal)
				throws SQLException {
			System.out.println("XXX ResultSet.getDate");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Date getDate(int columnIndex, Calendar cal) throws SQLException {
			System.out.println("XXX ResultSet.getDate");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Date getDate(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getDate");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Date getDate(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getDate");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCursorName() throws SQLException {
			System.out.println("XXX ResultSet.getCursorName");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getConcurrency() throws SQLException {
			System.out.println("XXX ResultSet.getConcurrency");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Clob getClob(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getClob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Clob getClob(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getClob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reader getCharacterStream(String columnLabel)
				throws SQLException {
			System.out.println("XXX ResultSet.getCharacterStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reader getCharacterStream(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getCharacterStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public byte[] getBytes(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getBytes");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public byte[] getBytes(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getBytes");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public byte getByte(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getByte");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public byte getByte(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getByte");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean getBoolean(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getBoolean");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean getBoolean(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getBoolean");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Blob getBlob(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getBlob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Blob getBlob(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getBlob");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getBinaryStream(String columnLabel)
				throws SQLException {
			System.out.println("XXX ResultSet.getBinaryStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getBinaryStream(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getBinaryStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public BigDecimal getBigDecimal(String columnLabel, int scale)
				throws SQLException {
			System.out.println("XXX ResultSet.getBigDecimal");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public BigDecimal getBigDecimal(int columnIndex, int scale)
				throws SQLException {
			System.out.println("XXX ResultSet.getBigDecimal");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getBigDecimal");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getBigDecimal");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getAsciiStream(String columnLabel)
				throws SQLException {
			System.out.println("XXX ResultSet.getAsciiStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InputStream getAsciiStream(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getAsciiStream");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Array getArray(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.getArray");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Array getArray(int columnIndex) throws SQLException {
			System.out.println("XXX ResultSet.getArray");
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean first() throws SQLException {
			System.out.println("XXX ResultSet.first");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int findColumn(String columnLabel) throws SQLException {
			System.out.println("XXX ResultSet.findColumn");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteRow() throws SQLException {
			System.out.println("XXX ResultSet.deleteRow");
			// TODO Auto-generated method stub

		}

		@Override
		public void close() throws SQLException {
			System.out.println("XXX ResultSet.close");
			// TODO Auto-generated method stub

		}

		@Override
		public void clearWarnings() throws SQLException {
			System.out.println("XXX ResultSet.clearWarnings");
			// TODO Auto-generated method stub

		}

		@Override
		public void cancelRowUpdates() throws SQLException {
			System.out.println("XXX ResultSet.cancelRowUpdates");
			// TODO Auto-generated method stub

		}

		@Override
		public void beforeFirst() throws SQLException {
			System.out.println("XXX ResultSet.beforeFirst");
			// TODO Auto-generated method stub

		}

		@Override
		public void afterLast() throws SQLException {
			System.out.println("XXX ResultSet.afterLast");
			// TODO Auto-generated method stub

		}

		@Override
		public boolean absolute(int row) throws SQLException {
			System.out.println("XXX ResultSet.absolute");
			// TODO Auto-generated method stub
			return false;
		}
	}

	private BeeswaxConnectionHandler handle;

	public Executor(BeeswaxConnectionHandler handle) {
		super(handle);
		this.handle = handle;
	}

	@Override
	public ResultSet executeQuery(final String sql) throws SQLException {
		Query query = new Query().setQuery(sql);
		try {
			final QueryHandle queryHandle = handle.getClient().query(query);
			return new DefaultResultSet() {

				private List<String> data = Collections.emptyList();
				private String row;
				private boolean hasMore = true;
				private String field;

				@Override
				public boolean next() throws SQLException {
					fetchDataIfNeeded(queryHandle);

					if (data.isEmpty()) {
						row = null;
					} else {
						row = data.remove(0);
					}
					return row != null;
				}
				
				private void fetchDataIfNeeded(final QueryHandle queryHandle)
						throws SQLException {
					if (data.isEmpty() && hasMore) {
						try {
							int fetchSize = 101;
							Results results = handle.getClient().fetch(
									queryHandle, false, fetchSize);
							data = results.getData();
							hasMore = (data.size() == fetchSize);
						} catch (Exception e) {
							throw new SQLException(e);
						}
					}
				}

				@Override
				public String getString(int columnIndex) throws SQLException {
					field = row.split("\t")[columnIndex - 1];
					return field;
				}
				
				@Override
				public boolean wasNull() throws SQLException {
					return field == null || field.trim().length() == 0;
				}

				@Override
				public ResultSetMetaData getMetaData() throws SQLException {
					return new DefaultResultSetMetaData() {
						private Schema schema;

						@Override
						public int getColumnCount() throws SQLException {
							try {
								fetchSchemaIfNeeded(queryHandle);
								return schema.getFieldSchemasSize();
							} catch (QueryNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (TException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							return 0;
						}

						@Override
						public String getColumnName(int arg0)
								throws SQLException {
							try {
								fetchSchemaIfNeeded(queryHandle);
								return schema.getFieldSchemas().get(arg0 - 1)
										.getName();
							} catch (QueryNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (TException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							return null;
						}

						@Override
						public int getColumnType(int arg0) throws SQLException {
							String type = getColumnTypeName(arg0);

							// TODO
							if ("string".equals(type)) {
								return Types.VARCHAR;
							}
							return 0;
						}

						@Override
						public String getColumnTypeName(int arg0)
								throws SQLException {
							try {
								fetchSchemaIfNeeded(queryHandle);
								return schema.getFieldSchemas()
										.get(arg0 - 1).getType();
							} catch (QueryNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (TException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							// TODO Auto-generated method stub
							return null;
						}
						
						private void fetchSchemaIfNeeded(QueryHandle queryHandle)
								throws QueryNotFoundException, TException {
							if (schema == null) {
								ResultsMetadata metadata = handle.getClient()
										.get_results_metadata(queryHandle);
								schema = metadata.getSchema();
							}
						}
					};
				}
			};
		} catch (Exception e) {
			throw new SQLException(e);
		}

	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
