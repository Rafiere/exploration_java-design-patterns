package java.designpatterns.factorymethods.ddformacomplexa.implementation;

/* Todas as instâncias de MotorVehicle deverão ser criadas dessa forma. Todas as
* factories de "MotorVehicle", que são as factories das implementações de "MotorVehicle", deverão
* ter a sua própria fábrica que herdará dessa fábrica padrão. */

/* Para o livro, isso é um criador abstrato que será herdado pelos criadores concretos. */
public abstract class MotorVehicleFactory {

	public MotorVehicle create(){
		MotorVehicle vehicle = createMotorVehicle();

		vehicle.build();

		return vehicle;
	}

	protected abstract MotorVehicle createMotorVehicle();
}
