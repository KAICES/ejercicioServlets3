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
    int carrera;
    double valorCarrera;
    double ingresoMensual;

    public FormularioPersonaVo(String nNombre, int nedad, int ncarrera, double nvalorCarrera, double ningresoMensual) {
        this.nombre = nNombre;
        this.edad = nedad;
        this.carrera = ncarrera;
        this.valorCarrera = nvalorCarrera;        
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

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }
    

    
}
