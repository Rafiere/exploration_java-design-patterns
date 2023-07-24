package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories;

import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.Button;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.Checkbox;

/* Essa é a fábrica abstrata. Ela saberá tudo dos tipos (hierarquias) abstratas. */
public interface GUIFactory {

	Button createButton();
	Checkbox createCheckbox();
}
