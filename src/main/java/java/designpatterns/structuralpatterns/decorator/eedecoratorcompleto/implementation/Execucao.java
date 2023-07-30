package java.designpatterns.structuralpatterns.decorator.eedecoratorcompleto.implementation;

public class Execucao {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Teste", "Teste", "Teste", "Teste", "Teste");

		Enderecador enderecador = new EnderecadorSimples();
		enderecador = new EnderecadorCaixaAlta(enderecador);
		enderecador = new EnderecadorComBorda(enderecador);

		String formattedAddress = enderecador.preparaEndereco(endereco);

		System.out.println(formattedAddress);
	}
}
