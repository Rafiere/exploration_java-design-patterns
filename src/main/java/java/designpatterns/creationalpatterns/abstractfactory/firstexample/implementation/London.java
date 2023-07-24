package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

import java.util.Arrays;
import java.util.List;

public class London implements CapitalCity {

	@Override
	public int getPopulation() {

		return 8900000;
	}

	@Override
	public List<String> listTopAttractions() {

		return Arrays.asList("Tower Bridge", "Buckingham Palace", "Big Ben");
	}
}
