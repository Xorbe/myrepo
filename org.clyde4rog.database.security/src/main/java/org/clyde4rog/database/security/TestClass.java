package org.clyde4rog.database.security;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class TestClass {
	public static void main(String[] args) {
		final Cluster cluster = Cluster.builder().addContactPoint("192.168.0.240").build();
		final Session session = cluster.connect();

		session.close();
		cluster.close();
	}
}
