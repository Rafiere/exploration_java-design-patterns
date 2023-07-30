package java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.remotes;

import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices.Device;

/* Essa classe mantém uma referência para a interface de um objeto da
* outra hierarquia, ou seja, faz a "ponte" entre eles, e delega todo
* o trabalho para esse objeto. */
public class BasicRemote implements Remote {

	protected Device device;

	public BasicRemote(){}

	public BasicRemote(Device device){
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");

		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	@Override
	public void volumeDown() {
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp() {
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown() {
		System.out.println("Remote: channel down");
		device.setChannel(device.getChannel() - 1);
	}

	@Override
	public void channelUp() {
		System.out.println("Remote: channel up");
		device.setChannel(device.getChannel() + 1);
	}
}
