package java.designpatterns.behavorialpatterns.templatemethod.ccimplementacaocomhooks.implementation;

public class ProcessadorPagamentoCredito extends ProcessadorPagamento {

	@Override
	protected void debitar() {

		System.out.println("Estamos debitando...");
	}
}
