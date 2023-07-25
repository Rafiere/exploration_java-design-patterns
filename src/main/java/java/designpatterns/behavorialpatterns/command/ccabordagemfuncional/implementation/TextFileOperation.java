package java.designpatterns.behavorialpatterns.command.ccabordagemfuncional.implementation;

/* Essa interface define a API dos objetos do "command", e as duas
* implementações performam as ações concretas. Uma ação serve para salvar
* um texto, e outra serve para abrir um texto. */

/* A "TextFileOperation" encapsula TODAS as informações necessárias para
* abrir e salvar um texto, incluindo o objeto recebido, os métodos para
* chamar e os argumentos. Nesse exemplo, nenhum argumento é requerido, mas
* poderia existir a necessidade. */

/* O componente que performará a ação é o "receiver", ou seja, a instância
* de "TextFile". */
public interface TextFileOperation {

	String execute();
}
