package java.designpatterns.behavorialpatterns.state.bbphoneexample;

public class PhoneExample {

	/* Quase todos os smartphones possuem dois botões: O botão "power" e o botão
	* "home". */

	/* As ações desse botão dependem do estado do celular. Se o celular está
	* ligado e pressionamos o botão "Power", ele ligará. */

	/* Se o celular estiver ligado e pressionarmos o mesmo botão, ele será
	* desligado. */

	/* O exemplo acima, do celular, é um exemplo de uma "Finite-State machine". A
	* ideia principal é que existe um número finito de estados que um programa
	* pode estar, e, de acordo com o estado que ele se encontra, o programa
	* agirá de uma forma diferente. */

	/* Um estado pode mudar ou não o estado do programa para outro. */

	/* Essas regras de alteração de estado são chamadas de "transitions". */

	/* Por exemplo, o estado inicial de um telefone é o "Off". Se apertarmos
	* o botão "Home" ou o botão "Power", ele passará para o estado de "bloqueado". Se
	* clicarmos novamente no botão "Home", ele passará para o estado "pronto para uso". Se, ao
	* invés disso, na tela de bloqueio, apertarmos o botão "Power", ele voltará para o estado
	* "Off". Assim, dessa forma, de acordo com o estado do celular, ao apertarmos determinados
	* botões, eles possuem diferentes ações. */

}
