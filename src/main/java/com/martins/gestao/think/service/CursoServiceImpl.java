package com.martins.gestao.think.service;

import java.sql.Connection;
import java.util.List;

import com.martins.gestao.think.dao.Dao;
import com.martins.gestao.think.dao.DaoFactory;
import com.martins.gestao.think.dto.CursoDto;

public class CursoServiceImpl implements CursoService {
	

	@Override
	public CursoDto insertCurso(CursoDto cursoDto) {
		Connection conn = new Dao().getConn();
		DaoFactory.getCursoDao(conn);
		
		
		return null;
	}

	@Override
	public CursoDto updateCurso(CursoDto cursoDto) {
		return null;
	}

	@Override
	public CursoDto getCursoPeloCodigo(CursoDto cursoDto) {
		return null;
	}

	@Override
	public List<CursoDto> getCursos(CursoDto cursoDto) {
		return null;
	}

	@Override
	public CursoDto deleteCurso(CursoDto cursoDto) {
		return null;
	}

}
