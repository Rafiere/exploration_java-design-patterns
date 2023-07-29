package java.designpatterns.structuralpatterns.flyweight.ccresolucaodoproblema.implementation;

/* Essa classe é chamada de "Flyweight class", ela armazena o estado interno do objeto, que é
* invariante e independente de contexto. Esses atributos nunca são alterados em "runtime", por isso, devem
* estar com o modificador "final". */

/* Os objetos "flyweight" são imutáveis. */
public class BookType {

	private final String type;
	private final String distributor;
	private final String otherData;

	public BookType(String type, String distributor, String otherData){
		this.type = type;
		this.distributor = distributor;
		this.otherData = otherData;
	}
}
