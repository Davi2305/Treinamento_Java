package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produto;

public class MercadoService {

	public static void montarMenu() {
		System.out.println("Sistema de vendas - Selecione uma opção:");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Adicionar Produto:");
		System.out.println("5 - Sair");
	}

	public static void cadastrarCliente() {
		System.out.println("Cadastro de Clientes");
		System.out.println("------------------------------------------");
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("E-mail: ");
		String email = Principal.scanner.nextLine();
		
		Principal.clienteList.add(new Cliente(nome, email));
	}

	public static void listarClientes() {
		System.out.println("Listagem de clientes:");
		System.out.println("------------------------------------------");
		System.out.println("Nome \t\t E-mail");
		System.out.println("------------------------------------------");
		Principal.clienteList.forEach(c -> System.out.println(c.getNome()+"\t\t"+c.getEmail()));
		System.out.println("------------------------------------------");
	}
	

	public static void cadastrarProduto() {
		System.out.println("Cadastro de Produtos");
		System.out.println("------------------------------------------");
		
		System.out.print("Nome: ");
		String nome = Principal.scanner.nextLine();
		
		System.out.print("Preço: ");
		String precoString = Principal.scanner.nextLine();
		BigDecimal preco = new BigDecimal(precoString);
		
		Principal.produtoList.add(new Produto(nome, preco));
	}

}
