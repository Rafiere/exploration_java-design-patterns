package java.designpatterns.structuralpatterns.proxy.bbproxyparalogs.implementation;

public class ProdutoDAO {

	public ProdutoDAO(){
		simulaTempoAlto();
	}

	public Object find(long id){
		simulaTempoAlto();
		return new Object();
	}

	/* Esse método tem como objetivo simular uma conexão com
	* o banco de dados. */
	private void simulaTempoAlto(){
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
