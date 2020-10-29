package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
   WebDriver driver; 
   
   public void abrirNavegador(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {
			if (navegador == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
			} else if (navegador == "FIREFOX") {
				if (navegador == "FIREFOX") {
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(site);
				}

			}

		} else {
			System.out.println("Navegador inválido, digite CHROME ou FIREFOX");
		}
		driver.manage().window().maximize();
	}
}
