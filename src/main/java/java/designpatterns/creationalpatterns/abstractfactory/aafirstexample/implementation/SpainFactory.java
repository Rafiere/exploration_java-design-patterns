package java.designpatterns.creationalpatterns.abstractfactory.aafirstexample.implementation;

public class SpainFactory implements InternationalFactory {

	@Override
	public Language createLanguage() {

		return new Spanish();
	}

	@Override
	public CapitalCity createCapital() {

		return new Madrid();
	}
}
