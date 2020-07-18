package com.sophos.capacitacion.Nivel1Calse4;

public class vehiculo {
  
  private int cantllantas;
  private String tipofuente;
  private String color;
  
  public vehiculo() {
	  cantllantas = 0;
	  tipofuente = null;
  }

public int getCantllantas() {
     return cantllantas;
}

public void setCantllantas(int cantllantas) {
	this.cantllantas = cantllantas;
}

public String getTipofuente() {
	return tipofuente;
}

public void setTipofuente(String tipofuente) {
	this.tipofuente = tipofuente;
}
  
}
