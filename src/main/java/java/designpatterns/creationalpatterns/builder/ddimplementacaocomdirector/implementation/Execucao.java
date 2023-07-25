package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation;

import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder.CarBuilder;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.builder.CarManualBuilder;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.director.Director;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Car;
import java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector.implementation.domain.Manual;

public class Execucao {

	public static void main(String[] args) {

		/* Nessa classe, executaremos o builder. */

		Director director = new Director();

		/* O diretor obterá o builder concreto do cliente. Isso é porque ele
		* sabe como usar o builder da melhor forma. */

		CarBuilder builder = new CarBuilder();

		director.constructSportsCar(builder);

		/* O produto final é obtido de um objeto "builder". O "Director" não
		* depende de builders e produtos concretos. */

		Car car = builder.getResult();

		System.out.println(car);

		/* O diretor pode saber várias receitas de bolo. */

		CarManualBuilder manualBuilder = new CarManualBuilder();

		director.constructSportsCar(manualBuilder);

		Manual carSportsCarManual = manualBuilder.getResult();

		System.out.println(carSportsCarManual);
	}
}
