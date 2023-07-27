package java.designpatterns.behavorialpatterns.mediator.bbexemplocombotoes.implementation;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton implements Component {

	/* No exemplo abaixo, queremos tornar o "LoginButton" reusável, mas ele estava
	* dependendo de "userTextBox" e "passwordTextBox", */

	/* Para isso, criamos a interface "Mediator" e a classe "Dialog" que
	* implementará essa interface. Após isso, passamos as dependências de
	* "TextBox" para o objeto "Mediator", que é uma interface, e adicionamos
	* ela como atributo do "LoginButton". */

	/* Dessa forma, ao invés dessa própria classe depender de "TextBox", ela apenas
	* pede para o "Mediator" executar essa determinada ação. */

	private Mediator mediator;
	//private final TextBox userTextBox;
	//private final TextBox passwordTextBox;

	public LoginButton(){
		super("Log In");
		//this.userTextBox = textBox;
		//this.passwordTextBox = passwordTextBox;
	}

	protected void fireActionPerformed(ActionEvent actionEvent){
		mediator.login();
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName(){
		return "Login Button";
	}
}
