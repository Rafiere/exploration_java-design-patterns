package java.designpatterns.factorymethods.aaconceitos;

public class Conceitos {

	/* Um construtor virtual, ou "factory methods", é um método que cria
	 * objetos. Na prática, ele é um construtor, mas ele não segue a ideia de
	 * construtor. */

	/* O principal objetivo do padrão "Factory" é escondermos o "new". */

	/* Ele pode ser útil para montarmos relatórios para diferentes clientes. Para um
	* cliente, temos um tipo de relatório, para outros, outro tipo. De acordo com os
	* parâmetros passados, teremos um diferente objeto criado. */

	/* Vantagens: */

	/* Na forma mais simples, é altamente recomendada a aplicação desse padrão, utilizando
	* os "static factory methods", como representado no package "AA". */

	/* A implementação mediana, que não é muito complexa, representada pelo package
	* "CC", deve ser utilizado quando temos uma classe superior, que possui a inteligência
	* para criar vários outros tipos de classes, como representado pela classe
	* "SeletorDeFormaDePagamento". */

	/* Desvantagens: */

	/* A principal desvantagem, principalmente do formato completo, possui muitas
	* classes. Se queremos apenas não usar o construtor, devemos utilizar um "static
	* factory method" (BB), não precisamos criar várias classes completas e implementar o
	* padrão inteiro, pois estamos gerando lixo desnecessário na aplicação. */

	/* Apenas em um cenário muito complexo, com hierarquias paralelas, devemos utilizar
	* o modo que está representado no pacote "DD". */
}

