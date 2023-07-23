package java.designpatterns.behavorialpatterns.strategy.bbexemplocomdados.implementation;

import java.math.BigDecimal;

/* Essa é a estratégia. Vamos declarar um método e ela, normalmente, vai ter mais de
* uma implementação. Nesse exemplo, ela está sendo implementada pela "PagamentoCartaoCredito" e
* "PagamentoCartaoDebito". Essa classe definirá o que a estratégia estará implementando. */

/* Temos as estratégias de pagamento com o cartão de débito e crédito. */

/* A estratégia não deverá conhecer o contexto, pois ela encapsulará apenas um comportamento, que, nesse
* caso, é o comportamento de "Pagar". */
public interface PagamentoStrategy {

	void pagar(BigDecimal valor);
}
