package java.designpatterns.strategy.bbexemplocomdados.implementation;

import java.math.BigDecimal;

/* Esse é o contexto. Ele é a classe que utilizará a estratégia. Ele recebe uma interface, assim, quem
* chamar esse código definirá a estratégia que será utilizada, de acordo com a interface que
* for passada. */

/* Esse é o exemplo com dados pois a compra tem um valor, e ele é passado para a estratégia, dessa
* forma, o contexto não deverá conhecer a implementação das interfaces. */

/* O contexto nunca deverá depender das implementações concretas, ou seja, do "PagamentoCartaoCredito" e
* do "PagamentoCartaoDebito", assim, ela deverá apenas depender da interface. */

/* Nesse exemplo, o contexto deverá informar os dados para a estratégia. */

public class Compra {

	BigDecimal valor;

	public Compra(BigDecimal valor){
		this.valor = valor;
	}

	/* No exemplo abaixo, temos um baixo acoplamento, pois estamos
	* passando apenas o DADO, ou seja, o VALOR da compra para o
	* método "processarCompra()", assim, a estratégia conhece apenas o
	* VALOR, e não a compra em si. */
	void processarCompra(PagamentoStrategy pagamentoStrategy){

		//..
		pagamentoStrategy.pagar(valor);
	}
}
