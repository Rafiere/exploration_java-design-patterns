package java.designpatterns.structuralpatterns.adapter.bbimplementacaosimples.implementation;

import java.math.BigDecimal;

/* Essa classe simula uma SDK fechada, ou seja, uma SDK que não pode ser
* modificada. */

/* Nessa simulação de SDK, para fazermos uma operação de débito no cartão, primeiramente, temos
* que chamar o método "autorizar()" e, depois disso, chamar o método "capturar". */

/* Essa classe é o "adaptee", ou seja, quem está fazendo a adaptação. */
public class SdkPagamentoCredito {

	public void autorizar(BigDecimal valor){

		/* Suposta implementação do método "autorizar". */

		System.out.println("Autorizado!");
	}

	public void capturar(BigDecimal valor){

		/* Suposta implementação do método "capturar". */

		System.out.println("Capturado!");
	}

	public void creditar(BigDecimal valor){

		/* Suposta implementação do método "creditar". */

		System.out.println("Creditado!");
	}
}
