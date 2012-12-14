package de.tiq.beeswax.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeeswaxJdbcTest {

	private java.sql.Connection conn;

	@BeforeClass
	public static void init() throws ClassNotFoundException {
		Class.forName("de.tiq.beeswax.jdbc.BeeswaxDriver");
	}
	
	@Before
	public void connect() throws SQLException {
		conn = DriverManager.getConnection("jdbc:beeswax://slave1.impala.cloudera:21000/default");
		Assert.assertNotNull(conn);
	}
	
	@Test
	public void query() throws Exception {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		ResultSet resultSet = statement.executeQuery("select * from tweets limit 10");
		
		Assert.assertNotNull(resultSet);
		
		int cnt = 0;
		while (resultSet.next()) {
			cnt++;
		}
		Assert.assertEquals(10, cnt);		
	}
	
	@Test
	public void queryWithWhere() throws SQLException {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		ResultSet resultSet = statement.executeQuery("select * from tweets where id = '272137467740700672'");
		
		Assert.assertNotNull(resultSet);
		Assert.assertTrue(resultSet.next());
		Assert.assertEquals("Sat, 24 Nov 2012 00:40:03 +0000", resultSet.getString(1));
		Assert.assertEquals("ImANuisanceYo", resultSet.getString(2));
		Assert.assertEquals("41854943", resultSet.getString(3));
		Assert.assertEquals("AddisonTheNuisance", resultSet.getString(4));
		Assert.assertEquals("272137467740700672", resultSet.getString(5));
		Assert.assertEquals("de", resultSet.getString(6));
		Assert.assertEquals("http://a0.twimg.com/profile_images/2851643629/0babbe268c96fe075b4c87ded66d06bb_normal.jpeg", resultSet.getString(7));
		Assert.assertEquals("&lt;a href=&quot;http://twitter.com/download/android&quot;&gt;Twitter for Android&lt;/a&gt;", resultSet.getString(8));
		Assert.assertEquals("#FunnyOxymorons \"Raider Touchdown\" lmao hahahaha", resultSet.getString(9));
	}
	
	@Test
	public void resultSetMetaData() throws SQLException {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		ResultSet resultSet = statement.executeQuery("select * from tweets limit 10");
		
		Assert.assertNotNull(resultSet);
		
		ResultSetMetaData metaData = resultSet.getMetaData();
		Assert.assertNotNull(metaData);
		Assert.assertEquals(9, metaData.getColumnCount());
		Assert.assertEquals("created_at", metaData.getColumnName(1));
		Assert.assertEquals(Types.VARCHAR, metaData.getColumnType(1));
	}
	
	@After
	public void close() throws SQLException {
		conn.close();
	}
}
