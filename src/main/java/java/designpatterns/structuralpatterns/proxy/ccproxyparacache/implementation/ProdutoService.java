package java.designpatterns.structuralpatterns.proxy.ccproxyparacache.implementation;


public class ProdutoService {

	private ProdutoDAO produtoDAO;

	public ProdutoService(ProdutoDAO produtoDAO){
		this.produtoDAO = produtoDAO;
	}

	public Object buscarProduto(long id){
		return produtoDAO.find(id);
	}
}
