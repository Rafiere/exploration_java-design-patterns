package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

/* O objetivo dessa classe é simular uma biblioteca complexa na qual o
 * padrão "facade" criará um ponto único para abstrair a lógica de
 * acesso que é necessária para essa biblioteca. */
public class CryptoFactory {

	public static CryptoService getCryptoService(String currency){
		if(currency.equals("BTC")){
			return new BitcoinService();
		} else if (currency.equals("ETH")){
			return new EthereumService();
		} else {
			return null;
		}
	}
}
