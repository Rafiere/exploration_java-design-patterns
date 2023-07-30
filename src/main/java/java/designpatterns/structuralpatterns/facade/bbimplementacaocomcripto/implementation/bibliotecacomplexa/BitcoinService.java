package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

/* O objetivo dessa classe é simular uma biblioteca complexa na qual o
* padrão "facade" criará um ponto único para abstrair a lógica de
* acesso que é necessária para essa biblioteca. */

public class BitcoinService extends CryptoService {

	@Override
	void buyCurrency(User user, double amount) {
		System.out.println("Simulando a compra de um currency..");
	}
}
