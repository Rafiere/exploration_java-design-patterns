package java.designpatterns.behavorialpatterns.mediator.aaconceitos;

public class Conceitos {

	/* Um "componente" são as classes que contém as regras de negócio. Cara componente tem
	* uma referência para o mediator. */

	/* A interface "mediator" declara os métodos de comunicação entre os componentes. */

	/* Os mediators concretos servem para encapsular relações entre vários componentes. Eles frequentemente
	* mantém referências para todos esses componentes e lidam com o seu ciclo de vida. */

	/* Um componente não deve conhecer outros componentes. Toda a comunicação entre eles deve ser feita
	* pelo mediator. Basicamente, os componentes são um grande "blackbox", que não sabem quem está lidando com
	* a sua requisição. */

	/* Vantagens: */

	/* O padrão "mediator" deve ser usado quando é difícil mudar algumas classes, porque elas estão
	* fracamente acopladas com várias outras classes. */

	/* Devemos usar esse padrão quando não conseguimos reusar um componente em um código diferente porque ele é
	* muito dependente de outros componentes, pois, ao aplicarmos esse padrão, os componentes não conhecem outros
	* componentes. Eles ainda podem se comunicar, através de um objeto "Mediator", mas eles estão em uma completa "blackbox". */

	/* Esse padrão também deve ser usado quando estamos criando várias subclasses de componentes apenas para reusar alguns
	* comportamentos básicos em vários contextos. */

	/* Desvantagens: */

	/* O Mediator pode acabar evoluindo para um "God Object". */
}
