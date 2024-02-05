package br.com.treinamento.polimorfismo.service;

import br.com.treinamento.polimorfismo.model.Funcionario;
import lombok.Getter;

public class ControleBonificacao {

	@Getter
	private Double soma = 0.0;

	
	public void registra(Funcionario funcionario) {
		
		soma += funcionario.getBonificacao();
		/*
		Double boni = funcionario.getBonificacao();
		this.soma = this.soma + boni;
		*/
	}
}
