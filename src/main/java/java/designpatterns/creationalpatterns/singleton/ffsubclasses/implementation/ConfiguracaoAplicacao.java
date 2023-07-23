package java.designpatterns.creationalpatterns.singleton.ffsubclasses.implementation;

public class ConfiguracaoAplicacao {

	private static ConfiguracaoAplicacao instance;
	public String nomeAplicacao;
	public String versao;
	public String cor;

	/* Nesse tipo de singleton com subclasses, o construtor deve ser protected, para
	* a classe que está herdando conseguir criar uma nova instância. */

	/* Com isso, reduzimos um pouco o encapsulamento, pois agora, as classes que
	* estão no mesmo pacote podem criar uma instância dessa aplicação.  */
	protected ConfiguracaoAplicacao(){
		this.nomeAplicacao = "Singleton";
		this.versao = "3.0";
		this.cor = "Azul";
	}

	/* Nesse exemplo, temos a utilização de um singleton com lazy initialization, mas
	* ele não é synchronized.  */

	/* Estamos decidindo qual singleton utilizar com base em uma propriedade do
	* sistema. Ele é utilizado quando queremos decidir qual parte do Singleton devemos
	* instanciar. */
	public ConfiguracaoAplicacao getInstance(){
		if(instance == null){
			String configuracao = System.getProperty("class.configuracao");
			if(configuracao.equals("teste")){
				instance = new ConfiguracaoAplicacaoTeste();
			}
			instance = new ConfiguracaoAplicacao();
		}
		return instance;
	}
}
