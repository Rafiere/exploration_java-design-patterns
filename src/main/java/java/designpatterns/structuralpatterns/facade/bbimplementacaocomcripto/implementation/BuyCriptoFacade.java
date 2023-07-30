package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation;

import java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa.CryptoFactory;
import java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa.DatabaseService;
import java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa.UIService;
import java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa.User;

/* O objetivo de um facade é evitar a duplicação de código complexo para
 * acessar uma determinada biblioteca ou sistema externo, assim, centralizamos
 * todo o código complexo em um único local. */

/* Dessa forma, sempre que uma parte de nosso código precisar acessar esse
 * código complexo, ele fará o acesso por meio do facade. */

public class BuyCriptoFacade {

	public void buyCryptoCurrency(double amount, String currency){

		DatabaseService dbService = new DatabaseService();

		User user = dbService.getUser(UIService.getLoggedInUserId());

		if(user.getBalance() < amount){
			System.out.println("O usuário " + user + " tem um balanço insuficiente para completar a transação. ");
		}
		CryptoFactory.getCryptoService(currency);
	}
}
