package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.components;

/* É uma das peças do carro. */
public class Engine {

	private final double volume;
	private double mileage;

	private boolean started;

	public Engine(double volume, double mileage){
		this.volume = volume;
		this.mileage = mileage;
	}

	public boolean isStarted(){
		return this.started;
	}
}
