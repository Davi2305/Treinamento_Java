package br.com.treinamento;

public class Conta {
	
	// Atributos
	String agencia;
	int numeroConta;
	double saldo;
	Cliente titular;
	
	// 
	void transferir(Conta contaDestino, double valor){
		if(saldo<valor) {
			System.out.println("Saldo insuficiente");					
		}else {
			saldo = saldo - valor;
			contaDestino.saldo = contaDestino.saldo + valor;	
		}
	}
	
	void sacar(double valor){
		saldo = saldo-valor;
		System.out.println("Saque efetuado com sucesso!");
	}
	
	void depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

}