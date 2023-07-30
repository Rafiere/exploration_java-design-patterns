package java.designpatterns.structuralpatterns.decorator.ddvariosdecorators.implementation;

public class Execucao {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Teste", "Teste", "Teste", "Teste", "Teste");

		Enderecador enderecador = new EnderecadorSimples();
		enderecador = new EnderecadorComBorda(enderecador);
		enderecador = new EnderecadorCaixaAlta(enderecador);

		String enderecoFormatado = enderecador.preparaEndereco(endereco);

		System.out.println(enderecoFormatado);
	}
}
