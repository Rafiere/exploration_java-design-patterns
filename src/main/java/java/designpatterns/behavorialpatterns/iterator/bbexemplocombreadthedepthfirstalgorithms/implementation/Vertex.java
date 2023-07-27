package java.designpatterns.behavorialpatterns.iterator.bbexemplocombreadthedepthfirstalgorithms.implementation;

import java.util.LinkedList;
import java.util.List;

/* Esse seria um tipo de estrutura de dados personalizada. */
public class Vertex<T> {

	private boolean visited;
	private final T data;
	private List<Vertex<T>> neighbors = new LinkedList<>();

	public Vertex(T data){
		this.data = data;
	}

	public boolean isVisited(){
		//Aqui seria a implementação desse método na estrutura de dados.
		return true;
	}

	public List<Vertex<T>> getNeighbors(){
		return this.neighbors;
	}

	public boolean setVisited(boolean isVisited){
		this.visited = isVisited;
		return true;
	}

	public void setNeighbors(List<Vertex<T>> list) {
		this.neighbors = list;
	}
}
