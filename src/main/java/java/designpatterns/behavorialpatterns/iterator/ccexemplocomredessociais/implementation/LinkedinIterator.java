package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain.Linkedin;
import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain.Profile;
import java.util.ArrayList;
import java.util.List;

/* Essa é a implementação para percorrer a lista de perfis do LinkedIn. */
public class LinkedinIterator implements ProfileIterator {

	private Linkedin linkedin;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<>();
	private List<Profile> contacts = new ArrayList<>();

	public LinkedinIterator(Linkedin linkedIn, String type, String email) {
		this.linkedin = linkedIn;
		this.type = type;
		this.email = email;
	}

	private void lazyLoad() {
		if (emails.size() == 0) {
			List<String> profiles = linkedin.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.contacts.add(null);
			}
		}
	}

	@Override
	public boolean hasNext() {
		lazyLoad();
		return currentPosition < emails.size();
	}

	@Override
	public Profile getNext() {
		if (!hasNext()) {
			return null;
		}

		String friendEmail = emails.get(currentPosition);
		Profile friendContact = contacts.get(currentPosition);
		if (friendContact == null) {
			friendContact = linkedin.requestContactInfoFromLinkedInAPI(friendEmail);
			contacts.set(currentPosition, friendContact);
		}
		currentPosition++;
		return friendContact;
	}

	@Override
	public void reset() {
		currentPosition = 0;
	}
}
