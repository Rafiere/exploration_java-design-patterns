package java.designpatterns.structuralpatterns.flyweight.ccresolucaodoproblema.implementation;

import java.designpatterns.structuralpatterns.flyweight.bbexemplodoproblema.implementation.Store;
import java.util.Random;

/* No exemplo abaixo, usando o padrão "Flyweight", gastamos apenas 190MB para esse
* projeto ser executado. Se não utilizassemos o padrão "Flyweight", igual ao projeto que
* está no pacote "BB", gastaríamos cerca de 476MB. */

public class Execucao {

	private static final int BOOK_TYPES = 2;
	private static final int BOOKS_TO_INSERT = 10_000_000;

	public static void main(String[] args) {

		java.designpatterns.structuralpatterns.flyweight.bbexemplodoproblema.implementation.Store store = new Store();
		for (int i = 0; i <
		                BOOKS_TO_INSERT /
		                BOOK_TYPES; i++) {
			store.storeBook(getRandomName(), getRandomPrice(), "Action", "Teste", "Teste");
		}

		store.displayBooks();
	}

	private static String getRandomName() {
		String[] names = {
				"The Great Gatsby",
				"To Kill a Mockingbird",
				"1984",
				"Pride and Prejudice",
				"The Catcher in the Rye",
				"Animal Farm",
				"Brave New World",
				"Lord of the Rings",
				"Harry Potter and the Sorcerer's Stone",
				"The Hobbit",
				"Fahrenheit 451",
				"One Hundred Years of Solitude",
				"Catch-22",
				"The Da Vinci Code",
				"The Hunger Games"
		};

		Random random = new Random();
		int randomIndex = random.nextInt(names.length);
		return names[randomIndex];
	}

	private static double getRandomPrice() {
		double minPrice = 10.0;
		double maxPrice = 50.0;
		Random random = new Random();
		return minPrice + (maxPrice - minPrice) * random.nextDouble();
	}
}
