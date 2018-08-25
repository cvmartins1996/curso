package com.martins.gestao.think.delegate;

import com.martins.gestao.think.bo.CursoBo;
import com.martins.gestao.think.vo.CursoVo;

public class BusinessDelegate {
	
	
	public CursoVo insertCurso(CursoVo cursoVo) {
		return new CursoBo().insertCurso(cursoVo);
		
	}

	public CursoVo consultarCurso(String codigo) {
		return new CursoBo().getCursoPeloCodigo(codigo);
	}
	
}
