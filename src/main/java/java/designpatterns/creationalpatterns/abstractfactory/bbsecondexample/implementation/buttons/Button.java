package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.buttons;

/* O padrão do "Abstract Factory" presume que temos muitas famílias de
* produtos estruturadas em classes de hierarquias separadas. Nesse exemplo, as
* hierarquias são "Button" e "Checkbox". Cada hierarquia terá os seus tipos
* diferentes de produtos, assim, teremos os botões para Windows e MacOS, por
* exemplo. */

/* Abaixo, temos a interface comum para a família "Button". */
public interface Button {

	void paint();
}
