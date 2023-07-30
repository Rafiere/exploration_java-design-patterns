package java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.remotes;

import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device){
		super.device = device;
	}

	public void mute(){

		System.out.println("Remove: mute");
		device.setVolume(0);
	}
}
