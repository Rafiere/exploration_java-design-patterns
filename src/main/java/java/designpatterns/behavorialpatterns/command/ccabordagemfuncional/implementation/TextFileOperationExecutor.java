package java.designpatterns.behavorialpatterns.command.ccabordagemfuncional.implementation;

import java.util.ArrayList;
import java.util.List;

/* Essa classe é um invoker. Um invoker é um objeto que sabe como executar o
* comando, mas não sabe como ele foi implementado. Basicamente, ele conhece
* apenas a interface do comando. */
public class TextFileOperationExecutor {

	private final List<TextFileOperation> operations = new ArrayList<>();

	/* Essa é uma camada de desacoplamento que serve apenas para separar os
	* objetos "Command" dos seus consumidores. */

	/* A lista das operações não é obrigatória. Poderíamos não ter ela, também. */
	public String executeOperation(TextFileOperation operation){
		operations.add(operation);
		return operation.execute();
	}
}
