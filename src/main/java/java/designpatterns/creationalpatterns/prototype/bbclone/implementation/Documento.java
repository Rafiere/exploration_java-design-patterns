package java.designpatterns.creationalpatterns.prototype.bbclone.implementation;

/* Estamos implementando a interface "Cloneable". Ela não possui nenhum método e
* apenas significa que podemos utilizar o método "clone()", que é herdado de
* "object". Esse método copia todas as propriedades do objeto. */
final public class Documento implements Cloneable {

	String nome;
	String visibility;
	String type;
	String localization;

	public Documento clone() throws CloneNotSupportedException {
		return (Documento) super.clone();
	}
}
