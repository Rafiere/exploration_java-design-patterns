package java.designpatterns.behavorialpatterns.iterator.bbexemplocombreadthedepthfirstalgorithms.implementation;

/* Todos os iterators devem implementar essa interface, dessa forma, todos os algoritmos
* serão compatíveis com esse padrão. */
public interface Iterator<T> {

	/* O método abaixo serve para verificarmos se existe um próximo elemento na estrutura de dados. */
	boolean hasNext();

	/* O método abaixo serve para a estrutura de dados retornar o próximo elemento da coleção. */
	Vertex<T> getNext();

	/* O método abaixo serve para resetar a estrutura de dados. */
	void reset();
}
