package java.designpatterns.structuralpatterns.decorator.ccdecoratorcominterface.implementation;

/* Esse decorator continua acrescentando uma funcionalidade a mais
* em volta, que é adicionar a "caixa alta" no retorno do endereçador. */

/* Só que, agora, estamos usando a interface para podermos utilizar o decorator com
* os diferentes tipos do Decorator. */
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
