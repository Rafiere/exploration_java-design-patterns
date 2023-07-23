package java.designpatterns.singleton.eeenum;

public class Enum {

	/* Atualmente, a utilização do padrão "Singleton" com enums é a melhor forma
	* de implementar um "Singleton" no Java. */

	/* Dessa forma, não temos problemas de multithread, pois o Java lida com isso, não
	* temos problemas de serialização e etc. Se não podemos usar nada "lazy", a utilização
	* de um "Enum" para esse padrão é a mais recomendada. */
}
