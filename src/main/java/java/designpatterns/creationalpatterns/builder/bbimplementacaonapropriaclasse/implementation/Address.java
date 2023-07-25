package java.designpatterns.creationalpatterns.builder.bbimplementacaonapropriaclasse.implementation;

public class Address {

	/* Nesse tipo de implementação, não temos os "setters" para o
	* "build", apenas os métodos que "get" que sejam necessários. */

	private String street;
	private String complement;

	/* Em um builder desse tipo, é recomendado que tenhamos um construtor
	* privado, já que usaremos o "Builder" para construir o objeto. */
	private Address(){}

	/* Nesse padrão, os métodos que farão parte do builder deverão
	* ter o mesmo nome das propriedades. */

	public static Address builder(){
		return new Address();
	}

	public Address street(String street){
		this.street = street;
		return this;
	}

	public Address complement(String complement){
		this.complement = complement;
		return this;
	}
}
