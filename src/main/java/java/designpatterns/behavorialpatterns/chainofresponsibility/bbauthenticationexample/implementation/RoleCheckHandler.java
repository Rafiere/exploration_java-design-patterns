package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

public class RoleCheckHandler extends Handler {

	/* Essa é uma das implementações do handler. Se ele for um administrador, a página de
	* administradores será retornada. Se ele não for, a página default será retornada. */

	@Override
	public boolean handle(String username, String password) {

		if("admin_username".equals(username)){
			System.out.println("Carregando a página de administradores!");
			return true;
		}
		System.out.println("Loading default page");
		return handleNext(username, password);
	}
}
