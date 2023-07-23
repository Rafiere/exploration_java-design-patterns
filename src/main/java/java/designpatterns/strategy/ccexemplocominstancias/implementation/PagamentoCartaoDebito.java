package java.designpatterns.strategy.ccexemplocominstancias.implementation;

public class PagamentoCartaoDebito implements PagamentoStrategy {

	@Override
	public void pagar(Compra compra) {

		/* Agora, a estratégia tem acesso ao contexto, aumentando o
		 * acoplamento, porém, fornecendo acesso a, por exemplo, o
		 * tipo de compra. */

		System.out.println("Pagou no débito: " + compra.valor + " que é " +
		                   "do tipo " + compra.tipo + ".");
	}
}
