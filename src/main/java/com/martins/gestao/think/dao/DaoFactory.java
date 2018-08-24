package com.martins.gestao.think.dao;

import java.sql.Connection;

public abstract class DaoFactory {
	private static CursoDao cursodao_instance;
	
	public static CursoDao getCursoDao(Connection conn){
		if(cursodao_instance == null) {
			cursodao_instance = new CursoDao(conn);
		}
		return cursodao_instance;
	}
}
