package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

public class InternationalProvider {

	public static Language createLanguage(Country country) {

		switch (country) {
			case SPAIN -> {
				return new Spanish();
			}
			case ENGLAND -> {
				return new English();
			}
			default -> throw new IllegalArgumentException("Invalid country: " +
			                                              country);
		}
	}

	public static CapitalCity createCapital(Country country) {

		switch (country) {
			case SPAIN -> {
				return new Madrid();
			}
			case ENGLAND -> {
				return new London();
			}
			default -> throw new IllegalArgumentException("Invalid country: " +
			                                              country);
		}
	}
}
