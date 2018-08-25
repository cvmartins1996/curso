package com.martins.gestao.think.bo;

import com.martins.gestao.think.dto.CursoDto;
import com.martins.gestao.think.service.CursoService;
import com.martins.gestao.think.service.CursoServiceImpl;
import com.martins.gestao.think.to.CursoTo;
import com.martins.gestao.think.vo.CursoVo;

public class CursoBo {
	
	private CursoTo cursoTo;
	CursoService cursoService = new CursoServiceImpl();

	public CursoBo() {
		cursoTo = new CursoTo();
	}
	

	public CursoVo insertCurso(CursoVo cursoVo) {
		CursoDto dto = cursoTo.main(cursoVo);
	
		CursoDto curso;
		curso = cursoService.insertCurso(dto);
	
		CursoVo vo = cursoTo.getVo(curso);
		return vo;
	}


	public CursoVo getCursoPeloCodigo(String codigo) {
		return null;
		
	}

}
