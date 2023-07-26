package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

public class UserExistsHandler extends Handler {

	private Database database;

	public UserExistsHandler(Database database){
		this.database = database;
	}

	/* Essa é uma das implementações do handler. Se ele não falhar, o próximo handler será
	* chamado. */

	@Override
	public boolean handle(String username, String password) {

		if(database.isValidUser(username)){
			System.out.println("Esse username não está registrado!");
			return false;
		}

		return handleNext(username, password);
	}
}
