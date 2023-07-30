package java.designpatterns.structuralpatterns.decorator.ccdecoratorcominterface;

/* Se temos uma classe que espera um endereçador, nesse exemplo, não importa qual é a
* implementação de endereçador que vamos usar, por isso, estamos utilizando uma interface. */

public class Execucao {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Teste", "Teste", "Teste", "Teste", "Teste");

		/* Nesse exemplo, podemos trocar a implementação de endereçador que será
		* utilizado. */

		Enderecador enderecador = new EnderecadorSimples();
		 enderecador = new EnderecadorCaixaAlta(enderecador);

		String enderecoFormatado = enderecador.preparaEndereco(endereco);

		System.out.println(enderecoFormatado);
	}
}
