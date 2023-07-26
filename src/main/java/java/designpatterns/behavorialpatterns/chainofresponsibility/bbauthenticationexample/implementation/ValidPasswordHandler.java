package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

public class ValidPasswordHandler extends Handler {

	private Database database;

	public ValidPasswordHandler(Database database){
		this.database = database;
	}

	/* Essa é uma das implementações do handler. Se ela não falhar, o próximo passo será
	* chamado. */
	@Override
	public boolean handle(String username, String password) {

		if(!database.isValidPassword(username, password)){
			System.out.println("Senha errada!");
			return false;
		}

		return handleNext(username, password);
	}
}
