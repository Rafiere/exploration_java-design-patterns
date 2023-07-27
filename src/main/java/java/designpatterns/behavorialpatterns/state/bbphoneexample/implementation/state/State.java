package java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.state;

import java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.Phone;

/* Essa classe terá uma instância do objeto que ela está representando, e dois
* métodos. Cada um dos métodos representa um botão. Eles agirão de forma diferente de
* acordo com o estado. */
public abstract class State {

	protected Phone phone;

	public State(Phone phone) {
		this.phone = phone;
	}

	public abstract String onHome();

	public abstract String onOffOn();

}
