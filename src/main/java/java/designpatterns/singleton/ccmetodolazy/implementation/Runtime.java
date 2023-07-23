package java.designpatterns.singleton.ccmetodolazy.implementation;

public class Runtime {

	private static Runtime currentRuntime;

	private Runtime(){}

	public static Runtime getInstance(){
		if(currentRuntime == null){
			currentRuntime = new Runtime();
		}
		return currentRuntime;
	}

}
