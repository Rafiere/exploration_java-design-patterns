package java.designpatterns.creationalpatterns.factorymethods.ddformacomplexa.implementation;

/* Aqui temos um criador concreto, que herda do criador abstrato. */
public class MotorcycleFactory extends MotorVehicleFactory {

	/* Essa factory terá a lógica necessária para gerar uma nova "Motorcycle". */
	@Override
	protected MotorVehicle createMotorVehicle() {

		return new Motorcycle();
	}
}
