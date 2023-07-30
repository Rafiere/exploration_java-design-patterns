package java.designpatterns.structuralpatterns.composite.bbboxexample.implementation;

/* Essa interface define o que é um produto, que também poderá
* ser armazenado em caixas, assim como a própria caixa, que pode ser
* inserida dentro de outras caixas. */
public abstract class Product implements Box {

	protected final String title;
	protected final double price;

	public Product(String title, double price) {

		this.title = title;
		this.price = price;
	}

	public String getTitle() {

		return title;
	}

	public double getPrice() {

		return price;
	}
}
