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
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipoInstitucion(String c){
        tipoInstitucion = c;
    }
    
    public void establecerNumeroAlumno(int c){
        numeroAlumnos = c;
    }
    
    public void establecerNumeroDocente(int c){
        numeroDocentes = c;
    }
    
    public void establecerNumeroSede(int c){
        numeroSedes = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumno(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocente(){
        return numeroDocentes;
    }
    public int obtenerNumeroSede(){
        return numeroSedes;
    }


    
}
