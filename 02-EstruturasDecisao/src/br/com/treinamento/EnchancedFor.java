package br.com.treinamento;

public class EnchancedFor {

	public static void main(String[] args) {

		int[] arrayList = { 10, 20, 30, 40, 60, 70 };

		int contador = 0;
		System.out.println("Lista de numeros:");
		for (int array : arrayList) {
			System.out.println(array);
			contador++;
		}

		System.out.println("Quantidade de registros:" + contador);

	}

}