package java.designpatterns.structuralpatterns.adapter.ddimplementacaocomheranca.implementation;

import java.math.BigDecimal;

public class Execucao {

	public static void main(String[] args) {

		MeuPagamentoCredito credito = new MeuPagamentoCredito();
		credito.debitar(new BigDecimal("100"));
	}
}
