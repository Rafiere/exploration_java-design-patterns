package java.designpatterns.singleton.aaconceitos;

public class Conceitos {

	/* O padrão Singleton deverá ser utilizado quando queremos ter apenas uma
	* única instância da classe dentro da aplicação. */

	/* Atualmente, o CDI, que é responsável pela injeção de dependência, possui várias
	* alternativas para isso. */

	/* Vantagens: */

	/* 1. Ele é uma forma muito simples e direta de garantirmos que teremos apenas
	* uma instância de um objeto em memória. */

	/* 2. Não vamos criar várias instâncias de uma classe já que precisaremos apenas de
	* uma. */

	/* Desvantagens: */

	/* 1. Não devemos utilizar o singleton como uma variável global. Se utilizamos um
	* singleton apenas para passar como argumento, está tudo bem, pois mantemos a
	* hierarquia do código, mas se utilizarmos o singleton como uma variável global, teremos
	* uma alteração na hierarquia de chamadas e uma dificuldade ao fazer testes. */
}
