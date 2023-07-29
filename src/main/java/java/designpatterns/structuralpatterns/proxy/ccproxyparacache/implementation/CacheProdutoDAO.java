package java.designpatterns.structuralpatterns.proxy.ccproxyparacache.implementation;

import java.util.HashMap;

/* Esse é um proxy que será utilizado para realizar cache. */

/* A classe "ProdutoDAO" simula o acesso ao banco. Ao invés dele
* repassar a chamada para a classe superior, ele, primeiramente, verificará se
* o objeto já está no cache. Se não tiver, ele buscará no banco. Se tiver, ele
* utilizará a que está no cache. */


public class CacheProdutoDAO extends ProdutoDAO {

	/* Essa não é a melhor forma de utilizarmos um cache. */
	private static final HashMap<Long, Object> CACHE = new HashMap<>();

	@Override
	public Object find(long id){
		Object o = CACHE.get(id);

		if(o == null){
			o = super.find(id);
			CACHE.put(id, o);
			return o;
		}
		return o;
	}
}
