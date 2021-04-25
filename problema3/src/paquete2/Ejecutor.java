/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.InstitucionEducativa;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    public static void main(String[] args) {
        InstitucionEducativa ins1 = new InstitucionEducativa();

        ins1.establecerNombre("Miguel Riofrio");

        ins1.establecerTipoInstitucion("Publica");

        ins1.establecerNumeroAlumno(100);

        ins1.establecerNumeroDocente(10);

        ins1.establecerNumeroSede(2);

        System.out.printf("---------Datos Institucionales--------\nNombre: %s\n"
                + "Tipo Institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n",
                 ins1.obtenerNombre(), ins1.obtenerTipoInstitucion(),
                ins1.obtenerNumeroAlumno(), ins1.obtenerNumeroDocente(),
                ins1.obtenerNumeroSede());

    }

}
