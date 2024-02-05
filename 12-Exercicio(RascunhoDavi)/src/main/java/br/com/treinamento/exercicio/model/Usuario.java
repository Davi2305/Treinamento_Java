package br.com.treinamento.exercicio.model;

public class Usuario extends Pessoa {
//Atributos: E-mail e Telefone
	
	public Usuario(String nome, Integer idade, String email, Integer telefone) {
		super(nome, idade);
		this.email = email;
		this.telefone = telefone;
	}
	private Integer telefone;
	private String email;
}
