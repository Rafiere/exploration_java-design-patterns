package java.designpatterns.behavorialpatterns.observer.bbexemploloja.implementation;

public class Store {

	/* Esse serviço de notificação deverá ter as pessoas que queiram receber essas notificações
	* por email sempre que um novo produto chegar. */
	private final NotificationService notificationService;

	public Store(){
		notificationService = new NotificationService();
	}

	/* Quando um novo item chegar na loja, teremos que notificar todos os clientes que
	* estão inscritos nessa lista. */
	public void newItemPromotion(){
		notificationService.notify();
	}

	public NotificationService getService(){
		return notificationService;
	}
}
