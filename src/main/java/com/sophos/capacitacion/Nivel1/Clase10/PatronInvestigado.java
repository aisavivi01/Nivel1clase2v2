
package com.sophos.capacitacion.Nivel1.Clase10;

// patron de diseño prototype //
// permite la creciòn de objetos basados en plantillas.
// un nuevo objeto se crea a partir de la clonaciòn de otro objeto.

import java.util.*;
public class PatronInvestigado {
	// se tiene una fabrica de camisetas con estampado para crear una similar
	// se modifica el color, la talla y el estampado
	// se inicia con el prototipo:
	
	public abstract class camiseta{
		private String nombre;
		private Integer talla;
		private String color;
		private String manga;
		private String estampado;
		private Object material;
		
		public camiseta(String nombre, Integer talla, String color, String manga, String estampado, Object material) {
			this.nombre = nombre;
			this.talla = talla;
			this.color = color;
			this.manga = manga;
			this.estampado = estampado;
			this.material = material;
	
		}
	public abstract camiseta clone();
	}
	
	public class camisetaMcorta extends camiseta{
		public camisetaMcorta (Integer talla, String color, String estampado) {
			this.nombre "prototipo";
			this.talla = talla;
			this color = color;
			this.manga = "corta";
			this.estampado = estampado;
			this.material = new lana();
			}
		public camiseta clone() {
			return new camisetaMcorta(this.talla, this color, this.estampado);
		}
	}
	
}
	