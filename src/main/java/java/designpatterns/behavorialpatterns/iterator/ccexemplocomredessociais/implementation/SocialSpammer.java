package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain.Profile;
import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain.SocialNetwork;

/* Essa será a classe responsável por enviar mensagens para os contatos. */

public class SocialSpammer {

	public SocialNetwork network;
	public ProfileIterator iterator;

	public SocialSpammer(SocialNetwork network) {
		this.network = network;
	}

	public void sendSpamToFriends(String profileEmail, String message) {
		System.out.println("\nIterating over friends...\n");
		iterator = network.createFriendsIterator(profileEmail);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendSpamToCoworkers(String profileEmail, String message) {
		System.out.println("\nIterating over coworkers...\n");
		iterator = network.createCoworkersIterator(profileEmail);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendMessage(String email, String message) {
		System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
	}
}
