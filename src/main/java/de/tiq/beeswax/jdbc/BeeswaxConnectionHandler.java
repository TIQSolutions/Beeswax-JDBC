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

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;

import com.cloudera.beeswax.api.BeeswaxService;
import com.cloudera.beeswax.api.BeeswaxService.Client;

import de.tiq.jdbc.ConnectionHandler;
import de.tiq.jdbc.TIQConnection;
import de.tiq.jdbc.annotations.Connection;

@Connection
public class BeeswaxConnectionHandler extends ConnectionHandler {

	private static Pattern HOST_PATTERN = Pattern.compile("^beeswax://([^:]*)(:([0-9]*))?/.*");
	private Client client;
	private TIQConnection conn;

	public BeeswaxConnectionHandler(TIQConnection con) {
		super(con);
		this.conn = con;
	}

	@Override
	public void connect() throws SQLException {
		Matcher matcher = HOST_PATTERN.matcher(conn.getPath());
		String a_host;
		int a_port = 10000;
		if (matcher.matches()) {
			a_host = matcher.group(1);
			if (matcher.groupCount() > 1) {
				a_port = Integer.parseInt(matcher.group(3));
			}
			try {
				createClient(a_host, a_port);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void close() throws SQLException {
	}

	private void createClient(String host, int port) throws TException {
		TSocket socket = new TSocket(host, port);
		socket.open();
		TBinaryProtocol protocol = new TBinaryProtocol(socket);
		BeeswaxService.Client.Factory factory = new BeeswaxService.Client.Factory();
		client = factory.getClient(protocol);
		client.echo("noop");
	}

	public Client getClient() {
		return client;
	}
}
