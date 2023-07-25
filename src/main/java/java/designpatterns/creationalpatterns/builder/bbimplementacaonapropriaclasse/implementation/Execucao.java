package java.designpatterns.creationalpatterns.builder.bbimplementacaonapropriaclasse.implementation;

public class Execucao {

	public static void main(String[] args) {

		/* Estamos criando o builder para montar objeto por
		* objeto nessa classe. */

		var address = Address.builder()
				.complement("A")
				.street("AA");

		System.out.println(address);
	}
}
