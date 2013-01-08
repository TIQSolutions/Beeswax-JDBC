package de.tiq.beeswax.jdbc;

import java.sql.DatabaseMetaData;
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
import org.junit.Ignore;
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
	@Ignore
	public void queryWithBigResult() throws Exception {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		String sql; 
		sql = "select * from tweets LIMIT 1601";
//		sql = "SELECT from_user as user_aggr, count(id) as cnt FROM tweets GROUP BY user_aggr";
//		sql = "select id from tweets";
//		sql = "SELECT distinct from_user FROM tweets";
		ResultSet resultSet = statement.executeQuery(sql);
		Assert.assertNotNull(resultSet);
		
		
		int byteCnt = 0;
		int cnt = 0;
		while (resultSet.next()) {
			for (int i = 1; i < 10; i++) {
				byteCnt += resultSet.getString(i).length();
			}
			cnt++;
			
			System.out.println(cnt + " : " + byteCnt);
		}
		Assert.assertEquals(1200, cnt);	
	}
	
	@Test
	public void queryWithWhere() throws SQLException {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		ResultSet resultSet = statement.executeQuery("select * from tweets where id = '272137467740700672'");
		
		Assert.assertNotNull(resultSet);
		try {
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
		} finally {
			resultSet.close();
		}
	}
	
	@Test
	public void resultSetMetaData() throws SQLException {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		ResultSet resultSet = statement.executeQuery("select * from tweets limit 10");
		
		Assert.assertNotNull(resultSet);
		
		try {
			ResultSetMetaData metaData = resultSet.getMetaData();
			Assert.assertNotNull(metaData);
			Assert.assertEquals(9, metaData.getColumnCount());
			Assert.assertEquals("created_at", metaData.getColumnName(1));
			Assert.assertEquals(Types.VARCHAR, metaData.getColumnType(1));
		} finally {
			resultSet.close();
		}
	}

	
	@Test
	public void databaseMetaData() throws SQLException {
		DatabaseMetaData databaseMetaData = conn.getMetaData();
		
		Assert.assertNotNull(databaseMetaData);
		Assert.assertEquals("beeswax", databaseMetaData.getDatabaseProductName());
		Assert.assertEquals("BeeswaxDriver", databaseMetaData.getDriverName());
	}
	
	@Test
	public void execute() throws SQLException {
		Statement statement = conn.createStatement();
		
		Assert.assertNotNull(statement);
		Assert.assertTrue(statement.execute("select * from tweets limit 20"));
		Assert.assertNotNull(statement.getResultSet());
		statement.getResultSet().close();
	}
	
	@After
	public void close() throws SQLException {
		conn.close();
	}
}
