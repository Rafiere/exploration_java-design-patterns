package java.designpatterns.structuralpatterns.proxy;

public class Proxy {

	/* No padrão "proxy", temos o "RealSubject" e o
	* "Proxy". */

	/* Ele é uma entidade que recebe uma chamada, faz diversas coisas
	* com ela e retorna para quem chamou. */

	/* Ele é um padrão muito flexível e abre muitas possibilidades. */

	/* Uma das vantagens desse padrão é que não precisamos mexer nas implementações que
	* já estão prontas. */

	/* Exemplos reais: */

	/* O "@Autowired" utiliza o padrão proxy. A instância que é injetada não é uma
	* instância da classe, e sim uma subclasse, que é um proxy, assim, é injetado um
	* proxy. Isso acontece pois alguns frameworks fornecem um interceptador, por
	* exemplo. Para esse interceptador ser chamado, temos que fazer uma chamada para a
	* implementação do proxy criado do framework, para, após isso, chamar a implementação
	* real do método. */

	/* O pacote RMI do Java também utiliza isso. */

	/* Vantagens: */

	/* 1. Conseguimos aplicar sem mexer no cliente e na implementação original. */

	/* Desvantagens: */

	/* 1. Estamos criando mais classes. */

	/* 2. É importante entendermos que cada proxy inserido no caminho acaba tornando as operações
	* muito mais lentas. */
}
