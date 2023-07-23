package java.designpatterns.factorymethods.ddformacomplexa.implementation;

/* Aqui temos um criador concreto, que herda do criador abstrato. */

public class CarFactory extends MotorVehicleFactory {

	@Override
	protected MotorVehicle createMotorVehicle() {

		return new Car();
	}
}
