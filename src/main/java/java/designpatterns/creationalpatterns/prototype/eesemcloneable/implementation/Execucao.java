package java.designpatterns.creationalpatterns.prototype.eesemcloneable.implementation;

import javax.print.Doc;

public class Execucao {

	public static void main(String[] args) {

		Documento documento = new Documento();

		Documento novoDocumentoClonado = Documento.clone(documento);
	}
}
