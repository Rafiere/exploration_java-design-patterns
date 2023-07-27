package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.ProfileIterator;

/* Essa interface define o que uma rede social terá de comum. */
public interface SocialNetwork {

	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);
}
