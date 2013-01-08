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
package de.tiq.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;


public abstract class AbstractReadonlyResultSet extends AbstractResultSet implements ResultSet {
	
	@Override
	public boolean absolute(int row) throws SQLException {
		System.out.println("TIQ ResultSet.absolute");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void afterLast() throws SQLException {
		System.out.println("TIQ ResultSet.afterLast");
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFirst() throws SQLException {
		System.out.println("TIQ ResultSet.beforeFirst");
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelRowUpdates() throws SQLException {
		System.out.println("TIQ ResultSet.cancelRowUpdates");
		// TODO Auto-generated method stub

	}

	@Override
	public void clearWarnings() throws SQLException {
		System.out.println("TIQ ResultSet.clearWarnings");
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws SQLException {
		System.out.println("TIQ ResultSet.close");
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRow() throws SQLException {
		System.out.println("TIQ ResultSet.deleteRow");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean first() throws SQLException {
		System.out.println("TIQ ResultSet.first");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getConcurrency() throws SQLException {
		System.out.println("TIQ ResultSet.getConcurrency");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCursorName() throws SQLException {
		System.out.println("TIQ ResultSet.getCursorName");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getFetchDirection() throws SQLException {
		System.out.println("TIQ ResultSet.getFetchDirection");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFetchSize() throws SQLException {
		System.out.println("TIQ ResultSet.getFetchSize");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHoldability() throws SQLException {
		System.out.println("TIQ ResultSet.getHoldability");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRow() throws SQLException {
		System.out.println("TIQ ResultSet.getRow");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getType() throws SQLException {
		System.out.println("TIQ ResultSet.getType");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		System.out.println("TIQ ResultSet.getWarnings");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertRow() throws SQLException {
		System.out.println("TIQ ResultSet.insertRow");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAfterLast() throws SQLException {
		System.out.println("TIQ ResultSet.isAfterLast");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		System.out.println("TIQ ResultSet.isBeforeFirst");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isClosed() throws SQLException {
		System.out.println("TIQ ResultSet.isClosed");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFirst() throws SQLException {
		System.out.println("TIQ ResultSet.isFirst");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLast() throws SQLException {
		System.out.println("TIQ ResultSet.isLast");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		System.out.println("TIQ ResultSet.isWrapperFor");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean last() throws SQLException {
		System.out.println("TIQ ResultSet.last");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveToCurrentRow() throws SQLException {
		System.out.println("TIQ ResultSet.moveToCurrentRow");
		// TODO Auto-generated method stub

	}

	@Override
	public void moveToInsertRow() throws SQLException {
		System.out.println("TIQ ResultSet.moveToInsertRow");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean previous() throws SQLException {
		System.out.println("TIQ ResultSet.previous");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refreshRow() throws SQLException {
		System.out.println("TIQ ResultSet.refreshRow");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean relative(int rows) throws SQLException {
		System.out.println("TIQ ResultSet.relative");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rowDeleted() throws SQLException {
		System.out.println("TIQ ResultSet.rowDeleted");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rowInserted() throws SQLException {
		System.out.println("TIQ ResultSet.rowInserted");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rowUpdated() throws SQLException {
		System.out.println("TIQ ResultSet.rowUpdated");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		System.out.println("TIQ ResultSet.setFetchDirection");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		System.out.println("TIQ ResultSet.setFetchSize");
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateArray(int columnIndex, Array x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x,
			long length) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBigDecimal(int columnIndex, BigDecimal x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x,
			int length) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x,
			long length) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBlob(int columnIndex, InputStream inputStream)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBlob(int columnIndex, InputStream inputStream,
			long length) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBoolean(int columnIndex, boolean x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateByte(int columnIndex, byte x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x, int length)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateClob(int columnIndex, Clob x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateClob(int columnIndex, Reader reader)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateDate(int columnIndex, Date x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateDouble(int columnIndex, double x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateFloat(int columnIndex, float x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateInt(int columnIndex, int x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateLong(int columnIndex, long x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNCharacterStream(int columnIndex, Reader x,
			long length) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNClob(int columnIndex, NClob nClob)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNClob(int columnIndex, Reader reader)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNString(int columnIndex, String nString)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateNull(int columnIndex) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateObject(int columnIndex, Object x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateObject(int columnIndex, Object x, int scaleOrLength)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateRef(int columnIndex, Ref x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateRow() throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateShort(int columnIndex, short x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateSQLXML(int columnIndex, SQLXML xmlObject)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateString(int columnIndex, String x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateTime(int columnIndex, Time x) throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public void updateTimestamp(int columnIndex, Timestamp x)
			throws SQLException {
		throw new SQLException("Update not supported.");
	}

	@Override
	public boolean wasNull() throws SQLException {
		System.out.println("TIQ ResultSet.wasNull");
		// TODO Auto-generated method stub
		return false;
	}
}