package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

public class AuthService {

	private Handler handler;

	public AuthService(Handler handler){
		this.handler = handler;
	}

	public boolean login(String email, String password){
		if(handler.handle(email, password)){
			System.out.println("A autorização foi feita com sucesso!");
			return true;
		}
		return false;
	}
}
