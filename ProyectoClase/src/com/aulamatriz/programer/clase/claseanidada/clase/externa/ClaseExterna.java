package com.aulamatriz.programer.clase.claseanidada.clase.externa;

public class ClaseExterna {

    private  int valor;
    /**
     * Organizar o encapzular mi codigo (Seguridad)
     * Podemos usarla para una creacion de datos internos de nuestra clase
     * Comportamientos
     *
     * Estructurade componentes complejos :
     */
    public class ClaseAnidad{

        public void mostrarValor(String mensaje){
            System.out.println("Valor del menseaje es " + mensaje + " El valor es => "+valor);
        }

    }
}
