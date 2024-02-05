package br.com.treinamento.exercicio;

import br.com.treinamento.exercicio.model.Biblioteca;
import br.com.treinamento.exercicio.model.Livro;
import br.com.treinamento.exercicio.model.Usuario;

public class App 
{
    public static void main( String[] args ) {
    	
     Usuario usuario = new Usuario("Davi", 16, "daviarantes2007@gmail.com", "(11)968989551");
    
     Livro livro = new Livro("Jujursu Kaisen vol. 22", "Gege Akutami", false);
     
     Biblioteca biblioteca = new Biblioteca();
     biblioteca.setUsuario(usuario);
     biblioteca.setLivro(livro);
     
     System.out.println(biblioteca.getLivro());
     
     biblioteca.getLivro().emprestar();
     
     System.out.println(biblioteca.getLivro());
     
     biblioteca.getLivro().devolver();;
     
     System.out.println(biblioteca.getLivro());

     
    }
}
