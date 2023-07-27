package java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.state;

import java.designpatterns.behavorialpatterns.state.bbphoneexample.implementation.Phone;

public class ReadyState extends State {

	public ReadyState(Phone phone) {

		super(phone);
	}

	@Override
	public String onHome() {

		return phone.home();
	}

	@Override
	public String onOffOn() {

		phone.setState(new OffState(phone));
		return phone.lock();
	}
}
