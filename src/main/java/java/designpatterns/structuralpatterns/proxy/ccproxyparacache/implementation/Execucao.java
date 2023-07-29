package java.designpatterns.structuralpatterns.proxy.ccproxyparacache.implementation;

public class Execucao {

	public static void main(String[] args) {

		CacheProdutoDAO produtoDAO = new CacheProdutoDAO();
		ProdutoService produtoService = new ProdutoService(produtoDAO);

		produtoService.buscarProduto(1);
		produtoService.buscarProduto(2);
		produtoService.buscarProduto(3);
	}
}
