package PktPrincipal;

import java.lang.Thread.UncaughtExceptionHandler;

public class Venda {

	public static void main(String[] args) { //chamada da classe
		ItemNaoEncapsulado monitor = new ItemNaoEncapsulado(1, "Monitor VT 24 pol", 1400.00); //criação do objeto ItemNaoEncapsulado chamado de monitor
		monitor.setDesconto(0.17); //diretamente no meu objeto, passei o atributo desconto
		double preco = monitor.buscaPrecoAjustado();
		System.out.println("Preço total: R$" + preco);
	}

}
