package java.designpatterns.behavorialpatterns.command.bbabordagemoop.implementation;

/* Um "receiver" é um objeto que performa um conjunto de ações coesivs. Ele
* performa a ação atual quando o método "execute()" é chamado. */

/* Nesse exemplo, o "TextFile" é um receiver. */

public class TextFile {

	private String name;

	public String open(){
		return "Opening file " + name;
	}

	public String save(){
		return "Saving file " + name;
	}
}
