package java.designpatterns.singleton.bbatributostatic;

import java.designpatterns.singleton.bbatributostatic.implementation.Runtime;

public class AtributoStatic {

	/* É a forma mais comum de Singleton. Para isso, devemos ter um construtor
	* privado, para que ninguém mais possa instanciar uma classe, a não ser ela
	* mesma, e termos um atributo com os modificadores "public static final" que
	* está se autoinstanciando. */

	/* Com isso, teremos apenas uma única instância dessa classe na aplicação. */

	/* Com o uso de reflection, conseguimos ignorar o construtor privado, mas, ao
	* usarmos reflection, podemos quebrar quase qualquer tipo de encapsulamento, então
	* esse não é um bom parâmetro. */

	public static void main(String[] args) {

		/* Abaixo, temos a única instância de "runtime" na aplicação inteira. */

		Runtime runtime = Runtime.getRuntime();
	}
}
