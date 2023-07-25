package java.designpatterns.creationalpatterns.builder.ccimplementacaobuilderexterno.implementation;

public class Execucao {

	public static void main(String[] args) {

		var address = AddressBuilder.builder()
		                            .street("Rua Teste")
		                            .complement("Testando!")
		                            .build();

		System.out.println(address);
	}
}
