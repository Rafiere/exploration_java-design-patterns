package java.designpatterns.singleton.ccmetodolazy.implementation;

public class Execucao {

	public static void main(String[] args) {

		/* O "getInstance()" sempre retornará a mesma instância.  */
		Runtime runtime = Runtime.getInstance();
	}
}
