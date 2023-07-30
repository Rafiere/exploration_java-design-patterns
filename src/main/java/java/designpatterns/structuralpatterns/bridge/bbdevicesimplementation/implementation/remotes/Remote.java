package java.designpatterns.structuralpatterns.bridge.bbdevicesimplementation.implementation.remotes;

/* A abstração define a interface para o "remote". Todos os "remotes"
* deverão implementar essa interface. */
public interface Remote {

	void power();
	void volumeDown();
	void volumeUp();
	void channelDown();
	void channelUp();
}
