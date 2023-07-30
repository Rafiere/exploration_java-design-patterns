package java.designpatterns.structuralpatterns.composite.bbboxexample.implementation;

/* Estamos chamando o serviço de delivery para calcular o valor do pedido que
* contém várias caixas dentro dele. */

public class Execucao {

	public static void main(String[] args) {

		DeliveryService deliveryService = new DeliveryService();

		deliveryService.setupOrder(new CompositeBox(new VideoGame("1", 100)),
		                           new CompositeBox(new CompositeBox(new Book("2", 200), new Book("3", 300)),
		                                            new VideoGame("4", 500),
		                                            new VideoGame("5", 500)));

		deliveryService.calculateOrderPrice();
	}
}
