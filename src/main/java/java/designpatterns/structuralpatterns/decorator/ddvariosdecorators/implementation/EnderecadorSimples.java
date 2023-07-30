package java.designpatterns.structuralpatterns.decorator.ddvariosdecorators.implementation;

/* Esse é um dos decorators. */

public class EnderecadorSimples implements Enderecador {

	@Override
	public String preparaEndereco(Endereco endereco){

		StringBuilder sb = new StringBuilder();
		sb.append(endereco.logradouro);
		sb.append(endereco.bairro);
		sb.append(endereco.cidade);
		sb.append(endereco.uf);
		sb.append(endereco.cep);
		return sb.toString();
	}
}
