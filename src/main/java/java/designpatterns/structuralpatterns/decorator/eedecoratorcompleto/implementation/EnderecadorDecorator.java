package java.designpatterns.structuralpatterns.decorator.eedecoratorcompleto.implementation;

/* Como temos vários decorators nesse exemplo, usamos uma classe abstrata para
* inserir o que será comum em todos os decorators, que, nesse caso, é o
* atributo "enderecador" e o método construtor. */
public abstract class EnderecadorDecorator implements Enderecador {

	Enderecador enderecador;

	public EnderecadorDecorator(Enderecador enderecador){
		super();
		this.enderecador = enderecador;
	}
}
