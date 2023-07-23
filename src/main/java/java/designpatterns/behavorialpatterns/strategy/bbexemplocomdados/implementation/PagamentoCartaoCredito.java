package java.designpatterns.behavorialpatterns.strategy.bbexemplocomdados.implementation;

import java.math.BigDecimal;

public class PagamentoCartaoCredito implements PagamentoStrategy {

	@Override
	public void pagar(BigDecimal valor) {

		System.out.println("Pagou no crédito o valor: " + valor);
	}
}
