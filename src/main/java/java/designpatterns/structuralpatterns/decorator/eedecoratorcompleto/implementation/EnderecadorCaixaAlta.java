package java.designpatterns.structuralpatterns.decorator.eedecoratorcompleto.implementation;

public class EnderecadorCaixaAlta extends EnderecadorDecorator {

	public EnderecadorCaixaAlta(Enderecador enderecador) {

		super(enderecador);
	}

	@Override
	public String preparaEndereco(Endereco endereco) {

		return enderecador.preparaEndereco(endereco).toUpperCase();
	}
}
