package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.LinkedinIterator;
import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.ProfileIterator;
import java.util.ArrayList;
import java.util.List;

public class Linkedin implements SocialNetwork {

	private List<Profile> contacts;

	public Linkedin(List<Profile> cache) {
		if (cache != null) {
			this.contacts = cache;
		} else {
			this.contacts = new ArrayList<>();
		}
	}

	/* Estamos emulando uma requisição para obter as chamadas de uma API do
	* LinkedIn. */
	public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
		simulateNetworkLatency();
		System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

		// ...and return test data.
		return findContact(profileEmail);
	}

	/* Estamos emulando uma chamada para a API do LinkedIn. */
	public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
		simulateNetworkLatency();
		System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

		// ...and return test data.
		Profile profile = findContact(profileEmail);
		if (profile != null) {
			return profile.getContacts(contactType);
		}
		return null;
	}

	private Profile findContact(String profileEmail) {
		for (Profile profile : contacts) {
			if (profile.getEmail().equals(profileEmail)) {
				return profile;
			}
		}
		return null;
	}

	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public ProfileIterator createFriendsIterator(String profileEmail) {
		return new LinkedinIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new LinkedinIterator(this, "coworkers", profileEmail);
	}
}
