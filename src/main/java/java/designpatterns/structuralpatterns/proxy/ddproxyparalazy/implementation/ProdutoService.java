package java.designpatterns.structuralpatterns.proxy.ddproxyparalazy.implementation;

public class ProdutoService {

	private IProdutoDAO produtoDao;

	public ProdutoService(IProdutoDAO produtoDao){
		this.produtoDao = produtoDao;
	}

	public Object buscarProduto(long id){
		return produtoDao.find(id);
	}
}
