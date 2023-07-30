package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

/* O objetivo dessa classe é simular uma biblioteca complexa na qual o
 * padrão "facade" criará um ponto único para abstrair a lógica de
 * acesso que é necessária para essa biblioteca. */
public class DatabaseService {

	public User getUser(String userId){

		return new User("1", "1", 100, "1", "1");
	}
}