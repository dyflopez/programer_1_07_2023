package com.aulamatriz.programer.clase.interfaces.ejemplo2;

public interface Natacion {

    /**
     * interfaces no puedo puedo crear atributos
     */
    double grabedad = 0;

    double CONSTANTE_GRABEDAD = 0;

    default void estiloNado(){
        System.out.println("El estido de ando es mariposa");
    }

    default void estiloSaludo(){
        System.out.println("El estido de ando es mariposa");
    }


    void calcularTiempoRespiracion();
    void nadar();
    void salto();
    void salirPiscina();

    void entrenar();

}
