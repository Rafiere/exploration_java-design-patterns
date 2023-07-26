package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

public class Execucao {

	public static void main(String[] args) {

		Database database = new Database();

		/* Podemos definir a ordem de execução dos handlers. */

		/* Podemos manipular a ordem dos handlers de forma dinâmica. */

		/* Cada handler deve processar a requisição ou passar ela para a próxima etapa
		* da corrente. */


		Handler handler = new UserExistsHandler(database)
				.setNextHandler(new UserExistsHandler(database))
				.setNextHandler(new ValidPasswordHandler(database))
				.setNextHandler(new RoleCheckHandler());

		AuthService authService = new AuthService(handler);

		authService.login("username", "password");
	}
}
