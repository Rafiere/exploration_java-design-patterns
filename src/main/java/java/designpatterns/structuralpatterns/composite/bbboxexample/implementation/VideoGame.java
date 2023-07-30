package java.designpatterns.structuralpatterns.composite.bbboxexample.implementation;

/* Essa é uma das classes concretas que representam um produto. */

public class VideoGame extends Product {

	public VideoGame(String title, double price) {

		super(title, price);
	}

	public double calculatePrice(){
		return getPrice();
	}
}
