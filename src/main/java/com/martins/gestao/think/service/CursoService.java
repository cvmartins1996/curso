package com.martins.gestao.think.service;

import java.util.List;

import com.martins.gestao.think.dto.CursoDto;

public interface CursoService {
	
	CursoDto insertCurso(CursoDto cursoDto);
	CursoDto updateCurso(CursoDto cursoDto);
	CursoDto getCursoPeloCodigo(CursoDto cursoDto);
	List<CursoDto> getCursos(CursoDto cursoDto);
	CursoDto deleteCurso(CursoDto cursoDto);
	
}
