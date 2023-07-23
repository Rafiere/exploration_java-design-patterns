package java.designpatterns.strategy.ccexemplocominstancias.implementation;

import java.math.BigDecimal;

public class Execucao {

	public static void main(String[] args) {

		BigDecimal valor = new BigDecimal("10");

		Compra compra = new Compra(valor);

		/* Estamos passando apenas a implementação da estratégia. */
		compra.processarCompra(new PagamentoCartaoCredito());
		compra.processarCompra(new PagamentoCartaoDebito());
	}
}
