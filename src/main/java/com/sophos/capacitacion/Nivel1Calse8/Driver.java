package com.sophos.capacitacion.Nivel1Calse8;

import org.openga.selenium.By;

public class Driver {
   private WebDriver driver;
    
  Public Driver() {
  
  }
    
  Public public webDriver getDriver() {
	return driver;
}

  public void setDriver(webDriver driver) {
	this.driver = driver;
}


void lanzarNavegador(String navegador) {
	  navegador = navegador.toLowerCase();
	  
	  switch (navegador) {
	  case "google":
		  System.setProperty("webdriver.chrome.driver","src\\main\\java\\resources\\drives\\chromedriver.exe");
		  driver = new ChromeDriver();
		  break;
	  case "ie":
		  String rutaDriver = ".\\src\\main\\java\\resources\\drives\\IEDriverServer.exe";
		  System.setProperty("webdriver.ie.driver", rutaDriver);
		  InternetExplorerOptions options = New InternetExplorerOptions();
		  options.ignoreZoomSetings();
		  driver = new InterExplorerDriver(options);
		  break;
	  default:
		  System.out.println("El navegador no existe");
		  break;
		  
	  }
  }
  
  public void navegarA(String url) {
	  driver.get(url);
	  
  }
  
  public void cierreNavegador() {
	  driver.close();
  }
}


