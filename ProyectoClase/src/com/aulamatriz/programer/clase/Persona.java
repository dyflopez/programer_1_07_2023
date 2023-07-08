package com.aulamatriz.programer.clase;

import java.util.Date;

public class Persona {
    /**
     * atributos
     * son  propiedes de una clase , son caracteristicas o cualidas de un objeto
     */
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String identificacion;
    private String tipoIdentificacion;

    /**
     * Definir el constructor
     */
    public Persona(String nombre, String apellido, Date fechaNacimiento, String identificacion, String tipoIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }



    /***
     * Metodos
     */
    public String getAll(){
        String output = nombre +" "+ this.apellido+" "+this.fechaNacimiento+" "+ this.identificacion+tipoIdentificacion;
        return output;
    }

    /**
     * Metodos Get y SET
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}
