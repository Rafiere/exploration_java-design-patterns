package java.designpatterns.behavorialpatterns.mediator.bbexemplocombotoes.implementation;

public class Execucao {

	public static void main(String[] args) {

		Dialog dialog = new Dialog();
		dialog.enterUsername("Teste");
		dialog.enterPassword("Teste 2");

		dialog.simulateLoginClicked();

		dialog.simulateForgotPassClicked();
	}
}
