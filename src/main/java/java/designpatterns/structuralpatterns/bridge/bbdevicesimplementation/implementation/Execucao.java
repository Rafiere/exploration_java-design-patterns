package java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation;

import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices.Device;
import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices.Radio;
import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices.TV;
import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.remotes.AdvancedRemote;
import java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.remotes.BasicRemote;

public class Execucao {

	public static void main(String[] args) {

		testDevice(new TV());
		testDevice(new Radio());
	}

	/* Graças ao uso do bridge, ambos os "remotes" podem funcionar com
	* os dispositivos diferentes, e vice-versa, assim, podemos criar
	* quantos "remotes" e "devices" quisermos, desde que sigamos
	* a estrutura definida, e qualquer "remote" funcionará com
	* qualquer "device". */

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
