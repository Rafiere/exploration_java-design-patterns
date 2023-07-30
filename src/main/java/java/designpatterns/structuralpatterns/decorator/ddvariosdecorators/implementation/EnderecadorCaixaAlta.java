package java.designpatterns.structuralpatterns.decorator.ddvariosdecorators.implementation;

/* Esse é um dos decorators. */

public class EnderecadorCaixaAlta implements Enderecador {

	Enderecador enderecador;

	public EnderecadorCaixaAlta(Enderecador enderecador){
		super();
		this.enderecador = enderecador;
	}

	@Override
	public String preparaEndereco(Endereco endereco) {

		return enderecador.preparaEndereco(endereco).toUpperCase();
	}
}
