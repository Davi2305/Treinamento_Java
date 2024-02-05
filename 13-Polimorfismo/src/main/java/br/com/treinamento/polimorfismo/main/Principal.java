package br.com.treinamento.polimorfismo.main;

import br.com.treinamento.polimorfismo.model.Designer;
import br.com.treinamento.polimorfismo.model.EditorVideo;
import br.com.treinamento.polimorfismo.model.Funcionario;
import br.com.treinamento.polimorfismo.model.Gerente;
import br.com.treinamento.polimorfismo.service.ControleBonificacao;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Ailton");
		gerente.setSalario(12500.00);
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Davi");
		funcionario.setSalario(3350.00);
		
		
		Funcionario designer = new Designer();
		designer.setNome("Eduardo");
		designer.setSalario(3300.00);
		
		
		Funcionario editorVideo = new EditorVideo();
		editorVideo.setNome("Kaiky");
		editorVideo.setSalario(3600.00);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(designer);
		controle.registra(editorVideo);

		System.out.println("Valor total da folha: "+controle.getSoma());
		
	}

}
