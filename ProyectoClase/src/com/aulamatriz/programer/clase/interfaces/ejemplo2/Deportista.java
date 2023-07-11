package com.aulamatriz.programer.clase.interfaces.ejemplo2;

public class Deportista implements Natacion,IAtletismo{

    @Override
    public void calcularTiempoRespiracion() {
        System.out.println("calculando Respiracion ");
    }

    @Override
    public void nadar() {
        System.out.println("esta nadando");
    }

    @Override
    public void salto() {
        System.out.println("calculando puntos de salto ");
    }

    @Override
    public void salirPiscina() {
        System.out.println("terminar de nadar , saliendo de  la alberca");
    }

    @Override
    public void calcualarVelocidad() {
        System.out.println("calcular velocidad de carrera");
    }

    @Override
    public void cambiarAceleracion() {
        System.out.println("calculando aceleracion");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrnando fuertemente"+Natacion.grabedad);
    }
}
