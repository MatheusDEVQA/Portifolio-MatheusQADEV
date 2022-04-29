package pageObjects;

import elementos.Elementos;

public class FinalizarCompra {
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	public void finalizarCompra(String email, String senha, String possuiUsuario) {
		if (possuiUsuario.equalsIgnoreCase("sim")) {
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
		
		else {
		
			me.clical(el.getCarrinho());
			me.clicarCrusor(el.getBotaoCheckSumary());
		criarCompraNovoUsuario();
		me.clical(el.getBotaoAdress());
		me.clical(el.getBotaoIgree());
		me.clical(el.getBotaoCheckShip());
		me.clical(el.getPagamento());
		me.clical(el.getConfirmar());}
	}

	public void criarCompraNovoUsuario() {
		me.escrever(el.getCriarEmail(), "luiziana@hotmail.com");
		me.clical(el.getBotaoCriar());

		me.escrever(el.getFirstName(), "Luizia");
		me.escrever(el.getLastName(), "Mariah");
		me.escrever(el.getCity(), "Souza");
		me.escrever(el.getPhone(), "83 98745 6542");
		me.escrever(el.getPostal(), "25418");
		me.enter(el.getState());
		me.escrever(el.getRegister(), "Mariah");
		me.escrever(el.getAdress(), "Rua Josemar, 1260");
	}
}
