package java.designpatterns.creationalpatterns.builder.ccimplementacaobuilderexterno.implementation;

public class AddressBuilder {

	private Address address;

	public static AddressBuilder builder(){
		return new AddressBuilder();
	}

	public AddressBuilder street(String street){
		this.address.street(street);
		return this;
	}

	public AddressBuilder complement(String complement){
		this.address.complement(complement);
		return this;
	}

	public Address build(){
		return this.address;
	}
}
