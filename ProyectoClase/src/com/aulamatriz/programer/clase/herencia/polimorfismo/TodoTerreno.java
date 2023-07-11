package com.aulamatriz.programer.clase.herencia.polimorfismo;

public class TodoTerreno extends  Carro{

    private  String tipoTraccion;
    private  boolean esCuatroPorCuatro;


    public TodoTerreno(int llantas, char tipoMotor, String marca, String placa, String dimensiones, String modelo, long km, String cilidraje, String tipoTraccion, boolean esCuatroPorCuatro) {
        super(llantas, tipoMotor, marca, placa, dimensiones, modelo, km, cilidraje);
        this.tipoTraccion = tipoTraccion;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }
}
