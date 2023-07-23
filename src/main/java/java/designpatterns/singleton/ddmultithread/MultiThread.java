package java.designpatterns.singleton.ddmultithread;

public class MultiThread {

	/* Em um cenário multithread, ao utilizarmos o método "lazy", se duas threads
	* pedirem, ao mesmo tempo, a instância desse objeto, pode acontecer de duas
	* instâncias serem criadas, ao invés de apenas uma. */

	/* Basicamente, o cenário "CC" não é thread-safe. */

	/* A forma mais fácil de impedir isso, porém, não sendo uma forma otimizada, é
	* utilizarmos o modificador "synchronized" no método "getInstance()". */
}
