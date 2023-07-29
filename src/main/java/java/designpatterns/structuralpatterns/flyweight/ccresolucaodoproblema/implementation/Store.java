package java.designpatterns.structuralpatterns.flyweight.ccresolucaodoproblema.implementation;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private final List<Book> books = new ArrayList<>();

	/* Estamos usando a fábrica para gerarmos os objetos "flyweight", que são os objetos do
	* tipo "BookType". */
	public void storeBook(String name, double price, String type, String distributor, String otherData){
		BookType bookType = BookFactory.getBookType(type, distributor, otherData);
		books.add(new Book(name, price, bookType));
	}
}
