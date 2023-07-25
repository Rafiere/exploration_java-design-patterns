package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Car;

/* É uma das peças do carro. */
public class TripComputer {

	private Car car;

	public TripComputer setCar(Car car){
		this.car = car;
		return this;
	}
}
