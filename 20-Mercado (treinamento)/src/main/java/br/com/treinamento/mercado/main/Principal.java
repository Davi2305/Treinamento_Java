package br.com.treinamento.mercado.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produto;
import br.com.treinamento.mercado.service.MercadoService;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);
	public static List<Cliente> clienteList = new ArrayList<Cliente>();
	public static List<Produto> produtoList = new ArrayList<Produto>();
	
	public static void main(String[] args) {

		while (true) {
			
			
			
			MercadoService.montarMenu();
			
			System.out.print("Opção: ");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (opcao) {
			case 1: {
				MercadoService.cadastrarCliente();
				
				break;
			}
			case 2: {
				
				MercadoService.listarClientes();
				
				break;
				}
			case 3: {
				
				MercadoService.cadastrarProduto();
				
				break;
				}
			case 5:
				scanner.close();
				System.out.println("Saindo...");
				System.exit(0);
			
			default:
				System.out.println("Opção inválida! Tente novamente");
			}
		}
		
	}

}
