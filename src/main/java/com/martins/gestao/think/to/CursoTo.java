package com.martins.gestao.think.to;

import java.io.Serializable;

import com.martins.gestao.think.dto.CursoDto;
import com.martins.gestao.think.vo.CursoVo;

public class CursoTo  implements Serializable{
	
	
	public CursoDto main(CursoVo cursoVo) {
		CursoDto cursoDto = new CursoDto();
		
		cursoDto.setNome(cursoVo.getNome());
		cursoDto.setCategoria(cursoVo.getCategoria());
		
		return cursoDto; 
	}


	public CursoVo getVo(CursoDto cursoDto) {
		CursoVo cursoVo = new CursoVo();
		
		cursoVo.setNome(cursoDto.getNome());
		cursoVo.setCategoria(cursoDto.getCategoria());
		
		return cursoVo;
	}
}
