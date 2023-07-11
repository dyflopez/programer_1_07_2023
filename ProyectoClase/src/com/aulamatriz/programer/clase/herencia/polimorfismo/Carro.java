package com.aulamatriz.programer.clase.herencia.polimorfismo;

public class Carro  extends Vehiculo {

    private int numeroVentanas;
    private int numeroPuertas;


    public Carro(int llantas, char tipoMotor, String marca, String placa, String dimensiones, String modelo, long km, String cilidraje) {
        super(llantas, tipoMotor, marca, placa, dimensiones, modelo, km, cilidraje);
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public  void acelerar(){
        System.out.println("el carro esta aceletando ");
    }
}
