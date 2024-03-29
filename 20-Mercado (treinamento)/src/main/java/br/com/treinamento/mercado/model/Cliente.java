package br.com.treinamento.mercado.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Cliente {

	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String email;
	
}



