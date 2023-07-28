package java.designpatterns.behavorialpatterns.templatemethod;

public class TemplateMethod {

	/* Esse é um dos padrões de projetos mais simples de compreender. O funcionamento
	* dele é muito simples. */

	/* A ideia desse padrão de projeto é conseguirmos modificar o comportamento
	* interno de um algoritmo usando herança. */

	/* Basicamente, esse padrão tem uma classe abstrata e as implementações dessa
	* classe abstrata, que são as classes concretas. */

	/* Diferenças para o padrão Stategy: */

	/* Basicamente, o "strategy" utilizará composição ou outra forma de
	* dependência, enquanto que o "strategy", obrigatoriamente, utilizará
	* herança. */

	/* Outra diferença é que, no caso do Template Method, a ordem em que as operações
	* são executadas é fixa. No caso do strategy, isso pode ser mais flexível. */

	/* Uma grande desvantagem do Template Method é o fato dele usar herança. Quando
	* usamos herança, estamos utilizando um acoplamento muito grande na aplicação. */
}
