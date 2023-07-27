package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.FacebookIterator;
import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.ProfileIterator;
import java.util.ArrayList;
import java.util.List;

/* Essa é a implementação do Facebook. */
public class Facebook implements SocialNetwork {

	private List<Profile> profiles;

	public Facebook(List<Profile> cache) {
		if (cache != null) {
			this.profiles = cache;
		} else {
			this.profiles = new ArrayList<>();
		}
	}

	/* No método abaixo, estamos emulando uma requisição para a API do Facebook, com o
	* objetivo de obter os perfis da plataforma. */
	public Profile requestProfileFromFacebook(String profileEmail) {

		simulateNetworkLatency();
		System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

		return findProfile(profileEmail);
	}

	/* Estamos emulando uma chamada para a API do Facebook com o objetivo de obter
	* uma lista com os amigos de cada perfil. */
	public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
		simulateNetworkLatency();
		System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

		// ...and return test data.
		Profile profile = findProfile(profileEmail);
		if (profile != null) {
			return profile.getContacts(contactType);
		}
		return null;
	}

	private Profile findProfile(String profileEmail) {
		for (Profile profile : profiles) {
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
		return new FacebookIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new FacebookIterator(this, "coworkers", profileEmail);
	}
}
