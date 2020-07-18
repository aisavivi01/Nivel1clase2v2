package com.sophos.capacitacion.NivelCalse6;
import java.util.Scanner;

public class numeromayor {
  public static void main(String [] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  int i= 0;
	  int[] numeros = new int[10];
	  int mayor =0;
	  
	  System.out.println("lectura de los elementos del array:");
	  for (i=0; i < 10; i++) {
		  System.out.print("numeros ["+ i +"]=");
		  numeros [i] = sc.nextInt();
		  }
      for (i=0; i<10; i++) {
    	  if (numeros[i]> mayor) {
    		  mayor = numeros [i];
    		  }
      }
      System.out.println("el numero mayor es : "+ mayor);
  }
  }
