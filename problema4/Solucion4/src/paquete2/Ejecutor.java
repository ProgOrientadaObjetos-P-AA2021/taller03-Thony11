/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.EquipoCelular;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    public static void main(String[] args) {

        EquipoCelular ec1 = new EquipoCelular();
        ec1.establecerSistemaOperativo("Samsung");
        ec1.establecerTamanoPantalla("1142x1002");
        ec1.establecerCosto(544.22);
        ec1.establecerDireccionMac("00:1B:44:11:3A:B7");
        ec1.establecerInformacionImei("358817100532063");

        EquipoCelular ec2 = new EquipoCelular();
        ec2.establecerSistemaOperativo("Iphone");
        ec2.establecerTamanoPantalla("1792 x 828 ");
        ec2.establecerCosto(1000.22);
        ec2.establecerDireccionMac("12:1G:45:10:5B:B6");
        ec2.establecerInformacionImei("3583111350534263");

        System.out.printf("---------Equipo Celular---------\n"
                + "Sistema Operativo: %s\n"
                + "Tamaño de pantalla: %s\nCosto: %s\nDireccion Mac: %s\n"
                + "Informacion IMEI: %s\n---------Equipo Celular---------\n"
                + "Sistema Operativo: %s\n"
                + "Tamaño de pantalla: %s\nCosto: %s\nDireccion Mac: %s\n"
                + "Informacion IMEI: %s\n", ec1.obtenerSistemaOperativo(),
                ec1.obtenerTamanoPantalla(), ec1.obtenerCosto(),
                ec1.obtenerDireccionMac(), ec1.obtenerInformacionImei(),
                ec2.obtenerSistemaOperativo(),
                ec2.obtenerTamanoPantalla(), ec2.obtenerCosto(),
                ec2.obtenerDireccionMac(), ec2.obtenerInformacionImei());

    }

}
