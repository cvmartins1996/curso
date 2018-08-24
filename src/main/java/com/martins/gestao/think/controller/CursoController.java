package com.martins.gestao.think.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martins.gestao.think.delegate.BusinessDelegate;
import com.martins.gestao.think.vo.CursoVo;

@RestController
@RequestMapping(value = "curso")
public class CursoController {
	
	private BusinessDelegate businessDelegate = new BusinessDelegate();

	@PostMapping
	public ResponseEntity<CursoVo> inserir(@RequestBody CursoVo cursoVo) {
		
		CursoVo insertCurso = businessDelegate.insertCurso(cursoVo);
		
		return new ResponseEntity<CursoVo>(insertCurso, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<CursoVo> consultar(@RequestBody String codigo) {
		
		CursoVo cursoVo = businessDelegate.consultarCurso(Long.parseLong(codigo));
		return new ResponseEntity<CursoVo>(cursoVo , HttpStatus.OK);
	}
	
	@PutMapping
	public String atualizar() {
		return "atualizar";
	}
	
	@DeleteMapping
	public String deletar() {
		return "deletar";
	}
	
}
