package com.aulamatriz.programer.clase.interfaces;

import com.aulamatriz.programer.clase.interfaces.ejemplo1.Circulo;
import com.aulamatriz.programer.clase.interfaces.ejemplo1.Rectangulo;
import com.aulamatriz.programer.clase.interfaces.ejemplo2.Deportista;

public class MainInterfaces {

    /**
     * Una interfaz como una plantilla que define el formato que debe tener los metodos ,
     *
     * ejemplo de metodos
     *
     * public void/tipoRetorno nombreMetodo(parametro1,...);
     *
     * Se puede realizar "herencia multiple" Implementacion multiple
     *
     * Caracteristicas de una interfaz
     * 1) tiene la palabrareserbada interface
     * 2) los  metodos no tienen cuerpo
     * 3) las interfaces pueden exteneder de otras interfaces
     */

    /**
     *  diferencias entre Interfaz y clase abtracta
     *
     *  clase abstracta
     *  1) Puede tener metodos abstractactos como metodos con contenido
     *  2)  puede tener un constructor
     *  3) solo permite una herencia simple
     *  4) puede tener atributos
     *
     *  Interfaz
     *  1)Solo puede tener metodos sin contenido
     *  2)no puede tener atributos
     *  3) puede ser implementada por varias clases o interfaces
     *
     */
    public static void main(String[] args) {
        System.out.println("ejemplo 1 ");

        Circulo circulo = new Circulo(1.2);
        System.out.println("el area del circulo es  =" + circulo.calcularArea());
        System.out.println("el area del perimetr es  =" + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(10,20.4);
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

        System.out.println("Ejemplo 2");
        Deportista deportista = new Deportista();
        deportista.nadar();
        deportista.calcualarVelocidad();
        deportista.salto();
        deportista.estiloNado();
        deportista.estiloSaludo();

    }
}
