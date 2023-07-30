package java.designpatterns.structuralpatterns.decorator.eedecoratorcompleto.implementation;

public class EnderecadorComBorda extends EnderecadorDecorator {

	public EnderecadorComBorda(Enderecador enderecador) {

		super(enderecador);
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
