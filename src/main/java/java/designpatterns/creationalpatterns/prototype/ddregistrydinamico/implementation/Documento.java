package java.designpatterns.creationalpatterns.prototype.ddregistrydinamico.implementation;

final public class Documento implements Cloneable {

	String name;
	String visibility;
	String type;
	String localization;

	public Documento clone() throws CloneNotSupportedException {
		return (Documento) super.clone();
	}
}
