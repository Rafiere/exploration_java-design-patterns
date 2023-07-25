package java.designpatterns.creationalpatterns.builder;

public class Builder {

	/* Esse padrão permite a construção de objetos complexos passo a passo. Dessa
	* forma, usando o mesmo código de produção, conseguimos produzir
	* diferentes partes da representação de um objeto. */

	/* Para construirmos um objeto do tipo "Casa" que terá várias partes, ou
	* seja, terá paredes, telhado, um sistema elétrico, estátuas, árvores e
	* etc, podemos criar a classe "Casa" e criar um conjunto de subclasses
	* para cobrir todas as combinações dos parâmetros, porém, eventualmente, vamos
	* terminar com um número considerável de subclasses. */

	/* Qualquer novo parâmetro aumentaria a hierarquia. */

	/* Há outra abordagem que não envolveria subclasses, que seria o uso de um
	* construtor gigante dentro da classe "House" com todos os parâmetros que
	* controlam o objeto. Essa abordagem elimina a necessidade de uma superclasse, mas
	* cria outro problema: Como a maioria dos parâmetros não vão ser utilizados, o
	* construtor ficaria muito feio. */

	/* Apenas uma parte das instâncias teria piscina, logo, o parâmetro "temPiscina" ficaria
	* inútil na maioria das vezes. */

	/* O padrão builder resolve esse problema, extraindo o código de construção do
	* objeto para a sua própria classe, e o movendo para criar objetos chamados
	* de "builders". */

	/* Com isso, não precisamos chamar todos os passos, apenas os passos que são necessários para
	* produzirmos uma determinada configuração de objetos. */

	/* Em alguns casos, quando precisamos construir várias representações de um
	* produto, ou seja, as paredes de uma cabana podem ser de madeira, mas a de um
	* castelo deve ser de pedra, podemos criar várias classes "builder" que implementem o
	* mesmo conjunto de passos de build. Dessa forma, podemos usar os builders no processo de
	* construção para produzir diferentes tipos de objetos. */

	/* Um conjunto de passos pré-determinados para construir uma determinada instância de
	* objetos pode ser chamado de "Director", essa classe define a ordem para executar os passos
	* do "builder", e o "builder" implementa esses passos. Uma classe "director" não é sempre
	* necessária, pois podemos apenas, sempre, chamar as etapas de construção em uma ordem específica, diretamente
	* do código do cliente. */

	/* Uma classe "director" só é recomendada caso tenhamos várias rotinas de construção padronizadas, assim, podemos
	* reusá-la pelo programa. */

	/* A classe "Director" também é útil para escondermos totalmente os detalhes da construção do produto do
	* código do cliente, assim, o cliente precisará apenas associar um "builder" a um diretor, iniciar a construção com
	* o diretor e obter o resultado do builder. */

	/* O cliente pode controlar os passos do builder manualmente, também, nem sempre sendo necessária a
	* utilização de um "director". */

	/* Quando usar: */

	/* 1. Devemos usar esse padrão quando temos um construtor com muitos parâmetros
	* opcionais, assim, usamos o "builder" para criar construtores especializados e para
	* não termos que passar esses parâmetros opcionais. */

	/* 2. Devemos usar o padrão "builder" quando queremos que o código consiga criar diferentes
	* representações de um produto, como casas de madeira, pedra e etc. Assim, quando os passos forem
	* similares, mas apenas alguns detalhes forem diferentes, podemos utilizá-lo. */

	/* 3. Podemos usar quando temos um método que recebe, por exemplo, mais de 4 argumentos em
	* um método, assim, se tivermos 5 argumentos em um método, podemos criar um builder para encapsular
	* os argumentos. */

	/* Vantagens: */

	/* 1. Conseguimos construir objetos passo a passo, de forma até recursiva, se necessário. */

	/* 2. Conseguimos reutilizar o mesmo código de construção quando estamos construindo várias representações
	* de produtos. */

	/* 3. Aplicamos o SRP, ou seja, isolamos o código de construção da lógica do produto. */

	/* Desvantagens: */

	/* 1. A complexidade do código aumenta desde que o padrão requer criar múltiplas novas classes. */

	/* Curiosidades: */

	/* Um builder, uma fábrica abstrata e um protótipo podem ser implementados como singletons. */

	/* Muitos designs começam usando um "Factory Method" e evoluem para um prototype, um abstract factory ou
	* um builder. */
}
