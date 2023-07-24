package java.designpatterns.creationalpatterns.abstractfactory.firstexample.implementation;

/* Essa interface deverá ser implementada pelas fábricas e terá os métodos para
* criar objetos do tipo "A" (language) e do tipo "B" (capital). */
public interface InternationalFactory {

	Language createLanguage();

	CapitalCity createCapital();
}
