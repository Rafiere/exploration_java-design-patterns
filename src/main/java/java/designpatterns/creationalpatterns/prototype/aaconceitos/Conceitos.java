package java.designpatterns.creationalpatterns.prototype.aaconceitos;

public class Conceitos {

	/* É um padrão simples que contém uma interface, que define um método
	* de clonagem e várias implementações concretas que implementam essa
	* interface. */

	/* O Java já possui a interface "Cloneable", para implementar esse padrão, mas isso
	* possui benefícios e malefícios. */

	/* O prototype serve para resolvermos o problema de, ao criarmos subclasses que possuem
	* pouca diferença da classe em que eles estão herdando, podemos utilizar o prototype, criando
	* vários protótipos e deixando eles prontos, para que póssamos apenas clonar quando necessário. */

	/* Isso deve ser utilizado apenas quando essas especializações forem criadas em tempo de execução, e não em
	* tempo de compilação. */

	/* Normalmente, temos o "Prototype", que é a interface "Cloneable", temos os protótipos, que
	* são as classes que implementam as interfaces de protótipo, e o cliente, que é quem está
	* utilizando o protótipo. */
}
