package java.designpatterns.structuralpatterns.proxy.bbproxyparalogs.implementation;

/* A ideia desse proxy é realizar logs. Basicamente, ele serve para
* registrar o que foi feito, ou seja, gerar um log no sistema, e chamar a
* implementação original. */

/* Podemos fazer um proxy, por exemplo, em uma biblioteca do Java, já que
* basta utilizarmos a herança para isso, assim, basicamente, podemos atribuir um
* comportamento para uma determinada classe, nesse caso, um comportamento de log, e, após
* isso, podemos chamar o método da classe superior. */

public class LogProdutoDAO extends ProdutoDAO {

	@Override
	public Object find(long id){

		System.out.println("Buscando produto com o ID...");
		return super.find(id);
	}
}
