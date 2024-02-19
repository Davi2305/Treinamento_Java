package br.com.treinamento.abstrato;

public class App {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Jeverson");
		gerente.setDiasTrabalhados(26);
		gerente.setSalario(15000.00);
		
		System.out.println("O valor do salário por hora é: "+gerente.calcularHoras());
		
	}
}
