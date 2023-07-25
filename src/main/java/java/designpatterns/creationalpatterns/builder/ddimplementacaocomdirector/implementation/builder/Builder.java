package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components.*;

/* Essa interface define todas as formas possíveis para configurar um produto. */
public interface Builder {

	void carType(CarType type);
	void seats(int seats);
	void engine(Engine engine);
	void transmission(Transmission transmission);
	void tripComputer(TripComputer tripComputer);
	void gpsNavigator(GpsNavigator gpsNavigator);
}
