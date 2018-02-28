/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.tallerTres.vos;
/**
 *
 * @author Administrador
 */
public class FormularioPersonaVo {
    
    String nombre;
    int edad;
    String carrera;
    float ingresoMensual;

    public FormularioPersonaVo(String nNombre, int nedad, String ncarrera, float ningresoMensual) {
        this.nombre = nNombre;
        this.edad = nedad;
        this.carrera = ncarrera;
        this.ingresoMensual = ningresoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }  
    
}
