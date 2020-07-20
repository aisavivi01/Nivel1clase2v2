package com.sophos.capacitacion.Nivel1Calse8;

import org.openga.selenium.WebDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )  {
        Driver objDriver = new Driver();
        objDriver.lanzarNavegador("google");
        ObjDriver.navergarA("https://www.google.com");
        WebElement cajatexto = objDriver.getDiver().findElement(By.name("q"));
        cajaTexto.sendKeys("Sophos Chronus");
        cajatexto2.submint();
        
        try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        objDriver.cierreNavegador();
    }
}
