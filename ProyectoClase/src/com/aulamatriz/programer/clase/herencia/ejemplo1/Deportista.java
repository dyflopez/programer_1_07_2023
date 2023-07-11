package com.aulamatriz.programer.clase.herencia.ejemplo1;

public class Deportista {
    /**
     * Atributos
     */
    private String paisOrigen ;
    private int numeroMedallas;
    private int edad;
    private double peso;
    private String nombre;
    private  String deporte;

    /**
     * Constructores
     */
    public Deportista(String paisOrigen, int numeroMedallas, int edad, double peso, String nombre, String deporte) {
        this.paisOrigen = paisOrigen;
        this.numeroMedallas = numeroMedallas;
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
        this.deporte = deporte;
    }

    /**
     * Metodos
     */

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumeroMedallas() {
        return numeroMedallas;
    }

    public void setNumeroMedallas(int numeroMedallas) {
        this.numeroMedallas = numeroMedallas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }


    public void  entrenar(){
        System.out.println(nombre + " esta entrenando");
    }

    public void  competir(){
        System.out.println(nombre + " esta Compitiendo");
    }

    private void  receso(){
        System.out.println(nombre + " esta descansando");
    }
}
