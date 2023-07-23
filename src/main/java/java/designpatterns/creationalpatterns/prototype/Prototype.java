package java.designpatterns.creationalpatterns.prototype;

public class Prototype {

	/* Podemos criar modelos de instância para serem reutilizadas com esse padrão. */

	/* Vantagens: */

	/* 1. Se temos objetos que temos comportamentos ou atributos pouco diferentes, podemos
	* criar protótipos ao invés de subclasses. */

	/* 2. Podemos criar um banco de protótipos e utilizarmos ele sempre que necessário. */

	/* Desvantagens: */

	/* 1. Temos que tomar cuidado com o uso do "clone()" com interfaces. */

	/* 2. Se escolhermos não utilizar o método "clone()" de Object, podemos gerar
	* um pouco de código boilerplate usando construtores ou static factory methods como
	* cloneables. */
}
