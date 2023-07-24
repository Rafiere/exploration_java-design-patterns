package java.designpatterns.creationalpatterns.abstractfactory.aafirstexample.implementation;

/* Esse é um produto concreto. */
public class Spanish implements Language {

	@Override
	public void greet() {

		System.out.println("Hola!");
	}
}
