package com.automationpractice;

import org.junit.Test;

import pageObjects.AdicionarCarrinho;
import pageObjects.FinalizarCompra;
import pageObjects.NovoUsuario;

public class TesteCenarioBonusNovoLogin {
	AdicionarCarrinho ad = new AdicionarCarrinho();
	FinalizarCompra finalizar = new FinalizarCompra();
	NovoUsuario no = new NovoUsuario();

	@Test
	public void testeBonus() {
		ad.acessarAmbiente("http://automationpractice.com/index.php");
		ad.produtoECor("Printed Chiffon Dress","verde");
		ad.produto("Printed Dress");
		ad.produtoCorTamanho("Faded Short Sleeve T-shirts ", "azul", "m");
		finalizar.finalizarCompra("benedita_brenda_farias@suzano.com.br", "123456", "não");

	}
}
