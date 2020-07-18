package com.sophos.capacitacion.Nivel1Calse2;

import com.sophos.capacitacion.Nivel1Calse4.carro;
import com.sophos.capacitacion.Nivel1Calse4.vehiculo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        vehiculo objvehiculo = new vehiculo();
        objvehiculo.setCantllantas(4);
        objvehiculo.setTipofuente("Energia");
        System.out.println("Numero de llantas : " + objvehiculo.getCantllantas());
        System.out.println("Tipo de  energia : " + objvehiculo.getTipofuente());
    	
        carro objcarro = new carro();
        objcarro.setColor("Verde");
        System.out.println( "Color Carro : " + objcarro.getColor());
    }
}
