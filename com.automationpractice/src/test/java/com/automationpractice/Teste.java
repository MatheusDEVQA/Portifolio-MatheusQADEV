package com.automationpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elementos.Elementos;
import pageObjects.Metodos;

public class Teste {
	String ambiente = "http://automationpractice.com/index.php";
	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@Test
	public void comprarTresItens() {
		me.acessarSistema(ambiente);
		me.escrever(el.getPesquisa(),"Printed Chiffon Dress");
		me.enter(el.getPesquisa());
		//me.scroolPagina(el.getBotaoVerde());
		me.clicarCrusor(el.getBotaoVerde());
		
		me.clical(el.getBotaoVerde());
		
		me.clical(el.getBotaoAdd());
		me.clical(el.getBotaoContinueCompra());
		
		me.escrever(el.getPesquisa(), "Printed Dress");
		me.enter(el.getPesquisa());
		me.clicarCrusor(el.getVestidoDois());
		
		me.clical(el.getBotaoAdd());
		me.clical(el.getBotaoContinueCompra());
		me.limpar(el.getPesquisa());
		me.escrever(el.getPesquisa(), "Faded Short Sleeve T-shirts ");
		me.enter(el.getPesquisa());
		me.clicarCrusor(el.getBotaoAzul());
		me.clical(el.getBotaoAzul());
		me.escrever(el.getBotaoSize(), "M");
		me.enter(el.getBotaoSize());
		//me.clical(el.getBotaoAdd());
		//me.clical(el.getBotaoCheck());
		me.clical(el.getCarrinho());
		me.clicarCrusor(el.getBotaoCheckSumary());
		
		me.escrever(el.getEmail(), "benedita_brenda_farias@suzano.com.br");
		me.escrever(el.getSenha(), "123456");
		me.clical(el.getBotaoLogin());
		me.clical(el.getBotaoAdress());
		me.clical(el.getBotaoIgree());
		me.clical(el.getBotaoCheckShip());
		me.clical(el.getPagamento());
		me.clical(el.getConfirmar());
		
		
		
		
	}

}
