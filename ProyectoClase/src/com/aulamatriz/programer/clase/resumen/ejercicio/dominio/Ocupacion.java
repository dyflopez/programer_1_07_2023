package com.aulamatriz.programer.clase.resumen.ejercicio.dominio;

public class Ocupacion {

    private int codigo;

    private String nombre;

    public Ocupacion(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
