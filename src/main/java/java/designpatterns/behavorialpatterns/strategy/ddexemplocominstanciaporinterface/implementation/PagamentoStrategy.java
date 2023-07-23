package java.designpatterns.behavorialpatterns.strategy.ddexemplocominstanciaporinterface.implementation;

public interface PagamentoStrategy {

	/* A estratégia recebe apenas uma interface ao invés da própria instância de
	* "Compra", aumentando o encapsulamento do objeto. */
	void pagar(Pagavel compra);
}
