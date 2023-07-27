package java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.state;

import java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.Phone;

/* Essa é uma implementação de um estado. Ela implementará os métodos que representam os
* botões e, para cada botão que for clicado nesse determinado estado, ela estará programando uma
* ação para ele. */
public class LockedState extends State {

	public LockedState(Phone phone){
		super(phone);
	}

	@Override
	public String onHome() {

		phone.setState(new ReadyState(phone));
		return phone.unlock();
	}

	@Override
	public String onOffOn() {

		phone.setState(new ReadyState(phone));
		return phone.lock();
	}
}
