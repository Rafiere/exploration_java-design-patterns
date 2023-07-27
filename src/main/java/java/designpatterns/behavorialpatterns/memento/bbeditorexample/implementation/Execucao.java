package java.designpatterns.behavorialpatterns.memento.bbeditorexample.implementation;

public class Execucao {

	public static void main(String[] args) {

		Editor editor = new Editor();

		editor.write("Like and");
		editor.write("Like and subscribe");
		editor.write("Like and subscribe to my channel.");

		editor.undo();
	}
}
