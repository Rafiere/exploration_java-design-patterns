package java.designpatterns.structuralpatterns.flyweight.bbexemplodoproblema.implementation;

public class Execucao {

	private static final int BOOK_TYPES = 2;
	private static final int BOOKS_TO_INSERT = 10_000_000;

	public static void main(String[] args) {

		/* No exemplo abaixo, podemos ter um erro de "memória insuficiente". O problema é que
		* cada instância de "Book" é um objeto com muitos dados. Nós estamos criando milhões de livros
		* na memória, e isso pode fazer com que o programa crashe. */

		/* Para evitar isso, vamos aplicar o padrão de projeto "Flyweight". Ele permite que
		* carreguemos mais objetos na memória RAM disponível através do compartilhamento de partes
		* do estado entre múltiplos objetos, ao invés de armazenar todos os dados em cada objeto
		* individualmente. */

		Store store = new Store();
		for (int i = 0; i <
		                BOOKS_TO_INSERT /
		                BOOK_TYPES; i++) {
			store.storeBook("a", 123.00, "Action", "Teste", "Teste");
		}

		store.displayBooks();
	}
}
