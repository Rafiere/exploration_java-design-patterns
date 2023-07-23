package java.designpatterns.strategy.eeexemplocomlambdas.implementation;

import java.util.List;

public class Execucao {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1L, "Rafa");
		Cliente cliente2 = new Cliente(1L, "Testando");
		Cliente cliente3 = new Cliente(1L, "Testador");

		List<Cliente> clientes = List.of(cliente1, cliente2, cliente3);

		/* Abaixo, temos um exemplo de uso do design pattern de
		* strategy juntamente com lambdas. Estamos encapsulando o
		* algoritmo, pois a classe de comparação não precisa conhecer
		* nada do mundo externo. */
		clientes.sort((e1, e2) -> e1.id.compareTo(e2.id));
	}
}
