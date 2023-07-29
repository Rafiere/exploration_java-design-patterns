package java.designpatterns.structuralpatterns.proxy.ddproxyparalazy;

public class ProxyParaLazy {

	/* Segundo o professor, a utilização de Proxy para lazy é muito boa e recomendada. */

	/* A ideia do Lazy é criarmos um objeto de um tipo e só inicializarmos ele por
	* completo caso seja necessário. */

	/* É um tipo de proxy para tornar a inicialização do objeto mais rápida. Isso é
	* importante para situações que não sabemos se um método vai ser chamado ou não. */

	/* Para esse padrão, sempre temos que escolher entre composição e herança. Sempre que
	* possível, devemos escolher a composição (interface) para criarmos o proxy. */

	/* Basicamente, a ideia do proxy é que façamos verificações ou chamemos métodos antes
	* de chamarmos a implementação real de algo. É uma ponte entre o cliente e a classe
	* que está sendo chamada. */
}
