package java.designpatterns.behavorialpatterns.templatemethod.bbexemploprocessadordepagamentos.implementation;

public abstract class ProcessadorPagamento {

	/* Abaixo, temos o "template method". Ele é o método responsável por
	* chamar outros métodos. */
	public void processarPagamento(){
		preparar();
		validar();
		debitar();
		notificar();
		finalizar();
	}

	/* Esse método foi feito para ser implementado pela subclasse. */
	protected abstract void debitar();

	/* Os métodos "preparar()" e "validar()", por serem "private", serão
	* implementados independentemente da subclasse, por isso que ele é um método
	* "protected". */
	private void preparar(){

		System.out.println("Reservando produtos!");
	}

	private void validar(){

		System.out.println("Validando cadastros!");
	}

	/* Os métodos abaixo possuem uma implementação padrão, mas podem ser
	* implementados pela subclasse. */
	protected void notificar(){

		System.out.println("Notificando usuário!");
	}

	protected void finalizar(){

		System.out.println("Finalizando compra!");
	}
}
