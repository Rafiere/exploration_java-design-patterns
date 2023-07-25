package java.designpatterns.creationalpatterns.builder.ddimplementacaocomdirector;

public class ImplementacaoComDirector {

	/* Esse é o tipo de implementação mais complexa e não é muito
	* utilizado. */

	/* Um director define a ordem que os passos serão executados, enquanto que o builder proverá a
	* implementação desses passos. */

	/* Esse passo não é estritamente necessário, já que podemos sempre chamar os passos de um builder de
	* forma específica, diretamente do código do cliente, porém, uma classe "director" pode ser útil quando
	* colocamos várias rotinas de construção que podem ser reutilizadas ao redor do programa. */

	/* Isso também esconde totalmente os detalhes de implementação do cliente. */
}
