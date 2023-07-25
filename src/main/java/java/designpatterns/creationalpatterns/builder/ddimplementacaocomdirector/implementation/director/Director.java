package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.director;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder.Builder;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* O "director" define a ordem de construção. Ele trabalha com um objeto builder através de uma interface comum, que, nesse
* exemplo, é a "Builder". */
public class Director {

	public void constructSportsCar(Builder builder){
		builder.carType(CarType.SPORTS_CAR);
		builder.seats(2);
		builder.engine(new Engine(3.0, 0));
		builder.transmission(Transmission.SEMI_AUTOMATIC);
		builder.tripComputer(new TripComputer());
		builder.gpsNavigator(new GpsNavigator());
	}

	public void constructCityCar(Builder builder) {
		builder.carType(CarType.CITY_CAR);
		builder.seats(2);
		builder.engine(new Engine(1.2, 0));
		builder.transmission(Transmission.AUTOMATIC);
		builder.tripComputer(new TripComputer());
		builder.gpsNavigator(new GpsNavigator());
	}

	public void constructSUV(Builder builder) {
		builder.carType(CarType.SUV);
		builder.seats(4);
		builder.engine(new Engine(2.5, 0));
		builder.transmission(Transmission.MANUAL);
		builder.gpsNavigator(new GpsNavigator());
	}
}
