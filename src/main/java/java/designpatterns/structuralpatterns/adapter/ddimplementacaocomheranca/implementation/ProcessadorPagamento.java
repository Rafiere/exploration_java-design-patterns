package java.designpatterns.structuralpatterns.adapter.ddimplementacaocomheranca.implementation;

import java.math.BigDecimal;

/* Essa interface é chamada de "Target". Ela é, basicamente, a implementação que
 * estamos querendo fazer. */

public interface ProcessadorPagamento {

	void debitar(BigDecimal valor);

	void creditar(BigDecimal valor);
}
