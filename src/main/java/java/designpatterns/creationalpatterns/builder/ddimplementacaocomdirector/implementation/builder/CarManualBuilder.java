package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Car;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Manual;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* Estamos usando os mesmos passos para construir um carro, porém, eles não estão relacionados. */
public class CarManualBuilder implements Builder {

	private CarType type;
	private int seats;

	private Engine engine;

	private Transmission transmission;

	private TripComputer tripComputer;

	private GpsNavigator gpsNavigator;

	@Override
	public void carType(CarType type) {
		this.type = type;
	}

	@Override
	public void seats(int seats) {
		this.seats = seats;
	}

	@Override
	public void engine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void transmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void tripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void gpsNavigator(GpsNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
