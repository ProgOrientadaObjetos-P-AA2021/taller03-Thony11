/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.EquivalenteHora;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        EquivalenteHora eh1 = new EquivalenteHora();
        eh1.establecerHora(56);
        eh1.establecerMinuto();
        eh1.establecerSegund();
        eh1.establecerDia();
        
        EquivalenteHora eh2 = new EquivalenteHora();
        eh2.establecerHora(256);
        eh2.establecerMinuto();
        eh2.establecerSegund();
        eh2.establecerDia();
        
        System.out.printf("---------------*-*---------------\n"
                + "\tHoras: %s\nEquivalente en minutos: %s\n"
                + "Equivalente en segundos: %s\nEquivalente en días: %.2f\n"
                + "---------------*-*---------------\n"
                + "\tHoras: %s\nEquivalente en minutos: %s\n"
                + "Equivalente en segundos: %s\nEquivalente en días: %.2f\n", 
                eh1.obtenerHora(), eh1.obtenerMinuto(), 
                eh1.obtenerSegundo(), eh1.obtenerDia(),
                eh2.obtenerHora(), eh2.obtenerMinuto(), eh2.obtenerSegundo(),
                eh2.obtenerDia());
    }
    
}
