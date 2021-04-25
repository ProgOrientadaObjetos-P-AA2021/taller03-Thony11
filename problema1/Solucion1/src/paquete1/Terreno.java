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
public class Terreno {

    /**
     * @param args the command line arguments
     */
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerCosto() {
        costo = valorMetroCuadrado * area;
    }

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void establecerMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }

    public double obtenerCosto() {
        return costo;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerMetroCuadrado() {
        return valorMetroCuadrado;
    }

}
