package java.designpatterns.behavorialpatterns.mediator.bbexemplocombotoes.implementation;

public class Dialog implements Mediator {

	private TextBox userTextBox;
	private TextBox passTextBox;
	private LoginButton button;

	@Override
	public void login() {

		String username = userTextBox.getText();
		String password = passTextBox.getText();
	}

	public void enterUsername(String username) {

		System.out.println(username);
	}

	public void enterPassword(String password) {

		System.out.println(password);
	}

	public void simulateLoginClicked() {

		System.out.println("O botão de login sofreu um clique!");
	}

	public void simulateForgotPassClicked() {

		System.out.println("O botão de \"esqueci minha senha\" foi clicado!");
	}
}
