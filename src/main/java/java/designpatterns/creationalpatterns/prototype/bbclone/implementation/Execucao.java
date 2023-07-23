package java.designpatterns.creationalpatterns.prototype.bbclone.implementation;

public class Execucao {

	public static void main(String[] args) throws CloneNotSupportedException {

		/* Ao chamarmos o método "clone()", estamos passando a chamada dessa
		 * implementação para a classe-mãe, que é a classe "Object". O clone será
		 * feito, e, depois disso, o casting converterá, novamente, para o tipo
		 * "Documento". */

		Documento d = new Documento();

		d.nome = "ListaDeMembros.pdf";
		d.type = "PDF";
		d.visibility = "restrict";
		d.localization = "files.teste";

		System.out.println(d);

		System.out.println("----");

		/* Estamos imprimindo um objeto exatamente igual ao objeto "d1", ou seja, com
		* as mesmas propriedades. */
		Documento d2 = d.clone();
		System.out.println(d2);


		/* Se alterarmos o nome do objeto "d2", apenas o objeto "d2" será alterado, ou
		* seja, temos um objeto completamente separado do objeto "d1". */
		d2.nome = "Lista2.pdf";

		System.out.println(d);
		System.out.println(d2);
	}
}
