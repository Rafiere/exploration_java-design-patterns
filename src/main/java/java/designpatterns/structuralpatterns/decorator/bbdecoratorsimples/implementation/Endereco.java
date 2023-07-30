package java.designpatterns.structuralpatterns.decorator.bbdecoratorsimples.implementation;

public class Endereco {

	final String logradouro;
	final String bairro;
	final String cidade;
	final String uf;
	final String cep;

	public Endereco(String logradouro, String bairro, String cidade, String uf, String cep) {

		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
}
