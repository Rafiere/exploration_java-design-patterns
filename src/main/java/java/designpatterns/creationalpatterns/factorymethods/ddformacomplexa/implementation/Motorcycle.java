package java.designpatterns.creationalpatterns.factorymethods.ddformacomplexa.implementation;

/* Isso é um produto concreto, criado por uma fábrica concreta. */
public class Motorcycle implements MotorVehicle {

	@Override
	public void build(){
		System.out.println("Building a motorcycle.");
	}
}
