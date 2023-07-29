package java.designpatterns.structuralpatterns.adapter.bbimplementacaosimples.implementation;

import java.math.BigDecimal;

/* Essa é uma classe que simula algo que temos acesso, ou seja, que é nossa. É uma
 * classe que está em nosso projeto. */

/* Nesse exemplo, adaptaremos as operações que temos nesse exemplo, ou seja, a operação
* "debitar" para o formato da SDK. Internamente, ele chamará o "autorizar" e o
* "capturar", mas, no modelo do código, trabalharemos apenas no conceito de
* "debitar". */

/* Nesse exemplo, basicamente, o padrão Adapter está sendo realizado através de
* um wrapper, assim, estamos traduzindo a chamada que o nosso negócio entende para
* a chamada que a API do fornecedor entende. */

/* Essa classe é chamada de "Adapter", porque ela é quem está realizando a
* implementação. */

public class MeuPagamentoCredito {

	SdkPagamentoCredito sdkPagamentoCredito = new SdkPagamentoCredito();

	public void debitar(BigDecimal valor){
		sdkPagamentoCredito.autorizar(valor);
		sdkPagamentoCredito.capturar(valor);
	}

	public void creditar(BigDecimal valor){
		sdkPagamentoCredito.creditar(valor);
	}
}
