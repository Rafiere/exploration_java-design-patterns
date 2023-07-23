package java.designpatterns.strategy.ddexemplocominstanciaporinterface.implementation;

import java.math.BigDecimal;

/* Com essa interface, estamos controlando o quanto que as estratégias terão
* de acesso da classe "Compra", ou seja, é um contrato. */

public interface Pagavel {

	BigDecimal getValor();
}
