package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

import java.util.Arrays;
import java.util.List;

/* Produto Concreto */
public class Madrid implements CapitalCity {

	@Override
	public int getPopulation() {

		return 3200000;
	}

	@Override
	public List<String> listTopAttractions() {

		return Arrays.asList("Royal Palace", "Prado Museum", "Retiro Park");
	}
}
