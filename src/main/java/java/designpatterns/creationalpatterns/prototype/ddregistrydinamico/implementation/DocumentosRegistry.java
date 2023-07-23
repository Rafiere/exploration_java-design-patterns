package java.designpatterns.creationalpatterns.prototype.ddregistrydinamico.implementation;

import java.util.HashMap;
import java.util.Map;

public class DocumentosRegistry {

	/* Ao contrário do exemplo "CC", esse registro iniciará vazio e, em tempo de
	* execução, os registros serão adicionados nele através do método "addDocumento()". */

	private static final DocumentosRegistry INSTANCE = new DocumentosRegistry();
	private static final Map<String, Documento> REGISTRY = new HashMap<>();

	private DocumentosRegistry(){

	}

	public static DocumentosRegistry getInstance(){
		return INSTANCE;
	}

	public Documento getDocumento(String chave){
		try {
			return REGISTRY.get(chave).clone();
		} catch (CloneNotSupportedException e){
			throw new RuntimeException(e);
		}
	}

	/* Esse método serve para adicionar novos documentos no registro de protótipos. */
	public Documento addDocumento(String chave, Documento documento){
		return REGISTRY.put(chave, documento);
	}
}
