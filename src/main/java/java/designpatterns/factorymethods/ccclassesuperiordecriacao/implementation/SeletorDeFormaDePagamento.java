package java.designpatterns.factorymethods.ccclassesuperiordecriacao.implementation;

import java.designpatterns.factorymethods.ccclassesuperiordecriacao.implementation.formasdepagamento.BoletoBancario;
import java.designpatterns.factorymethods.ccclassesuperiordecriacao.implementation.formasdepagamento.CartaoDeCredito;
import java.designpatterns.factorymethods.ccclassesuperiordecriacao.implementation.formasdepagamento.Pix;
import java.designpatterns.factorymethods.ccclassesuperiordecriacao.implementation.tipodeforma.FormaDePagamento;

public class SeletorDeFormaDePagamento {

	/* Em uma forma um pouco mais simples, ele é utilizado quando temos uma classe
	 * superior que contém a inteligência definir qual classe ele vai criar, ou seja, quando
	 * temos uma classe "SeletorDeFormaDePagamento" que, por exemplo, define qual será a forma
	 * de pagamento escolhida. */

	/* Nesse exemplo mais simples, de acordo com o valor recebido por parâmetro, uma forma
	* de pagamento será criada. Essa classe utiliza um "factory" mais simples, pois ela possui
	* a lógica de criação de uma classe. */
	
	public FormaDePagamento novaFormaDePagamento(int tipoFormaDePagamento){

		return switch (tipoFormaDePagamento) {
			case 1 -> new BoletoBancario();
			case 2 -> new CartaoDeCredito();
			case 3 -> new Pix();
			default -> throw new IllegalArgumentException();
		};
	}
}
