
package com.sophos.capacitacion.NivelCalse6;

public class ordenamientoburbuja {
  public static void main(String[] args) {
	int [] arre = {1, 23, 10, 9, 5};
	burbuja(arre);
  }
  
  public static void burbuja(int[] A) {
	int j,k,aux;
	boolean f=false;
	String pasada = "";
	for (k=0;k<A.length;k++) {
		for (j=1;j<A.length;j++) {
			if(A[j]<A[j-1]) {
				aux=A[j];
				A[j]=A[j-1];
				A[j-1]=aux;
				System.out.println("A[j]="+A[j]+"A[j-1]"+A[j-1]+"AUX"+aux);
				for (int i=0;i<A.length;i++) {
					pasada+=""+Integer.toString(A[i]);
				}
				System.out.println("Arreglo A={"+ pasada+"}");
				pasada="";
			}
			
		}
	}
  }
}
