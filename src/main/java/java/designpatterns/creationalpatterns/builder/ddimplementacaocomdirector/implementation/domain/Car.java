package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* É uma das classes de produto, ou seja, é uma das classes que terá um objeto, de seu tipo, gerado pelo
* builder. */
public class Car {

	private final CarType carType;
	private final int seats;

	private final Engine engine;

	private final Transmission transmission;

	private final TripComputer tripComputer;

	private final GpsNavigator gpsNavigator;

	public Car(CarType carType,
	           int seats,
	           Engine engine,
	           Transmission transmission,
	           TripComputer tripComputer,
	           GpsNavigator gpsNavigator) {

		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if(this.tripComputer != null){
			this.tripComputer.setCar(this);
		}
		this.gpsNavigator = gpsNavigator;
	}
}
