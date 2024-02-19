package br.com.treinamento.interfeice;

public class Carro implements Veiculo {

	@Override
	public void liga() {
		System.out.println("O carro foi ligado!");
	}

	@Override
	public Integer velocidadeMaxima() {
		return 190;
	}

	@Override
	public void buzinar() {
		System.out.println("Bi-biiiii!");
	}

	
	
}
