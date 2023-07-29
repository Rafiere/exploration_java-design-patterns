package java.designpatterns.structuralpatterns.proxy.ddproxyparalazy.implementation;

public class Execucao {

	public static void main(String[] args) {

		IProdutoDAO produtoDAO = new LazyProdutoDAO();

		ProdutoService produtoService = new ProdutoService(produtoDAO);

		System.out.println("Produto service criado!");

		/* Como não estamos utilizando os métodos abaixo, não precisamos inicializar
		* o objeto por completo. Apenas se utilizássemos o "buscarProduto()", teríamos
		* que inicializar o método "find()", como está sendo feito no proxy, garantindo
		* a lazy inicialization. */

//		produtoService.buscarProduto(1);
//		produtoService.buscarProduto(2);
//		produtoService.buscarProduto(3);

		/* É sempre recomendado fazermos o proxy dessa forma ao invés de usarmos
		* herança, pois a herança é sempre um acoplamento maior. */

		/* A desvantagem dessa implementação é que temos que modificar a
		* implementação original e criar uma interface, para que o proxy seja
		* feito. Se possível, devemos implementar dessa forma. */
	}
}
