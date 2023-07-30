package java.designpatterns.structuralpatterns.adapter.ddimplementacaocomheranca.implementation;

import java.math.BigDecimal;

/* Essa classe é chamada de "Adapter", porque ela é quem está realizando a
 * implementação. */

/* A diferença é que, nessa implementação, estamos utilizando a herança para aplicarmos
* o padrão adapter. A vantagem ao utilizarmos herança é que não temos duas instâncias em
* tempo de execução, além disso, implementamos a adaptação de mão-dupla. Se um outro
* cliente usar a SDK, ele pode passar a usar o nosso adaptador ao invés da SDK. A desvantagem de
* usar a herança é que aumentamos o acoplamento. */

public class MeuPagamentoCredito extends SdkPagamentoCredito implements ProcessadorPagamento {

	@Override
	public void debitar(BigDecimal valor) {
		super.autorizar(valor);
		super.capturar(valor);
	}

	public void creditar(BigDecimal valor){
		super.creditar(valor);
	}
}
