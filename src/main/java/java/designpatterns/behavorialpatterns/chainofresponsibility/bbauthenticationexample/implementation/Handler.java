package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

/* Essa classe abstrata será herdada por todos os handlers. O atributo "next()" definirá qual
* será o próximo handler que será chamado. O "setNextHandler()" serve para definirmos o próximo
* handler, o método "handle()" deverá ser implementado, e o método "handleNext()" */
public abstract class Handler {

	private Handler next;

	public Handler setNextHandler(Handler next){
		this.next = next;
		return next;
	}

	public abstract boolean handle(String username, String password);

	/* O método abaixo servirá para passarmos para o próximo handler, a não ser que
	* o próximo handler seja nulo. */
	protected boolean handleNext(String username, String password){
		if(next == null){
			return true;
		}
		return next.handle(username, password);
	}
}
