package java.designpatterns.creationalpatterns.prototype.eesemcloneable.implementation;

import java.designpatterns.creationalpatterns.prototype.ddregistrydinamico.implementation.DocumentosRegistry;

final public class Documento {

	String nome;
	String visibility;
	String type;
	String localizacao;

	public Documento(){

	}

	/* Abaixo, é uma das alternativas seguras ao uso do "clone()" no Java. Estamos
	* utilizando um construtor que recebe um objeto e realiza esse clone. */
	public Documento(Documento documento){
		this.nome = documento.nome;
		this.visibility = documento.visibility;
		this.type = documento.type;
		this.localizacao = documento.localizacao;
	}

	/* Abaixo, temos outra alternativa mais segura ao uso do clone, que consiste em
	* utilizarmos um "static factory method" que retorna um novo documento ao receber
	* um documento. Ela é uma implementação um pouco menos performática, mas compensa
	* os problemas que podemos ter ao usar o "Cloneable". */
	public static Documento clone(Documento documento){
		Documento clone = new Documento();
		clone.nome = documento.nome;
		clone.visibility = documento.visibility;
		clone.type = documento.type;
		clone.localizacao = documento.localizacao;
		return clone;
	}
}
