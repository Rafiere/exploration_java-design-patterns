package java.designpatterns.behavorialpatterns.templatemethod.bbexemploprocessadordepagamentos.implementation;

/* Abaixo, temos um processador de pagamento que utiliza cartão de crédito. Ele é
* uma implementação da classe abstrata. Poderíamos ter várias outras implementações, como
* um "ProcessadorPagamentoDebito", por exemplo. */
public class ProcessadorPagamentoCredito extends ProcessadorPagamento {

	@Override
	protected void debitar() {

		System.out.println("Debitando...");
	}

	/* Se a classe abstrata possui uma implementação de notificações que devem
	* ser chamadas de qualquer forma, podemos esquecer de colocar o "super.notificar()", assim, podemos
	* não enviar as notificações que eram para serem chamadas de qualquer forma. Essa é
	* a parte ruim dessa abordagem. No exemplo "CC", mostraremos uma forma de evitar isso. */
	@Override
	protected void notificar(){

		System.out.println("Notificações adicionais...");
		super.notificar();
	}
}
