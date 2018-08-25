package com.martins.gestao.think.vo;

import org.springframework.util.StringUtils;

public class CursoVo {

	private String nome;
	private String categoria;
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		validarNome(nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void validarNome(String nome) {
		if(StringUtils.isEmpty(nome)) {
			throw new RuntimeException("Campo não pode ser em branco");
		}
	}

	
}
