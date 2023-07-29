package java.designpatterns.structuralpatterns.flyweight.ccresolucaodoproblema.implementation;

import java.util.HashMap;
import java.util.Map;

/* Abaixo, temos a "Flyweight Factory", que retorna as possibilidades de "flyweight" que
* temos. */

/* Sempre que um novo "BookType" for solicitado, ou seja, que um objeto "flyweight" for
* criado, ele será armazenado nesse mapa, assim, ele será reusável por todos os objetos
* que precisarem dele. */
public class BookFactory {

	private static final Map<String, BookType> bookTypes = new HashMap<>();

	public static BookType getBookType(String type, String distributor, String otherData){
		if(bookTypes.get(type) == null){
			bookTypes.put(type, new BookType(type, distributor, otherData));
		}
		return bookTypes.get(type);
	}
}
