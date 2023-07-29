package java.designpatterns.structuralpatterns.flyweight.ccresolucaodoproblema.implementation;

/* Os atributos "name" e "price", que foram deixados na classe inicial, consistem do
* estado exposto do objeto, ou seja, é a parte que pode ser alterada em runtime. */
public class Book {

	private final String name;
	private final double price;

	private final BookType bookType;

	public Book(String name, double price, BookType bookType){
		this.name = name;
		this.price = price;
		this.bookType = bookType;
	}
}
