package java.designpatterns.behavorialpatterns.command.bbabordagemoop.implementation;

/* Abaixo, temos um cliente. Ele é um objeto que controla a execução do
* comando, especificando quais comandos devem ser executados. */

public class Execucao {

	public static void main(String[] args) {

		TextFileOperationExecutor executor = new TextFileOperationExecutor();

		/* Dentro do "TextFileOperation", vamos passar tudo o que ele precisa
		* ter para executar a ação de abrir o texto. */
		executor.executeOperation(new OpenTextFileOperation());

		/* Abaixo, vamos passar tudo o que ele precisa ter para conseguir salvar
		* o texto. */
		executor.executeOperation(new SaveTextFileOperation());
	}
}
