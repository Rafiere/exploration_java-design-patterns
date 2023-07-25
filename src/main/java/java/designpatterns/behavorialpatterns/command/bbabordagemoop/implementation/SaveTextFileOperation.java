package java.designpatterns.behavorialpatterns.command.bbabordagemoop.implementation;

/* Todos os comandos devem implementar a mesma interface. */

public class SaveTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	@Override
	public String execute() {

		return textFile.save();
	}
}
