package java.designpatterns.factorymethods.ddformacomplexa.implementation;

/* Isso é um produto concreto, criado por uma fábrica concreta. */
public class Car implements MotorVehicle {

	@Override
	public void build(){

		System.out.println("Building a car!");
	}
}
