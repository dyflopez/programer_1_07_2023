package com.aulamatriz.programer.clase.statc;

public class Empleado {

    private static int codigoEmplado;

    private String cargo;


    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public Empleado() {
        this.cargo="DEVELOPER";
        this.codigoEmplado=1;
    }
}
