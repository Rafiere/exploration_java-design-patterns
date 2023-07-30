package java.designpatterns.structuralpatterns.adapter.ccimplementacaocomcomposicao.implementation;

import java.math.BigDecimal;

/* Essa classe é o "client", ou seja, quem está executando as operações. */
public class Execucao {

	public static void main(String[] args) {

		ProcessadorPagamento credito = new MeuPagamentoCredito();

		credito.debitar(new BigDecimal("100"));
	}
}
