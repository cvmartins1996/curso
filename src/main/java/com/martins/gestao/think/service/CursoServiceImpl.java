package com.martins.gestao.think.service;

import java.sql.SQLException;
import java.util.List;

import com.martins.gestao.think.dao.CursoDao;
import com.martins.gestao.think.dao.DaoFactory;
import com.martins.gestao.think.dto.CursoDto;

public class CursoServiceImpl implements CursoService {

	@Override
	public CursoDto insertCurso(CursoDto cursoDto)  {
		
		CursoDao cursoDao = DaoFactory.getCursoDao();
		try {
			
			int ultimoCodigo = cursoDao.getUltimoCodigo();
			ultimoCodigo++;
			
			cursoDto.setId(String.valueOf(ultimoCodigo));
			
			cursoDao.insertCurso(cursoDto);
			
			CursoDto cursoPeloCodigo = cursoDao.getCursoPeloCodigo(cursoDto.getId());
			
			return cursoPeloCodigo;
		} catch (SQLException e) {
			throw new RuntimeException("inserção não foi sucedida");
		}
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
