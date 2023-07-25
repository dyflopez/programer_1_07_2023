package com.aulamatriz.programer.clase.manejoexcepciones;


public class PrincipalExcepciones {

    /**
     * Excpcion
     *
     *  Es un situacion o evento que se lanza en error  o anomalia  en "tiempo de ejecucion" del programa
     *
     *  Se produce debudo a una falla del programa
     *
     *  manejo de exceciones ,
     *   +un Programa puede recuperarce de una excepcion si es tratada correctamente
     *
     * 1)  Cuando uno maneja las excepciones el programa puede correr con normalidad
     * 2) Cuando un programa lanza una excepcion y no es capturada va fallar y se "cerrara"
     * 3)
     */

    public static void main(String[] args) {

        /** En tiempo de ejecucion y en tiempo de compilacion =>
         *
         *
         *  1) Uncheked(No controladas)
         *
         *
         *  2) cheked( controlddas)
         */

        try {
            realizarOperacion();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public static void realizarOperacion() {
        realizarDivision(0,0);
    }
    public static void realizarDivision(int divisor,int dividendo){

        int operacion;

        if(dividendo<=0){
            throw new MiExcepcionPErzonalizada("el dividedendo no puede ser menor a 0");
        }
        if(dividendo==0){
            throw new ArithmeticException("No se puede dividir por 0 rey");
        }

        operacion = divisor/dividendo;
        System.out.println("el resultado es " + operacion);
    }

}
