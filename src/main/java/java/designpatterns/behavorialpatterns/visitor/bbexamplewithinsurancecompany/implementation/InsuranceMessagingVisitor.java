package java.designpatterns.behavorialpatterns.visitor.bbexamplewithinsurancecompany.implementation;

public class InsuranceMessagingVisitor  implements Visitor {

	@Override
	public void visit(Bank bank) {

		System.out.println("Implementação para o banco!");
	}

	@Override
	public void visit(Company company) {

		System.out.println("Implementação para uma empresa!");
	}

	@Override
	public void visit(Resident resident) {

		System.out.println("Implementação para uma residência!");
	}

	@Override
	public void visit(Restaurant restaurant) {

		System.out.println("Implementação para um restaurante!");
	}
}
