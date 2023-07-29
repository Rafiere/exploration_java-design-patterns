package java.designpatterns.structuralpatterns.proxy.ddproxyparalazy.implementation;

/* Essa classe é o proxy. */

/* Ao invés de herdarmos a classe "Produto", vamos implementar
* a mesma interface que ela implementa e, ao invés de usar
* herança, ela armazena, por composição, uma instância da "daoReal", dessa
* forma, podemos utilizar ela sempre que necessário. */
public class LazyProdutoDAO implements IProdutoDAO {

	private IProdutoDAO daoReal;

	/* A DAO só vai ser inicializada quando o ProdutoDAO for chamado. */
	@Override
	public Object find(long id) {

		inicializaDAO();
		return daoReal.find(id);
	}

	private void inicializaDAO(){
		if(daoReal == null){
			daoReal = new ProdutoDAO();
		}
	}
}
