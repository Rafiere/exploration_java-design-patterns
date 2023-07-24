package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

/* Essa é uma fábrica concreta */
public class EnglandFactory implements InternationalFactory {

	@Override
	public Language createLanguage() {

		return new English();
	}

	@Override
	public CapitalCity createCapital() {

		return new London();
	}
}
