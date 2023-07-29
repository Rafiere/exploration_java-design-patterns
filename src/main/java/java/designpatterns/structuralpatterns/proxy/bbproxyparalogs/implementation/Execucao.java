package java.designpatterns.structuralpatterns.proxy.bbproxyparalogs.implementation;

public class Execucao {

	public static void main(String[] args) {

		ProdutoDAO produtoDAO = new LogProdutoDAO();
		ProdutoService produtoService = new ProdutoService(produtoDAO);

		produtoService.buscarProduto(1);
		produtoService.buscarProduto(2);
		produtoService.buscarProduto(3);
	}
}
