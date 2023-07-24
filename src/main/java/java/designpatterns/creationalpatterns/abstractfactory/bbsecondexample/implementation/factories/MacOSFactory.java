package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories;

import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.Button;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.MacOSButton;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.Checkbox;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.MacOSCheckbox;

/* Cada fábrica concreta herdará a fábrica base e será a responsável pela criação dos
* produtos de uma única variedade de ambas as hierarquias. */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {

		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {

		return new MacOSCheckbox();
	}
}
