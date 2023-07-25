package java.designpatterns.behavorialpatterns.command.ccabordagemfuncional.implementation;

public class Execucao {

	public static void main(String[] args) {

		/* Como a "TextFileOperation" é uma interface funcional, podemos passar
		* "command objects" na forma de expressões lambdas para o invoker, sem
		* termos que criar as instâncias da operação manualmente. */

		/* Essa implementação é melhor, porque escrevemos menos código, mas, se
		* o código for muito longo, ao realizar a implementação direta, a expressão
		* lambda pode ficar muito grande. */

		/* Usando Expressões Lambda */

		TextFileOperationExecutor executor = new TextFileOperationExecutor();

		executor.executeOperation(() -> "Abrindo um arquivo!");
		executor.executeOperation(() -> "Salvando um arquivo!");

		/* Usando method references */

		/* Nesse caso, a implementação é um pouco mais verbosa do que usar
		* lambdas, mas ainda temos que criar instâncias de "TextFile". */

		TextFileOperationExecutor executor2 = new TextFileOperationExecutor();

		TextFile textFile = new TextFile();

		executor2.executeOperation(textFile::open);
		executor2.executeOperation(textFile::save);
	}
}
