package java.designpatterns.behavorialpatterns.mediator;

public class Mediator {

	/* Esse é um padrão que permite a redução de dependências entre
	* objetos. Esse padrão restringe diretamente as comunicações entre
	* os objetos e os força a colaborar apenas através de um objeto
	* "mediator". */

	/* Esse padrão sugere que os objetos não devem se comunicarem entre
	* si, ao invés disso, eles devem colaborar indiretamente, chamando um objeto
	* "mediator" especial que redireciona as chamadas para os componentes apropriados. Dessa
	* forma, os componentes dependem apenas de uma classe "mediator", ao invés de dependerem
	* de dezenas de classes. */

	/* Basicamente, esse padrão permite encapsularmos uma teia de relações complexas entre
	* vários objetos dentro de um único objeto "mediator". As poucas dependências que uma
	* classe tem, acabam a tornando fácil de extender ou reutilizar. */
}
