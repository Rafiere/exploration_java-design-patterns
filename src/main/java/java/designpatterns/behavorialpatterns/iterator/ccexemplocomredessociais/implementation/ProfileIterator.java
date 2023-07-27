package java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation;

import java.designpatterns.behavorialpatterns.iterator.ccexemplocomredessociais.implementation.domain.Profile;

/* Essa interface define os métodos que cada um dos iteradores deverá ter. */
public interface ProfileIterator {

	boolean hasNext();

	Profile getNext();

	void reset();
}
