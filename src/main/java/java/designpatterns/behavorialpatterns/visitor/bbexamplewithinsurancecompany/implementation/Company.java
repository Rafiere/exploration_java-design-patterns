package java.designpatterns.behavorialpatterns.visitor.bbexamplewithinsurancecompany.implementation;

public class Company extends Client {

	public Company(String name, String address, String number) {

		super(name, address, number);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
