package java.designpatterns.strategy.aaconceitos;

public class Conceitos {

	/* Existem três entidades que fazem parte desse padrão: */

	/* Estratégia - Interface */
	/* Estratégia - Concreta */
	/* Contexto - Implementação */

	/* A estratégia é a interface que vamos declarar um método e ele vai encapsular um
	* algoritmo ou um comportamento, e ele vai ter várias implementações. */

	/* O contexto é a classe que vai utilizar a estratégia. */

	/* Vantagens: */

	/* 1. Com o strategy, podemos reutilizar a implementação de um algoritmo em
	* vários locais, pois ele está encapsulado. */

	/* 2. Ele se torna uma alternativa para o uso de herança, assim, podemos pegar
	* os comportamentos que estão em uma subclasse e, ao invés de usar a subclasse, jogar esse
	* comportamento para uma nova herança, pegando apenas o comportamento, sem aumentar
	* o acoplamento de forma estratosférica, como a herança faria. */

	/* 3. É uma alternativa a um IF-ELSE ou um SWITCH, pois podemos, ao invés de, na
	* classe "Compra", receber um ENUM dizendo se ela foi paga com crédito ou com
	* débito, receber uma estratégia e, com base na estratégia, utilizar a implementação que
	* for passada para ela. */

	/* Desvantagens:*/

	/* 1. A principal desvantagem é a quantidade de classes utilizadas, que aumenta
	* muito o projeto.*/
}
