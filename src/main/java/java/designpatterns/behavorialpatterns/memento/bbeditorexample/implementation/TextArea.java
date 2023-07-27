package java.designpatterns.behavorialpatterns.memento.bbeditorexample.implementation;

/* Essa é a classe "Originator". Ela consegue produzir
* snapshots do seu próprio estado e restaurar o seu estado dessas
* snapshots. */
public class TextArea {

	private String text;

	public void setText(String text){
		this.text = text;
	}

	public Memento takeSnapshot(){
		return new Memento(this.text);
	}

	public void restore(Memento memento) {
		this.text = memento.getSavedText();
	}

	/* Essa classe funciona como um "snapshot" do estado
	* do Memento. */
	public static class Memento {

		private final String text;

		private Memento(String textToSave){
			text = textToSave;
		}

		private String getSavedText(){
			return this.text;
		}
	}
}
