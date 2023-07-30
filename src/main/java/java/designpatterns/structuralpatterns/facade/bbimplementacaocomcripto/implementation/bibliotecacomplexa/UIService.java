package java.designpatterns.structuralpatterns.facade.bbimplementacaocomcripto.implementation.bibliotecacomplexa;

/* O objetivo dessa classe é simular uma biblioteca complexa na qual o
 * padrão "facade" criará um ponto único para abstrair a lógica de
 * acesso que é necessária para essa biblioteca. */
public class UIService {

	public static String getLoggedInUserId(){

		System.out.println("Simulando a obtenção do ID do usuário logado.");

		return "123";
	}
}
