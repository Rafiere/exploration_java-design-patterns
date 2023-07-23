package java.designpatterns.singleton.ccmetodolazy;

public class MetodoLazy {

	/* A primeira vez que o "getRuntime()" for chamado, será atribuído um valor
	* para a instância, nas outras vezes, será retornada a mesma instância. Assim, a
	* instância só é inicializada quando ela for chamada. */

	/* Inicialmente, a otimização pode ser bem baixa, porém, para a JDK ou para
	* um framework que utilize muitos Singletons, não é recomendado utilizar a
	* alternativa "AA". */
}
