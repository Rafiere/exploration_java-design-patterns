package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

/* Esse é um produto concreto. */
public class Spanish implements Language {

	@Override
	public void greet() {

		System.out.println("Hola!");
	}
}
