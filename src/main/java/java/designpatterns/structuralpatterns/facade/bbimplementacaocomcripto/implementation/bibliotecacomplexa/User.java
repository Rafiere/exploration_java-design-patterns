package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

/* O objetivo dessa classe é simular uma biblioteca complexa na qual o
 * padrão "facade" criará um ponto único para abstrair a lógica de
 * acesso que é necessária para essa biblioteca. */
public class User {

	private String id;
	private String name;
	private double balance;
	private String currency;
	private String accountNbr;

	public User(String id, String name, double balance, String currency, String accountNbr) {

		this.id = id;
		this.name = name;
		this.balance = balance;
		this.currency = currency;
		this.accountNbr = accountNbr;
	}

	public double getBalance() {

		return balance;
	}
}
