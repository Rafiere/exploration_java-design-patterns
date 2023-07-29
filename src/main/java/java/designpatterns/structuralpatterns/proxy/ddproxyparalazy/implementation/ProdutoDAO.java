package java.designpatterns.structuralpatterns.proxy.ddproxyparalazy.implementation;

public class ProdutoDAO implements IProdutoDAO {

	/* Esse método tem como objetivo simular uma conexão com
	 * o banco de dados. */
	private void simulaTempoAlto(){
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	@Override
	public Object find(long id) {

		/* Temos que implementar a busca em um objeto... */

		return new Object();
	}
}
