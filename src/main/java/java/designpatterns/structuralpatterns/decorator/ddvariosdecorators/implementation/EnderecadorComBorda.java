package java.designpatterns.structuralpatterns.decorator.ddvariosdecorators.implementation;

/* Esse é um dos decorators. */

public class EnderecadorComBorda implements Enderecador {

	Enderecador enderecador;

	public EnderecadorComBorda(Enderecador enderecador){
		super();
		this.enderecador = enderecador;
	}

	@Override
	public String preparaEndereco(Endereco endereco) {

		String preparaEndereco = enderecador.preparaEndereco(endereco);

		StringBuilder sb = new StringBuilder();

		sb.append("---");
		preparaEndereco.lines().forEach(l -> sb.append("| " + l + " |"));
		sb.append("---");

		return sb.toString();
	}
}
