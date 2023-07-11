package com.aulamatriz.programer.clase.herencia.ejemplo1;

public class Ciclista extends Deportista{


    private String equipo;
    private String tipoCicla;
    private String rol;

    public Ciclista(String paisOrigen, int numeroMedallas, int edad, double peso, String nombre) {
        super(paisOrigen, numeroMedallas, edad, peso, nombre, "Ciclismo");
    }

    public Ciclista(String paisOrigen,
                    int numeroMedallas,
                    int edad,
                    double peso,
                    String nombre,
                    String deporte,
                    String equipo,
                    String tipoCicla,
                    String rol
    ) {
        super(paisOrigen, numeroMedallas, edad, peso, nombre, deporte);
        this.equipo = equipo;
        this.tipoCicla = tipoCicla;
        this.rol = rol;
    }
}
