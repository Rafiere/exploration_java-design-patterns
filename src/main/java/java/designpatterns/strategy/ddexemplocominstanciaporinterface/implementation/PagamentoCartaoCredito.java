package java.designpatterns.strategy.ddexemplocominstanciaporinterface.implementation;

public class PagamentoCartaoCredito implements PagamentoStrategy {

	/* Agora, a estratégia tem acesso ao contexto, porém, diferentemente do
	* exemplo "CC", ao invés de passarmos o objeto inteiro, estamos passando apenas
	* a interface "Pagavel", assim, a implementação da estratégia tem acesso apenas ao
	* que foi liberado, de fato, para ela ter acesso, através da interface, e não acesso ao
	* objeto inteiro. */

	@Override
	public void pagar(Pagavel compra) {

		System.out.println("Pagou no crédito o valor " +
		                   compra.getValor());
	}
}
