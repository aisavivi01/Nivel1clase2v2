package com.sophos.capacitacion.NivelCalse6;

public class numeroprimo {
	
  public static boolean esPrimo1(int numero) {
	  if (numero <= 1) {
			  return false;
	  }
	int contador = 0;
	for (int i= (int) Math.sqrt(numero); i> 1; i--) {
		if (numero % i == 0) {
			contador++;
		}
	}
	return contador <1;
  }
  
  public static void main(String[] arg) {
	  int [] numeros = {11, 19, 20, 50, 61, 100};
	  
	  for (int i=0; i< numeros.length; i++) {
		  if (esPrimo1(numeros[i])) {
			  System.out.println("El numero" + numeros[i] + "es primo");
		  }
		  else {
			  System.out.println("El numero" + numeros[i] + "No es primo");
		  }
		  }
					  
		  }

	  }
 