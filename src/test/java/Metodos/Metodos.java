package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Metodos {

	WebDriver driver;

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void pausa(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void validarTexto(By elemento, String textoesperado) {

		String textoencontrado = driver.findElement(elemento).getText();
		System.out.println(textoencontrado);
		assertEquals(textoesperado, textoencontrado);
	}
	public void screnShot(String print) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File Destfile = new File(print);
		FileUtils.copyFile(SrcFile, Destfile);
	}

}
