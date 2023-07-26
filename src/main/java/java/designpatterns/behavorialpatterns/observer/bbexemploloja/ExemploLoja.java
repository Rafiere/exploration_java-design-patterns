package java.designpatterns.behavorialpatterns.observer.bbexemploloja;

public class ExemploLoja {

	/* Nesse exemplo, temos os consumidores e uma loja. O consumidor está muito interessado em
	* um tipo de iPhone que vai lançar na loja. Os consumidores podem visitar a loja todos os
	* dias, para verificar se o smartphone chegou, ou a loja pode enviar para todos os clientes um
	* email sempre que um novo produto entrar na loja, o que seria considerado um spam, pois
	* muitos clientes não estariam interessados em saber disso. */

	/* Dessa forma, com o padrão Observer, podemos notificar apenas os clientes que estão
	* inscritos para receberem a mensagem de que o determinado celular chegou na loja. */

	/* Essa abordagem é recomendada ao invés de utilizarmos apenas uma lista para salvar os
	* clientes, porque ela é facilmente extensível. Caso tenhamos que enviar um outro tipo
	* de notificação, além de um email, como uma mensagem de texto no
	* celular, basta criarmos um outro listener que enviará a notificação. */

}
