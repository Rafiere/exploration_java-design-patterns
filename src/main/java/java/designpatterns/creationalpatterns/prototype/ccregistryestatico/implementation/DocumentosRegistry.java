package java.designpatterns.creationalpatterns.prototype.ccregistryestatico.implementation;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class DocumentosRegistry {

	private static final DocumentosRegistry INSTANCE = new DocumentosRegistry();

	private static final Map<String, Documento> REGISTRY = new HashMap<>();

	private DocumentosRegistry() {

	}

	/* Estamos preenchendo o mapa em tempo de compilação, de antemão, e adicionando
	 * ele no registry, assim, não temos que criar, por exemplo, uma subclasse
	 * chamada de "PDFPublico", "PDFPrivado" e etc. */

	static {
		Documento d1 = new Documento();
		d1.type = "PDF";
		d1.visibility = "RESTRICT";
		REGISTRY.put("PDF RESTRITO", d1);

		Documento d2 = new Documento();
		d1.type = "PDF";
		d1.visibility = "PUBLIC";
		REGISTRY.put("PDF PÚBLICO", d2);

		Documento d3 = new Documento();
		d1.type = "DOC";
		d1.visibility = "RESTRICT";
		REGISTRY.put("DOC RESTRITO", d3);

		Documento d4 = new Documento();
		d1.type = "DOC";
		d1.visibility = "PUBLIC";
		REGISTRY.put("DOC PÚBLICO", d4);
	}

	public static DocumentosRegistry getInstance() {

		return INSTANCE;
	}

	/* No exemplo acima, estamos pegando o documento no formato pedido, chamando um
	 * clone desse documento e devolvendo esse objeto da forma desejada. Claro que o
	 * atributo "chave" deveria ser um enum ao invés de uma string. */
	public Documento getDocumento(String chave) {

		try {
			return REGISTRY.get(chave)
			               .clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
