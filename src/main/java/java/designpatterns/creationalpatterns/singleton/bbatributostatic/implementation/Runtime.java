package java.designpatterns.creationalpatterns.singleton.bbatributostatic.implementation;

public class Runtime {

	private static final Runtime CURRENT_RUNTIME = new Runtime();

	/* Como estamos criando um singleton, o construtor dessa classe é
	* privado, assim, ele terá uma única instância, que está no objeto
	* "CURRENT_RUNTIME" que foi instanciado acima. */

	/* O construtor é privado pois, dessa forma, nenhuma classe, tirando ela
	* mesma, poderá instanciar um objeto do seu tipo. */

	/* Dessa forma, essa será a única instância possível dessa classe na
	* aplicação. */
	private Runtime(){

	}

	public static Runtime getRuntime(){
		return CURRENT_RUNTIME;
	}
}
