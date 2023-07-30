package java.designpatterns.structuralpatterns.composite.bbboxexample.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* O objetivo dessa classe é armazenar todas as outras "box". */
public class CompositeBox implements Box {

	private final List<Box> children = new ArrayList<>();

	public CompositeBox(Box... boxes) {
		children.addAll(Arrays.asList(boxes));
	}

	@Override
	public double calculatePrice() {

		return children.stream()
		               .mapToDouble(Box::calculatePrice)
		               .sum();
	}
}
