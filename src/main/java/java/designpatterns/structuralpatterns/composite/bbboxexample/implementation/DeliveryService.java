package java.designpatterns.structuralpatterns.composite.bbboxexample.implementation;

/* Estamos usando esse serviço para calcular o valor de uma
* caixa. Uma caixa pode ter outras caixas dentro, e, caso realmente
* tenham, os valores delas (e dos produtos que estão dentro delas) também
* serão calculados. */

public class DeliveryService {

	private Box box;

	public DeliveryService(){}

	public void setupOrder(Box... boxes){
		this.box = new CompositeBox(boxes);
	}

	public double calculateOrderPrice(){
		return box.calculatePrice();
	}
}
