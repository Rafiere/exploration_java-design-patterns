package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories;

import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.Button;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons.WindowsButton;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.Checkbox;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.checkboxes.WindowsCheckbox;

/* Cada fábrica concreta herdará a fábrica base e será a responsável pela criação dos
 * produtos de uma única variedade de ambas as hierarquias. */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {

		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {

		return new WindowsCheckbox();
	}
}
