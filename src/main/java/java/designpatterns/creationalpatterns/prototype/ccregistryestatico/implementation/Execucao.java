package java.designpatterns.creationalpatterns.prototype.ccregistryestatico.implementation;

import javax.print.Doc;

public class Execucao {

	public static void main(String[] args) {

		DocumentosRegistry registry = DocumentosRegistry.getInstance();

		/* Estamos obtendo um clone de um objeto pré-existente na memória. */
		Documento pdfRestrito = registry.getDocumento("PDF RESTRITO");

		System.out.println(pdfRestrito);
	}
}
