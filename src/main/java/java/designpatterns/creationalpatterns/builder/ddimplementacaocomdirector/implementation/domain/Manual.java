package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* O "Manual" é outro produto. Ele não possui nenhum ancestral relacionado a um carro. Eles são
* produtos separados. */
public class Manual {

	private final CarType carType;
	private final int seats;

	private final Engine engine;

	private final Transmission transmission;

	private final TripComputer tripComputer;

	private final GpsNavigator gpsNavigator;

	public Manual(CarType carType,
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
		this.gpsNavigator = gpsNavigator;
	}
}
