package com.martins.gestao.think.dao;

import java.sql.Connection;

import com.martins.gestao.think.dto.CursoDto;

public class CursoDao {
	
	public CursoDao(Connection conn) {
	}

	public CursoDto insertCurso(CursoDto cursoDto) {
		return cursoDto;
	}

	public CursoDto getCursoPeloCodigo(Long codigo) {
		
		CursoDto cursoDto = null;
		return cursoDto;
	}

}
