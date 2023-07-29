package java.designpatterns.structuralpatterns.adapter.bbimplementacaosimples.implementation;

import java.math.BigDecimal;

/* Essa classe é o "Client". Basicamente, ela está usando o que foi implementado. */

public class Execucao {

	public static void main(String[] args) {

		MeuPagamentoCredito credito = new MeuPagamentoCredito();
		credito.debitar(new BigDecimal("100"));
	}
}
