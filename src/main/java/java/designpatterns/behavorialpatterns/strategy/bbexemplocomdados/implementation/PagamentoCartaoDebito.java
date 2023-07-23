package java.designpatterns.behavorialpatterns.strategy.bbexemplocomdados.implementation;

import java.math.BigDecimal;

public class PagamentoCartaoDebito implements PagamentoStrategy {

	@Override
	public void pagar(BigDecimal valor) {

		System.out.println("Pagou no débito o valor " + valor);
	}
}
