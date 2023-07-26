package java.designpatterns.behavorialpatterns.observer.bbexemploloja.implementation;

public class SMSListener implements EventListener {

	private final String username;

	public SMSListener(String username){
		this.username = username;
	}

	@Override
	public void update() {
		/* Método que enviará o SMS. */
	}
}
