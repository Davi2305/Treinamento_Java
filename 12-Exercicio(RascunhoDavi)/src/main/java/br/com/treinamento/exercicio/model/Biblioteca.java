package br.com.treinamento.exercicio.model;

public class Biblioteca {
//Pegar, devolver, detalhes livro, detalhes devolução
	void pegar(String livro, String nome) {
		System.out.println("O livro "+livro+" foi pego por "+nome+".");
	}

	void devolver(String livro) {
		System.out.println("O livro "+livro+" foi devolvido.");
	}
	
	void detalhesLivro(String livro, String autor) {
		System.out.println("Titulo: "+livro+" Autor: "+autor);
	}
	
	void detalhesDevolucao(String email, String livro, String nome) {
		System.out.println("A devolução do livro  "+livro+" já foi efetuada. Anteriormente foi pego pelo usuário "+nome+".");
	}
}
