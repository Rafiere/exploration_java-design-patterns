package java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.buttons;

/* Todas as famílias (hierarquias, ou seja, button e checkbox) possuem as
* mesmas variações (MacOS/Windows). */

import java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.buttons.Button;

/* Essa é uma variação do MacOS de um botão. */
public class MacOSButton implements Button {

	@Override
	public void paint() {

		System.out.println("You have created a MacOS Button.");
	}
}
