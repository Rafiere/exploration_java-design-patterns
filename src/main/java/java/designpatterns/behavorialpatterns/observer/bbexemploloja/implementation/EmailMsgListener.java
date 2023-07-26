package java.designpatterns.behavorialpatterns.observer.bbexemploloja.implementation;

public class EmailMsgListener implements EventListener {

	private final String email;

	public EmailMsgListener(String email){
		this.email = email;
	}


	public void update(){
		/* Esse método enviará realmente o email. Será a ação que será executada para todos
		* os clientes que estão inscritos. */
	}
}
