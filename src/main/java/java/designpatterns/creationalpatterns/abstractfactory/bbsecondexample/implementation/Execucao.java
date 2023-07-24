package java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation;

import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.application.Application;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories.GUIFactory;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories.MacOSFactory;
import java.designpatterns.creationalpatterns.abstractfactory.bbsecondexample.implementation.factories.WindowsFactory;

public class Execucao {

	public static void main(String[] args) {

		/* A aplicação selecionará o tipo de fábrica de acordo com o valor das
		* variáveis de ambiente, e todos os objetos serão criados com base
		* no ambiente que estiver sendo usado, assim, será criado um
		* "WindowsButton" e um "WindowsCheckbox". */

		Application app = configureApplication();
		app.paint();
	}

	public static Application configureApplication(){
		Application app;
		GUIFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();

		if(osName.contains("mac")){
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}

		app = new Application(factory);
		return app;
	}
}
