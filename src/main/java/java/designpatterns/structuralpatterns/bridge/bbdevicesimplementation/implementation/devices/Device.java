package java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.devices;

/* Essa interface declara os métodos comuns para todas as classes que
* a implementarão, dessa forma, todos os dispositivos funcionarão com
* todos os "remotes". */
public interface Device {

	boolean isEnabled();
	void enable();
	void disable();
	int getVolume();
	void setVolume(int percent);
	int getChannel();
	void setChannel(int channel);
	void printStatus();
}
