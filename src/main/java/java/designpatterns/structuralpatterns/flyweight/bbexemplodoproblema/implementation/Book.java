package java.designpatterns.structuralpatterns.flyweight.bbexemplodoproblema.implementation;

public class Book {

	private final String name;
	private final double price;
	private final String type;
	private final String distributor;
	private final String otherData;

	public Book(String name, double price, String type, String distributor, String otherData){
		this.name = name;
		this.price = price;
		this.type = type;
		this.distributor = distributor;
		this.otherData = otherData;
	}
}
