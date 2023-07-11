package com.aulamatriz.programer.clase.herencia.polimorfismo;

public class Camion extends Vehiculo{

    private  double capacidad;
    private  String tipoCarga;
    private  boolean sistemaEnfriamiento;


    public Camion(int llantas, char tipoMotor, String marca, String placa, String dimensiones, String modelo, long km, String cilidraje, double capacidad, String tipoCarga, boolean sistemaEnfriamiento) {
        super(llantas, tipoMotor, marca, placa, dimensiones, modelo, km, cilidraje);
        this.capacidad = capacidad;
        this.tipoCarga = tipoCarga;
        this.sistemaEnfriamiento = sistemaEnfriamiento;
    }

    public  void acelerar(){
        System.out.println("el camion esta acelerando");
    }


}
