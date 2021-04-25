/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class EquivalenteHora {
    
    private double hora;
    private double minuto;
    private double segundo;
    private double dia;
    
    
    public void establecerHora(double c){
        hora = c;
    }
    public void establecerMinuto(){
        minuto = hora * 60;
    }
    public void establecerSegund(){
        segundo = hora * 3600;
    }
    public void establecerDia(){
        dia = hora / 24;
    }
    public double obtenerHora(){
        return hora;
    }
    public double obtenerMinuto(){
        return minuto;
    }
    public double obtenerSegundo(){
        return segundo;
    }
    public double obtenerDia(){
        return dia;
    }
    

   
    
}
