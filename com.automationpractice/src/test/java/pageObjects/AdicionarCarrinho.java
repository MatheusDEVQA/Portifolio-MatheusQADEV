package pageObjects;

import org.openqa.selenium.By;

import elementos.Elementos;

public class AdicionarCarrinho {
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	/**
	 * Acesso ao ambiente
	 * 
	 * @author Matheus Muniz
	 * @param produto
	 */
	public void acessarAmbiente(String ambiente) {
		me.acessarSistema(ambiente);
	}

	/**
	 * Adiciona produto ao carrinho com determinada cor
	 * 
	 * @author Matheus Muniz
	 * @param produto
	 */
	public void produtoECor(String produto, String cor) {
		me.escrever(el.getPesquisa(), produto);
		me.enter(el.getPesquisa());
		if (cor.equalsIgnoreCase("verde")) {
			me.clicarCrusor(el.getBotaoVerde());
			me.clical(el.getBotaoVerde());
			me.clical(el.getBotaoAdd());
			me.clical(el.getBotaoContinueCompra());
		}
		/**
		 * podemos colocar novas cores conforme a necessidade else if
		 * (cor.compareToIgnoreCase("azul"))
		 **/
	}

	/**
	 * Adiciona produto ao carrinho
	 * 
	 * @author Matheus Muniz
	 * @param produto
	 */
	public void produto(String produto) {
		me.escrever(el.getPesquisa(), produto);
		me.enter(el.getPesquisa());
		By vestidoDois = By.cssSelector("a[title='" + produto + "']");
		me.clicarCrusor(vestidoDois);
		me.clical(el.getBotaoAdd());
		me.clical(el.getBotaoContinueCompra());
	}

	public void produtoCorTamanho(String produto, String cor, String tamnaho) {
		me.limpar(el.getPesquisa());
		me.escrever(el.getPesquisa(), produto);
		me.enter(el.getPesquisa());
		if (cor.equalsIgnoreCase("azul")) {
			me.clicarCrusor(el.getBotaoAzul());
			me.clical(el.getBotaoAzul());
		}
		// pode adicionar cores com outros comandos
		me.escrever(el.getBotaoSize(), tamnaho);
		me.enter(el.getBotaoSize());

	}

	public void finalizarCompra(String email, String senha) {
		me.clical(el.getCarrinho());
		me.clicarCrusor(el.getBotaoCheckSumary());

		me.escrever(el.getEmail(), email);
		me.escrever(el.getSenha(), senha);
		me.clical(el.getBotaoLogin());
		me.clical(el.getBotaoAdress());
		me.clical(el.getBotaoIgree());
		me.clical(el.getBotaoCheckShip());
		me.clical(el.getPagamento());
		me.clical(el.getConfirmar());
	}

}
