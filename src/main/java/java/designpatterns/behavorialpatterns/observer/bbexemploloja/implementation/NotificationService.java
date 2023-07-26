package java.designpatterns.behavorialpatterns.observer.bbexemploloja.implementation;

import java.util.ArrayList;
import java.util.List;

/* Essa classe é o publisher. Ela contém uma infraestrutura de inscrição, que permite que
* inscritos sejam adicionados ou removidos da lista de listeners. */
public class NotificationService {

	/* A lista abaixo é a lista de clientes que querem receber a notificação. Quando um
	* novo evento ocorrer, todos os clientes receberão a notificação. */
	private final List<EventListener> customers;

	public NotificationService(){
		customers = new ArrayList<>();
	}

	/* Esse método adicionará um cliente na lista dos que querem receber a notificação sempre
	* que um produto chegar. */
	public void subscribe(EventListener eventListener){
		customers.add(eventListener);
	}

	/* Esse método removerá um cliente da lista dos clientes que querem receber uma notificação
	* sempre que um produto chegar. */
	public void unsubscribe(EventListener eventListener){
		customers.remove(eventListener);
	}

	public void notifyCustomers(){
		customers.forEach(EventListener::update);
	}
}
