package com.martins.gestao.think.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public Connection getConn() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:8080/curso", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
