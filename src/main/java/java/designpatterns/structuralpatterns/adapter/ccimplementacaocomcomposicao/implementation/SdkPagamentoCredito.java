package java.designpatterns.structuralpatterns.adapter.ccimplementacaocomcomposicao.implementation;

import java.math.BigDecimal;

/* Isso é como se fosse um SDK, um .jar ou uma biblioteca no Maven. Não temos
* permissão para modificar isso. */

/* Essa classe é o "adaptee", ou seja, quem está sendo adaptado. */
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
