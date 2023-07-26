package java.designpatterns.behavorialpatterns.chainofresponsibility.bbauthenticationexample.implementation;

import java.util.HashMap;
import java.util.Map;

public class Database {

	/* This class mock a database. */

	private final Map<String, String > users;

	public Database(){
		users = new HashMap<>();
		users.put("admin_username", "admin_password");
		users.put("user_username", "user_password");
	}

	public boolean isValidUser(String username){
		return users.containsKey(username);
	}

	public boolean isValidPassword(String username, String password){
		return users.get(username).equals(password);
	}
}
