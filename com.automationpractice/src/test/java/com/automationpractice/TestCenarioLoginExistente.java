package com.automationpractice;

import org.junit.Test;

import pageObjects.AdicionarCarrinho;
import pageObjects.FinalizarCompra;

public class TestCenarioLoginExistente {
AdicionarCarrinho ad = new AdicionarCarrinho();
FinalizarCompra finalizar = new FinalizarCompra();

@Test
public void testeLoginExistente() {
	ad.acessarAmbiente("http://automationpractice.com/index.php");
	ad.produtoECor("Printed Chiffon Dress","verde");
	ad.produto("Printed Dress");
	ad.produtoCorTamanho("Faded Short Sleeve T-shirts ", "azul", "m");
	finalizar.finalizarCompra("benedita_brenda_farias@suzano.com.br", "123456", "sim");
}

}
