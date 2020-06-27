package TesteSelenium.AutomacaoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boot {

	public void Boot() {

		// Indica a propriedade do sistema passando o comaninho do webDriver
		System.setProperty("webdriver.chrome.driver", "./\\webDriver\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		navegador.get("https://github.com/login");

		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.findElement(By.id("login_field")).sendKeys("teste@automatizado.com");
		navegador.findElement(By.id("password")).sendKeys("teste@automatizado.com");

		//simula click no botão de login
		// navegador.findElement(By.name("commit")).click();

	}
}
