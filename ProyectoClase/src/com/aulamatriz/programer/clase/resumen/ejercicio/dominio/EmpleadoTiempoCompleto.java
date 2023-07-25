package com.aulamatriz.programer.clase.resumen.ejercicio.dominio;

import com.aulamatriz.programer.clase.resumen.ejercicio.base.BaseEmpleado;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoTiempoCompleto  extends BaseEmpleado {

    private  double salario;

    private  boolean primaExtralegal;

    public EmpleadoTiempoCompleto(String nombre, String apellido, String tipoDocumento, String documento, String telefono, String nacionalidad, char genero, boolean activo, LocalDate fechaNacimiento, List<Ocupacion> ocupacionList) {
        super(nombre, apellido, tipoDocumento, documento, telefono, nacionalidad, genero, activo, fechaNacimiento, ocupacionList);
    }

    @Override
    public double getEdad() {
        return 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isPrimaExtralegal() {
        return primaExtralegal;
    }

    public void setPrimaExtralegal(boolean primaExtralegal) {
        this.primaExtralegal = primaExtralegal;
    }
}
