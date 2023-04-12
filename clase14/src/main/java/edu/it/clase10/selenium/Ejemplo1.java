package edu.it.clase10.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 implements Runnable {
	WebDriver webDriver = null;
	Double cotizacionLocal = 0d;
	Double cotizacionNYSE = 0d;
	
	public Ejemplo1() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\cursos\\JavaSE62207\\chromedriver.exe");
		
		webDriver = new ChromeDriver();
	}
	private void dormir(long ms) {
		try {
			Thread.sleep(ms);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private void intentaLogin() {
		List<WebElement> listaElementos = webDriver.findElements(By.className("ingresar"));
		WebElement elementoLogin = listaElementos.get(0);
		elementoLogin.click();
		
		dormir(4000);
		
		WebElement inputTextUsuario = webDriver.findElement(By.id("usuario"));
		inputTextUsuario.sendKeys("hola");
		
		dormir(4000);
	}
	private void consultaCotizacionLocal() {		
		try {			
			webDriver.get("https://www.invertironline.com/titulo/cotizacion/BCBA/YPFD/YPF/");
			WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
			String contenido = elemento.getText();
			System.out.println("------------------------------------------");
			System.out.println(contenido);
			System.out.println("------------------------------------------");
			
			String parseable = contenido
                    .replace("$ ", "")
                    .replace(".", "")
                    .replace(",", ".");
			
			cotizacionLocal = Double.valueOf(parseable);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private void consultaCotizacionNyse() {		
		try {			
			webDriver.get("https://www.invertironline.com/titulo/cotizacion/NYSE/YPF/YPF/");
			WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
			String contenido = elemento.getText();
			System.out.println("------------------------------------------");
			System.out.println(contenido);
			System.out.println("------------------------------------------");
			
			String parseable = contenido
                    .replace("US$ ", "")
                    .replace(".", "")
                    .replace(",", ".");
			
			cotizacionNYSE = Double.valueOf(parseable);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void run() {
		
		System.out.println("Estado incial");
				
		try {
			consultaCotizacionLocal();
			dormir(2000);
			// intentaLogin();			
			consultaCotizacionNyse();
			dormir(2000);
			
			Double contadoContraLiquidacion = cotizacionLocal / cotizacionNYSE;
			
			System.out.println("------------------------------------------");
			System.out.println("Contado contra liquidacion o CCL: " + contadoContraLiquidacion);
			System.out.println("------------------------------------------");
			
			webDriver.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
