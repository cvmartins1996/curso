package com.martins.gestao.think.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public Connection getConn() {
		Connection connection = null;
		try {
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/curso", "root", "");
			}
			return connection; 
		} catch (SQLException e) {
			return null;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
