package br.com.treinamento.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Pedido {

	
	
	public Pedido(Cliente cliente, List<Produto> produtoList) {
		this.cliente = cliente;
		this.produtoList = produtoList;
	}

	@Getter @Setter
	private Cliente cliente;
	
	@Getter @Setter
	private List<Produto> produtoList = new ArrayList<Produto>();
	
	@Getter @Setter
	private BigDecimal total;
	
	public void insereProduto (Produto produto) {
		produtoList.add(produto);
	}
	
}
