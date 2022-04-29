package elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By pesquisa = By.id("search_query_top");
	private By botaoVerde = By.cssSelector("a[href*='green']");

	private By botaoSize = By.id("group_1");
	private By botaoAdd = By.name("Submit");
	private By botaoContinueCompra = By.cssSelector("span[title='Continue shopping']");
	private By botaoAzul = By.cssSelector("a[href*='blue']");
	private By vestidoDois = By.cssSelector("a[title='Printed Dress']");
	private By botaoCheck = By.cssSelector("a[title='Proceed to checkout']");
	private By botaoCheckSumary = By.cssSelector("p a[title='Proceed to checkout']");

	private By botaoCheckShip = By.name("processCarrier");
	private By botaoAdress = By.name("processAddress");
	private By pagamento = By.cssSelector("a[title='Pay by bank wire']");
	private By carrinho = By.cssSelector("a[title='View my shopping cart']");
	
	private By email = By.id("email");
	private By senha = By.id("passwd");
	private By botaoLogin = By.id("SubmitLogin");

	private By criarEmail = By.id("email_create");
	private By botaoCriar = By.id("SubmitCreate");

	private By confirmar = By.xpath("//form/p/button");
	// private By textoConfirmacao = By.cssSelector("p strong");

	private By botaoIgree = By.id("cgv");

	private By firstName = By.id("customer_firstname");
	private By LastName = By.id("customer_lastname");
	private By adress = By.id("address1");
	private By city = By.id("city");
	private By state = By.cssSelector("#id_state option[value='1']");
	private By postal = By.id("postcode");
	private By phone = By.id("phone_mobile");
	private By register = By.id("submitAccount");

	public By getPagamento() {
		return pagamento;
	}

	public By getBotaoVerde() {
		return botaoVerde;
	}

	public By getBotaoSize() {
		return botaoSize;
	}

	public By getBotaoContinueCompra() {
		return botaoContinueCompra;
	}

	public By getBotaoAzul() {
		return botaoAzul;
	}

	public By getVestidoDois() {
		return vestidoDois;
	}

	public By getBotaoCheck() {
		return botaoCheck;
	}

	public By getBotaoCheckSumary() {
		return botaoCheckSumary;
	}

	public By getBotaoCheckShip() {
		return botaoCheckShip;
	}

	public By getBotaoAdress() {
		return botaoAdress;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getBotaoLogin() {
		return botaoLogin;
	}

	public By getCriarEmail() {
		return criarEmail;
	}

	public By getBotaoCriar() {
		return botaoCriar;
	}

	public By getConfirmar() {
		return confirmar;
	}

	public By getBotaoIgree() {
		return botaoIgree;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return LastName;
	}

	public By getAdress() {
		return adress;
	}

	public By getCity() {
		return city;
	}

	public By getState() {
		return state;
	}

	public By getPostal() {
		return postal;
	}

	public By getPhone() {
		return phone;
	}

	public By getRegister() {
		return register;
	}

	public By getPesquisa() {
		return pesquisa;
	}

	public By getBotaoAdd() {
		return botaoAdd;
	}

	public By getCarrinho() {
		return carrinho;
	}
}
