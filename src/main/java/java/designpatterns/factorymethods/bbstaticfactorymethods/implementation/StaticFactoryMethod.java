package java.designpatterns.factorymethods.bbstaticfactorymethods.implementation;

import java.util.Calendar;
import java.util.List;

public class StaticFactoryMethod {

	public static void main(String[] args){

		/* Os statics factory methods são métodos criadores, mas são estáticos. Ele é
		* a forma mais simples de utilizarmos os factory methods, e são a forma mais
		* comum desse padrão que vamos encontrar. */

		/* O método abaixo criará uma instância padrão de "Calendar" e a retornará. */
		Calendar.getInstance();

		/* Vantagens */

		/* 1. Quando temos um factory method, conseguimos fornecer um nome para
		* o construtor, como "List.of()", por exemplo. Assim, deixaremos explícita a
		* lógica do método. */

		/* 2. Podemos ter uma flexibilidade para criarmos as instâncias, assim, podemos
		* utilizar lógicas personalizadas para a criação de objetos, como, no exemplo
		* abaixo, que o método "Integer.valueOf()" verifica o limite mínimo ou
		* máximo. */

		Integer número = Integer.valueOf("1234");

		/* 3. O método "List.of()" retorna um objeto do tipo "ListN", que é uma classe
		* concreta, mas como estamos abstraindo com a utilização do "List.of()", não
		* precisamos ficar sabendo disso, pois ele esconde a implementação e apenas
		* retorna um objeto que poderá ser usado como desejado. */

		var lista = List.of(1, 2, 3, 4);
	}
}
