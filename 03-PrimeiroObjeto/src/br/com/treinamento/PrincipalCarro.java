package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); 
		carro1.ano = 1989;
		carro1.cor = "Marrom";
		carro1.marca = "Volkswagen";
		carro1.modelo = "Voyage";
		
		System.out.println("Modelo do carro: " +carro1.modelo);
		carro1.ligar();
		carro1.mostrarIdade();
		carro1.buzinar("Fom-fom");
		carro1.desligar();
		
	}
	
	

}