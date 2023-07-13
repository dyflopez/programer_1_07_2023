package com.aulamatriz.programer.clase.claseanidada.clase.externa;

public class ClaseEnMetodos {

    private int variable=0;
    /**
     * Logica Espesifica de un metodo
     * Implementacion de interfaces espesificas
     */

    public void getSuma() {

        class ClassLocal  {
            public void showMenssage() {
                System.out.println("clase en metodos mensaje , el valor es => " + variable );
            }
        }
        ClassLocal local = new ClassLocal();

        local.showMenssage();

    }
}



