package com.martins.gestao.think.dao;

public abstract class DaoFactory {
	private static CursoDao cursodao_instance;
	
	public static CursoDao getCursoDao(){
		if(cursodao_instance == null) {
			synchronized (CursoDao.class) {
				if (cursodao_instance == null) {
					cursodao_instance = new CursoDao();
				}
			}
		}
		return cursodao_instance;
	}
}
