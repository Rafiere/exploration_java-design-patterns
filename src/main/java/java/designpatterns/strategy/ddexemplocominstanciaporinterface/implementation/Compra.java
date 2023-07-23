package java.designpatterns.strategy.ddexemplocominstanciaporinterface.implementation;

import java.math.BigDecimal;

public class Compra implements Pagavel {

	BigDecimal valor;

	public Compra(BigDecimal valor){
		this.valor = valor;
	}

	public void processar(PagamentoStrategy pagamentoStrategy){
		pagamentoStrategy.pagar(this);
	}

	@Override
	public BigDecimal getValor() {

		return null;
	}
}
