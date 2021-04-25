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
public class EquipoCelular {

    private String sistemaOperativo;
    private String tamanoPantalla;
    private double costo;
    private String direccionMac;
    private String informacionImei;

    public void establecerSistemaOperativo(String c) {
        sistemaOperativo = c;
    }

    public void establecerTamanoPantalla(String c) {
        tamanoPantalla = c;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

    public void establecerDireccionMac(String c) {
        direccionMac = c;
    }

    public void establecerInformacionImei(String c) {
        informacionImei = c;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerInformacionImei() {
        return informacionImei;
    }

    public String obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

}
