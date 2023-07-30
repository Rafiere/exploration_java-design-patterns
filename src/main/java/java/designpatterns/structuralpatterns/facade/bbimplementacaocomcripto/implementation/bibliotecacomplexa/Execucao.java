package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

import java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.BuyCriptoFacade;

/* Como estamos usando o padrão de projeto "facade", nesse exemplo, o
* código de acesso à biblioteca de criptomoedas está completamente dentro
* do "facade", assim, o cliente, que é a classe "Execucao", precisa apenas
* chamar o "Facade" para acessar a regra de negócio requerida para acessar um
* determinado método de uma biblioteca. */

public class Execucao {

	public static void main(String[] args) {

		BuyCriptoFacade buyCriptoFacade = new BuyCriptoFacade();

		buyCriptoFacade.buyCryptoCurrency(1000, "BTC");
	}
}
