package java.designpatterns.structuralpatterns.decorator.bbdecoratorsimples.implementation;

/* Essa classe é o decorator. Basicamente, ele serve para adicionar uma funcionalidade
* a mais para o "EnderecadorSimples". */
public class EnderecadorCaixaAlta {

	EnderecadorSimples enderecadorSimples;

	public EnderecadorCaixaAlta(EnderecadorSimples enderecadorSimples) {

		super();
		this.enderecadorSimples = enderecadorSimples;
	}

	/* Primeiramente, esstamos chamando o "EnderecadorSimples", para, após isso, aplicarmos
	* a especificidade desse método, que adiciona uma funcionalidade a mais para o EnderecadorSimples. */
	public String preparaEndereco(Endereco endereco) {

		return enderecadorSimples.preparaEndereco(endereco)
		                         .toUpperCase();
	}
}