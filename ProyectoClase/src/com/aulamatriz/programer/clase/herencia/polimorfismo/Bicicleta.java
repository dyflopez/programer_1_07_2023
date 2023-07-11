package com.aulamatriz.programer.clase.herencia.polimorfismo;

public class Bicicleta extends  Vehiculo{

    private String tipoCicla;

    private  boolean patos;


    public Bicicleta(int llantas, char tipoMotor, String marca, String dimensiones, String modelo, String tipoCicla, boolean patos) {
        super(llantas, tipoMotor, marca, dimensiones, modelo);
        this.tipoCicla = tipoCicla;
        this.patos = patos;
    }

    //Polimorfismo
    @Override
    public  void acelerar(){
        System.out.println("la bicicleta esta  acelerando");
    }

    public  void acelerar(int aceleracion){
        System.out.println("la bicicleta esta  acelerando a la velocidad de " +  aceleracion );
    }
}
