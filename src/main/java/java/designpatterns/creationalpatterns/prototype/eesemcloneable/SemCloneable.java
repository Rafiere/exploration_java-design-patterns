package java.designpatterns.creationalpatterns.prototype.eesemcloneable;

public class SemCloneable {

	/* No livro "Java Efetivo", o autor mostra vários cuidados que temos que ter ao
	* utilizar o "clone()" do Java. Temos que tomar mais cuidados ainda caso tenhamos
	* subclasses das classes que estão implementando o "clone". */

	/* Basicamente, se temos classes que usam o "final", podemos usar o "clone()" com
	* cuidado, olhando se os atributos da classe que será clonada podem ser
	* copiados de um objeto para o outro, ou seja, se não temos uma composição, pois o
	* clone não copiará de forma recursiva a composição de objetos. */

	/* O Joshua Bloch, que é o autor do Java Efetivo recomenda a utilização de um
	* construtor para criar um clone, ou de um "static factory method", que está
	* exemplificado no package desse design pattern. */
}
