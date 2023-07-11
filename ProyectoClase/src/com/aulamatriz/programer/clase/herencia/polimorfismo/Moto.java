package com.aulamatriz.programer.clase.herencia.polimorfismo;

public final class Moto extends  Vehiculo{

    private String tipoMoto;

    private boolean parrilla;


    public Moto(int llantas, char tipoMotor, String marca, String placa, String dimensiones, String modelo, long km, String cilidraje) {
        super(llantas, tipoMotor, marca, placa, dimensiones, modelo, km, cilidraje);
    }

}
