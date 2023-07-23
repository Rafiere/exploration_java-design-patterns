package java.designpatterns.strategy.ccexemplocominstancias.implementation;

import java.math.BigDecimal;

public class Compra {

	Long id;
	BigDecimal valor;
	String tipo;

	public Compra(BigDecimal valor){

		this.valor = valor;
	}

	/* Nesse exemplo, ao invés de passarmos apenas o valor, estamos passando
	* a instância, ou seja, o "this". Isso aumenta o acoplamento, pois, agora, a
	* implementação da estratégia deverá conhecer o objeto inteiro. */

	/* Isso pode ser útil quando a estratégia modificará os atributos
	* da compra, como "id", "tipo" e etc, e não utilizará apenas o
	* valor dela. */
	void processarCompra(PagamentoStrategy pagamentoStrategy){
		pagamentoStrategy.pagar(this);
	}
}
