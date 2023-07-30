package java.designpatterns.structuralpatterns.decorator;

public class Decorator {


	/* A principal ideia do Decorator é conseguirmos adicionar uma funcionalidade sob uma
	* classe que já temos sem utilizar herança e conseguir acrescentar funcionalidades
	* em uma classe. */

	/* Diferenças entre Decorator, Adapter e Proxy: */

	/* No adapter, temos a adaptação de uma interface em uma classe que já
	* existe. */

	/* A ideia do proxy é apontar para uma classe que é bem completa e acrescentar uma
	* funcionalidade a mais na classe, implementar controle de acesso, ser usado em
	* uma classe remota e etc. O decorator tende a ser feito de uma forma que
	* precisamos encadear um decorator no outro. */

	/* Vantagens: */

	/* 1. Substituimos a herança pela composição, e a composição pode ser encadeada. */

	/* Desvantagens: */

	/* 1. A complexidade é aumentada, pois precisamos criar várias classes. */
}
