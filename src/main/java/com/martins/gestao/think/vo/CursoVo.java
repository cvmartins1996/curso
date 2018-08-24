package com.martins.gestao.think.vo;

import org.springframework.util.StringUtils;

public class CursoVo {

	private String nome;
	
	public String getNome() {
		validarNome();
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void validarNome() {
		if(StringUtils.isEmpty(nome)) {
			throw new RuntimeException("Nome não pode ser em branco");
		}
	}

	
}
