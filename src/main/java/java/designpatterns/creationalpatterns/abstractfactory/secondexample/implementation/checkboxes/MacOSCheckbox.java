package java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.checkboxes;

/* Todas as famílias de produtos (Buttons/Checkboxes) contém as mesmas
 * variedades (MacOS/Windows). */
public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {

		System.out.println("You have created a MacOS Checkbox.");
	}
}
