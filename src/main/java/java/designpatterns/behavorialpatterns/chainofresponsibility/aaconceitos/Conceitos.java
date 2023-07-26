package java.designpatterns.behavorialpatterns.chainofresponsibility.aaconceitos;

public class Conceitos {

	/* Ele é um padrão para desacoplar o envio e o recebimento de um command e para
	 * escolher uma estratégia de processamento em runtime. */

	/* Basicamente, enviamos uma requisição para vários handlers. O primeiro handler verificará se
	 * consegue resolver o problema. Se não conseguir, passará para o segundo. Se ele não conseguir, passará
	 * para o terceiro, até que o problema seja resolvido. Qualquer um dos handlers possui o poder de
	 * interromper a corrente de handlers e parar o processamento. */
}
