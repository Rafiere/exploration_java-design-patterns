package java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation;

import java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.state.OffState;
import java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.state.State;

/* Essa classe guardará o estado do celular. */

/* Ela é chamada de "context". Ela guardará uma referência para o seu estado. */
public class Phone {

	private State state;

	public Phone() {
		state = new OffState(this);
	}

	public void setState(State state) {
		this.state = state;
	}

	public String lock() {
		return "Locking phone and turning off the screen";
	}

	public String home() {
		return "Going to home-screen";
	}

	public String unlock() {
		return "Unlocking the phone to home";
	}

	public String turnOn() {
		return "Turning screen on, device still locked";
	}

	public String clickHome() {
		return state.onHome();
	}

	public String clickPower() {
		return state.onOffOn();
	}
}
