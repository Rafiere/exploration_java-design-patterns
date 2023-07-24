package java.designpatterns.creationalpatterns.abstractfactory.aafirstexample.implementation;

public class Execucao {

	public static void main(String[] args) {

		/* English */

		Country country = Country.ENGLAND;

		Language language = InternationalProvider.createLanguage(country);

		CapitalCity capitalCity = InternationalProvider.createCapital(country);

		System.out.println("Country: " + country);
		System.out.println("Capital: " + capitalCity.getClass().getSimpleName());

		language.greet();
		System.out.println("Total Population: " +
		                   capitalCity.getPopulation());

		System.out.println("Top Attractions: " +
		                   capitalCity.listTopAttractions());
	}
}
