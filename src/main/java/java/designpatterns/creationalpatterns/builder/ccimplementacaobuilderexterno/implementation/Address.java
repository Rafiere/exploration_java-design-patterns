package java.designpatterns.creationalpatterns.builder.ccimplementacaobuilderexterno.implementation;

public class Address {

	private String street;

	private String complement;

	protected Address(){}

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
