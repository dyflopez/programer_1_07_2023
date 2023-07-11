package com.aulamatriz.programer.clase.herencia.polimorfismo;

public class Vehiculo {

    private int llantas;
    private char tipoMotor;//H G R N
    private String marca;
    private String placa;
    private String dimensiones;
    private String modelo;
    private long km ;
    private String  cilidraje;

    public Vehiculo(int llantas, char tipoMotor, String marca, String placa, String dimensiones, String modelo, long km, String cilidraje) {
        this.llantas = llantas;
        this.tipoMotor = tipoMotor;
        this.marca = marca;
        this.placa = placa;
        this.dimensiones = dimensiones;
        this.modelo = modelo;
        this.km = km;
        this.cilidraje = cilidraje;
    }

    public Vehiculo(int llantas, char tipoMotor, String marca, String dimensiones, String modelo) {
        this.llantas = llantas;
        this.tipoMotor = tipoMotor;
        this.marca = marca;
        this.dimensiones = dimensiones;
        this.modelo = modelo;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public char getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(char tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public String getCilidraje() {
        return cilidraje;
    }

    public void setCilidraje(String cilidraje) {
        this.cilidraje = cilidraje;
    }


    public  void acelerar(){
        System.out.println("acelerar vehiculo");
    }

    public  void frenar(){
        System.out.println("frenando vehiculo");
    }

    /**Metodo Propio**/
    private   boolean validarChatarrisacion(){
        boolean chatarrisacion = false;
        int anio = Integer.parseInt(modelo);
        if(anio<=1993){
            chatarrisacion=true;
        }
        return chatarrisacion;
    }

}
