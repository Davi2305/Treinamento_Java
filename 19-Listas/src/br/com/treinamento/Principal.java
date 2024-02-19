package br.com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// Array List de Inteiros
		ArrayList<Integer> list0 = new ArrayList<>();
		
		// Faz o uso de Polimorfismo
		List<Integer> list = new ArrayList<>();
		
		// Váriavel local com a palavra-chave "var"
		var list2 = new ArrayList<Integer>();
	
		
		System.out.println("list0: "+list0.getClass());
		System.out.println("list: "+list.getClass());
		System.out.println("list2: "+list2.getClass());
		
	}

}
