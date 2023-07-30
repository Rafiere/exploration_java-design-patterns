package java.designpatterns.structuralpatterns.adapter.ccimplementacaocomcomposicao.implementation;

import java.math.BigDecimal;

/* Essa classe é chamada de "Adapter", porque ela é quem está realizando a
 * implementação. */
public class MeuPagamentoCredito implements ProcessadorPagamento {

	SdkPagamentoCredito sdkPagamentoCredito = new SdkPagamentoCredito();

	public void debitar(BigDecimal valor){
		sdkPagamentoCredito.autorizar(valor);
		sdkPagamentoCredito.capturar(valor);
	}

	public void creditar(BigDecimal valor){
		sdkPagamentoCredito.creditar(valor);
	}
}
