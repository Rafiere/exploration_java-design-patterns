package java.designpatterns.creationalpatterns.prototype.ddregistrydinamico.implementation;

import javax.print.Doc;

public class Execucao {

	public static void main(String[] args) {
		/* Simulando as entradas de um usuário: */
		criarModelo("PDF", "RESTRITO");
		criarModelo("DOC", "RESTRITO");

		DocumentosRegistry registry = DocumentosRegistry.getInstance();

		Documento novoDoc = registry.getDocumento("DOC RESTRITO");

		novoDoc.name = "novo doc";

		System.out.println(novoDoc);
	}

	private static void criarModelo(String type, String visibility){
		Documento documento = new Documento();
		documento.type = type;
		documento.visibility = visibility;
		documento.name = type + " " + visibility;

		String chave = type  + " " + visibility;
		DocumentosRegistry.getInstance().addDocumento(chave, documento);
	}
}
