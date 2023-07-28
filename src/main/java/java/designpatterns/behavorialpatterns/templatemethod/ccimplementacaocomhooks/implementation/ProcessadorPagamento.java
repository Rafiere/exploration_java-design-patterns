package java.designpatterns.behavorialpatterns.templatemethod.ccimplementacaocomhooks.implementation;

public abstract class ProcessadorPagamento {

	/* Abaixo, temos o template method. */
	public void processarPagamento(){
		preparar();
		validar();
		debitar();
		notificar();
		notificarAdicional();
		finalizar();
		finalizarAdicional();
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

	private void notificar(){

		System.out.println("Notificando usuário!");
	}

	private void finalizar(){

		System.out.println("Finalizando compra!");
	}

	/* Os dois métodos abaixo são opcionais. Eles podem ou não serem sobrescritos pela
	* subclasse. */
	protected void notificarAdicional(){
		/* Esse método poderá ser implementado ou não, caso haja necessidade. */
	}

	protected void finalizarAdicional(){
		/* Esse método poderá ser implementado ou não, caso haja necessidade. */
	}
}
