package java.designpatterns.behavorialpatterns.memento.bbeditorexample.implementation;

import java.util.Deque;
import java.util.LinkedList;

/* Essa classe é chamada de "Caretaker". Ela é responsável
* por capturar e restaurar o estado do Originator se
* for necessário. */
public class Editor {

	private Deque<TextArea.Memento> stateHistory;
	private TextArea textArea;

	public Editor(){
		stateHistory = new LinkedList<>();
		textArea = new TextArea();
	}

	/* A cada vez que o método "write()" for utilizado, uma
	* snapshot será armazenada. */
	public void write(String text){
		textArea.setText(text);

		stateHistory.add(textArea.takeSnapshot());
	}

	/* Quando esse método for utilizado, voltaremos para a snapshot
	* anterior. */
	public void undo(){
		textArea.restore(stateHistory.pop());
	}
}
