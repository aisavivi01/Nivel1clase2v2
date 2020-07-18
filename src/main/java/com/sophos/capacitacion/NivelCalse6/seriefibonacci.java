package com.sophos.capacitacion.NivelCalse6;

public class seriefibonacci {
   public static void main(String[] args) {
	   int serie = 50, num1 = 0, num2 = 1;
	   int suma = 1;
	   System.out.println(num1);
	   
	   for (int i=1; i < serie; i++) {
		   System.out.println(suma);
		   suma = num1 + num2;
		   num1 = num2;
		   num2 = suma;
	   
	   }
	   
   }
}
