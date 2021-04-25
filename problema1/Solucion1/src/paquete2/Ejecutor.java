/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Terreno;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Terreno t1 = new Terreno();
        t1.establecerAncho(100);
        t1.establecerLargo(110);
        t1.establecerMetroCuadrado(10);
        t1.calcularArea();
        t1.establecerCosto();
        
        Terreno t2 = new Terreno();
        t2.establecerAncho(200);
        t2.establecerLargo(220);
        t2.establecerMetroCuadrado(20);
        t2.calcularArea();
        t2.establecerCosto();
        
        
        System.out.printf("-----------Terreno 1-----------\nAncho: %s m\n"
                + "Largo: %s m\nCosto del Metro Cuadrado: $ %s\nÁrea: %s m^2\n"
                + "Costo: $ %s\n-------------^*^---------------\n"
                + "-----------Terreno 2-----------\nAncho: %s m\nLargo: %s m\n"
                + "Costo del Metro Cuadrado: $ %s\nÁrea: %s m^2\nCosto: $ %s\n"
                + "-------------^*^---------------\n", 
                t1.obtenerAncho(), t1.obtenerLargo(), 
                t1.obtenerMetroCuadrado(), t1.obtenerArea(), 
                t1.obtenerCosto(), t2.obtenerAncho(), t2.obtenerLargo(),
                t2.obtenerMetroCuadrado(), t2.obtenerArea(), t2.obtenerArea());
        
        
    }
    
}
