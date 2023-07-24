package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.application;

import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.Button;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.Checkbox;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories.GUIFactory;

/* Os usuários da fábrica não se importam com qual fábrica concreta eles usam desde que
 * elas funcionem através de interfaces. */

public class Application {

	private Button button;
	private Checkbox checkbox;

	/* A fábrica que for recebida pela aplicação gerará os objetos desses tipos. */
	public Application(GUIFactory factory){
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint(){
		button.paint();
		checkbox.paint();
	}
}
