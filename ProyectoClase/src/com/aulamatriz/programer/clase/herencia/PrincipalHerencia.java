package com.aulamatriz.programer.clase.herencia;

import com.aulamatriz.programer.clase.herencia.ejemplo1.Atleta;
import com.aulamatriz.programer.clase.herencia.ejemplo1.Ciclista;
import com.aulamatriz.programer.clase.herencia.ejemplo1.Corredor;

public class PrincipalHerencia {
    /**
     * Es una caracteristica que permite crear nuevas clases apartir de clases existentes
     * en la cual gereda lo del padre o lo ya existente
     *
     */

    /**
     *
     * No existe la herencia Multiple
     * NO se accede a los metodos/atributos Privados
     * Si contiene la palabra final no se hereda
     */

    public static void main(String[] args) {
        Ciclista ciclista = new Ciclista("Colombia",10,20,80.19,"Gabriel");

        ciclista.competir();

        Atleta atleta =
                new Atleta("Colombia",
                        10,
                        20,
                        80.19,
                        "Juan",
                        "10 minutos 1000 m",
                        "Pajarito",
                        1,
                        "Expertos");

        atleta.competir();


        Corredor corredor = new Corredor("Colombia",
                10,
                20,
                80.19,
                "Daniel",
                "10 minutos 1000 m",
                "Pajarito",
                1,
                "Expertos");

        corredor.mensajeShow();
        corredor.entrenar();
    }

}
