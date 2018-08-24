package com.martins.gestao.think.bo;

import com.martins.gestao.think.dao.CursoDao;
import com.martins.gestao.think.dao.DaoFactory;
import com.martins.gestao.think.dto.CursoDto;
import com.martins.gestao.think.to.CursoTo;
import com.martins.gestao.think.vo.CursoVo;

public class CursoBo {
	
	private CursoDao cursoDao;
	private CursoTo cursoTo;

	public CursoBo() {
		cursoDao = DaoFactory.getCursoDao(null);
		cursoTo = new CursoTo();
	}
	

	public CursoVo insertCurso(CursoVo cursoVo) {
		
		CursoDto dto = cursoTo.main(cursoVo);
		
		CursoDto insertCurso = cursoDao.insertCurso(dto);
		getCursoPeloCodigo(insertCurso.getId());
		
		return getCursoPeloCodigo(insertCurso.getId());
	}


	public CursoVo getCursoPeloCodigo(Long codigo) {
		CursoDto cursoPeloCodigo = cursoDao.getCursoPeloCodigo(codigo);
		
		CursoVo vo = cursoTo.getVo(cursoPeloCodigo);
		
		return vo;
		
	}

}
