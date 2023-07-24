package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

/* Esse é um produto concreto. */
public class English implements Language {

	@Override
	public void greet() {

		System.out.println("Hi!");
	}
}
