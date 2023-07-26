package java.designpatterns.behavorialpatterns.observer.bbexemploloja.implementation;

public class Execucao {

	public static void main(String[] args) {

		Store store = new Store();

		store.getService().subscribe(new EmailMsgListener("Teste"));
		store.getService().subscribe(new EmailMsgListener("Teste2"));
		store.getService().subscribe(new SMSListener("Teste 3"));

		/* Estamos enviando a notificação para todos os clientes que estão inscritos. */
		store.newItemPromotion();
	}
}
