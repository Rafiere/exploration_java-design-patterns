package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Car;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* Esse é um builder concreto. Ele implementa os passos que foram definidos na interface. */
public class CarBuilder implements Builder {

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

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
