package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample;

public class SecondExample {

	/* Nesse exemplo, retirado do site do Refactoring Guru, os "Buttons" e as
	* "Checkbox" vão agir como produtos. Eles terão duas variantes, o MacOS e
	* o Windows. */

	/* A fábrica abstrata definirá uma interface para criar botões e
	* checkboxes. Há duas fábricas concretas, que vão retornar ambos os
	* produtos em uma única variante. */

	/* O cliente vai trabalhar com as factories e os produtos utilizando
	* interfaces abstratas. Ele vai fazer o mesmo código funcionar com muitas variantes
	* de produtos, dependendo do tipo de objeto. */
}
