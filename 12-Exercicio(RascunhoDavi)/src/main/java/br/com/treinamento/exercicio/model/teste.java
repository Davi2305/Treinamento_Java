package br.com.treinamento.exercicio.model;

import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		String nome;
		System.out.println("Qual o seu nome?");
		nome = texto.nextLine();
		System.out.println("Prazer em conhece-lo "+nome);
		
		
		System.out.println("Quantos anos vc tem?");
		int idade = texto.nextInt();
		if (idade>=18) {
			System.out.println(nome+" já pode dirigir :)");
		}else {
			System.out.println("Eu lamento "+nome+", você ainda não pode dirigir :/");
		}
		texto.close();
	}
	
}
