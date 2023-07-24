package java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.factories;

import java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.buttons.Button;
import java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.checkboxes.Checkbox;

/* Essa é a fábrica abstrata. Ela saberá tudo dos tipos (hierarquias) abstratas. */
public interface GUIFactory {

	Button createButton();
	Checkbox createCheckbox();
}
