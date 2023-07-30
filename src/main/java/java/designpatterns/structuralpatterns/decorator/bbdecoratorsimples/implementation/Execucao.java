package java.designpatterns.structuralpatterns.decorator.bbdecoratorsimples.implementation;

public class Execucao {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Teste", "Teste", "Teste", "Teste", "Teste");

		/* O problema com essa implementação é que os endereçadores não compartilham
		* nenhuma interface. */

		EnderecadorSimples enderecadorSimples = new EnderecadorSimples();
		EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecadorSimples);

		String enderecoFormatado = enderecadorCaixaAlta.preparaEndereco(endereco);

		System.out.println(enderecoFormatado);
	}
}
