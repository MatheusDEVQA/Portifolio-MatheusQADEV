package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Metodos {
	WebDriver driver;

	/**
	 * Metodo para abrir navegador
	 * 
	 * @author Matheus Muniz
	 * @param url
	 */
	public void acessarSistema(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("==== Iniciando o teste! ====");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("====== Erro ao abri navegador =====" + e.getMessage());
			System.err.println("====== Erro ao abri navegador =====" + e.getCause());

		}

	}

	public void clical(By elemento) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(elemento).click();

	}
	public void clicarCrusor(By elemento) {
		WebElement botao = driver.findElement(elemento);
		Actions act = new Actions(driver);
		act.moveToElement(botao);
		act.click().build().perform();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
public void limpar(By elemento) {
	driver.findElement(elemento).clear();
}
	public void enter(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void scroolPagina(By elemento) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pontoFoco = driver.findElement(elemento);
		js.executeScript("arguments[0].scrollIntoView(true)", pontoFoco);

	}
}
