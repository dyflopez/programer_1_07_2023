package com.aulamatriz.programer.clase.resumen.ejercicio.dominio;

import com.aulamatriz.programer.clase.resumen.ejercicio.base.BaseEmpleado;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoMedioTiempo extends BaseEmpleado {

    private double valorHora;
    private  double horasTrabajas;

    public EmpleadoMedioTiempo(String nombre, String apellido, String tipoDocumento, String documento, String telefono, String nacionalidad, char genero, boolean activo, LocalDate fechaNacimiento, List<Ocupacion> ocupacionList, double valorHora, double horasTrabajas) {
        super(nombre, apellido, tipoDocumento, documento, telefono, nacionalidad, genero, activo, fechaNacimiento, ocupacionList);
        this.valorHora = valorHora;
        this.horasTrabajas = horasTrabajas;
    }


    @Override
    public double getEdad() {
        return 0;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajas() {
        return horasTrabajas;
    }

    public void setHorasTrabajas(double horasTrabajas) {
        this.horasTrabajas = horasTrabajas;
    }
}
