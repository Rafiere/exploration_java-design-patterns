package java.designpatterns.behavorialpatterns.strategy.ddexemplocominstanciaporinterface.implementation;

import java.math.BigDecimal;

public class Execucao {

	public static void main(String[] args) {

		BigDecimal valor = new BigDecimal("10");

		Compra compra = new Compra(valor);

		/* Estamos passando apenas a implementação da estratégia. */
		compra.processar(new PagamentoCartaoCredito());
		compra.processar(new PagamentoCartaoDebito());
	}
}
