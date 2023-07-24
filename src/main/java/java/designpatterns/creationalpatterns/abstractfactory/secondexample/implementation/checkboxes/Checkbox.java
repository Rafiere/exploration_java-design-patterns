package java.designpatterns.creationalpatterns.abstractfactory.secondexample.implementation.checkboxes;

/* O padrão do "Abstract Factory" presume que temos muitas famílias de
 * produtos estruturadas em classes de hierarquias separadas. Nesse exemplo, as
 * hierarquias são "Button" e "Checkbox". Cada hierarquia terá os seus tipos
 * diferentes de produtos, assim, teremos os checkboxes para Windows e MacOS, por
 * exemplo. */

/* Abaixo, temos a segunda hierarquia, que é a "Checkbox". */
public interface Checkbox {

	void paint();
}
