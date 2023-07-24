package java.designpatterns.creationalpatterns.abstractfactory;

public class AbstractFactory {

	/* Esse padrão provê uma interface para criar famílias de objetos que são relacionados ou dependentes sem
	* especificar as suas classes concretas. */

	/* Ele é quase a mesma coisa do padrão Factory Method. Ele, geralmente, é composto por múltiplos
	* factory methods. */

	/* Ele permite agrupar uma família de produtos compatíveis criando uma fábrica concreta por grupo de objetos
	* compatíveis. */

	/* Uma família é representada pelas interfaces "CapitalCity" e "Language". */

	/* Quando deve ser utilizado? */

	/* 1. Quando um sistema deve ser independente de como seus produtos são
	* criados, compostos ou representados. */

	/* 2. Um sistema deve ser configurado com uma família de produtos que
	* podem (ou não) trabalhar juntos. */

	/* 3. Uma família de objetos for projetada para ser usada em conjunto e você
	* necessita garantir essa restrição. */

	/* 4. Você quer fornecer uma biblioteca de classes de produtos e quer
	* revelar somente suas interfaces, não suas implementações. */

	/* Vantagens: */

	/* 1. Os produtos sempre serão compatíveis entre si. */

	/* 2. É uma aplicação clara do open/closed principle. É fácil adicionar
	* novas fábricas e produtos. */

	/* 3. É uma aplicação clara do Single Responsibility Principle. O código que
	* cria está separado do código que usa os objetos. */

	/* Desvantagens: */

	/* 1. Muitas classes e maior complexidade será introduzida no código. */

	/* 2. Ele é bem pouco utilizado. */
}
