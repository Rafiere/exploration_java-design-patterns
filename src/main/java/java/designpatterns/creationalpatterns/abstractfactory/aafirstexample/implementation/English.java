package java.designpatterns.creationalpatterns.abstractfactory.aafirstexample.implementation;

/* Esse é um produto concreto. */
public class English implements Language {

	@Override
	public void greet() {

		System.out.println("Hi!");
	}
}
