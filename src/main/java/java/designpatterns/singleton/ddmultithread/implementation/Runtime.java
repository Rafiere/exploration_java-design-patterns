package java.designpatterns.singleton.ddmultithread.implementation;

public class Runtime {

	private static Runtime instance;

	private Runtime(){

	}

	/* Essa é a alternativa thread-safe, porém, não é a alternativa
	* thread-safe mais performática. */
	public static synchronized Runtime getInstance(){
		if(instance == null){
			instance = new Runtime();
		}
		return instance;
	}
}
