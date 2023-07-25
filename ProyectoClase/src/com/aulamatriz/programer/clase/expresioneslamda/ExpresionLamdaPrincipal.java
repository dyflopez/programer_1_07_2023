package com.aulamatriz.programer.clase.expresioneslamda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExpresionLamdaPrincipal {

    /**
     * Sintaxis
     *  (Parametros)->(lo que se va a realizar)  Lambda ->
     *
     *  es una funcion anonima que puede ser tratada como un valor,
     *
     *  Los parametros pueden ser indicatos con un tipo pero no es obligatorio
     *
     *  (a,b) ->.....
     *  (int a, int b) -> .....
     *
     *  Las lamda puede retornar o no un resultado, en caso de devolver un resultado no es necesario usar el return
     *
     *  Ventaja
     *      1)Concision de codigo (codigo corto) : permite escribir funciones cortas y claras en una sola linea
     *      2)Programacion funcional:Facilita la adopcion de enfoques de programacion funcional o reactiva
     *      3)Mejoras : Tiene metodos para interactuar mas rapido con los datos, forEach , map , filter
     *      4)Facilita el uso de hilo y concurrencia : es muy sencillo de implementar
     *      5)Mayor rendimiento : en cierto casos las expreciones lambda pueden mejorar el rendimiento en la gestion
     *      de datos
     *
     *      Interfaz funcional: Proporcionan un solo metodo
     *
     */

    public static void main(String[] args) {

      // ExpresionLamdaPrincipal.ejemploPredicate();
      //ExpresionLamdaPrincipal.ejemploFuction();
      //ExpresionLamdaPrincipal.ejemploConsumer();
      //ExpresionLamdaPrincipal.ejemploSupplier();



    }


    public static void ejemploSupplier(){

        /**
         * Dispone del metodo abstracto get que no recibe ningun parametro y devuelve un objeto
         *
         * produce un valor sin nececesidad de recibir algun parametro
         */
        Supplier<Integer> generarNumerosAleatoreos = ()-> new Random().nextInt(100)+1;
        int numeroAleatorio=0;
        for (int i=0;i<4;i++){
             numeroAleatorio = generarNumerosAleatoreos.get();
            System.out.println(numeroAleatorio);
        }

        System.out.println("imprimendo fecha actual");

        Supplier<LocalDate> obtenerHoraActual = LocalDate::now;


        LocalDate fechaActual = obtenerHoraActual.get();
        System.out.println("la fecha actual es " + fechaActual);

        // es una refrencia a un metodo  , "method referens"

    }
    public static void ejemploConsumer(){
        /**
         *
         * Consumer
         * Dispone un metodo abstracto accept
         * Se utiliza en operaciones de procesameinto de datos
         */

        System.out.println("Interfaz Consumer");
        List<String> nombresList = Arrays.asList("daniel","juan","yesid");
        Consumer<String> imprimirNombre = nombre-> System.out.println(nombre);
        for (String nombre: nombresList) {
            System.out.println(nombre);
        }

        System.out.println("aplicando el consumer");

        nombresList.forEach(imprimirNombre);


        // Consumer<String> imprimirNombre = nombre-> System.out.println(nombre);
        Consumer<String> imprimierCadena = System.out::println;

        imprimierCadena.accept("hola , esto es un mensaje");

    }

    public static  void ejemploPredicate(){


        /**
         * INTERFAZ PREDICATE
         *
         * Realiza una comparacion
         */
        System.out.println("INTERFAZ PREDICATE");

        Predicate<Integer> validateNumbersPair= numero -> numero % 2==0;

        //imprimir los numeros pares del Arreglo
        List<Integer> numeros  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //(numero%2==0)->System.out.println("es par");
        //forma 1
        System.out.println("Validando con el for ");
        for(int numero: numeros){
            if(numero%2==0){
                System.out.println(numero);
            }
        }

        System.out.println("usando predicate en un forEach");
        for(int numero: numeros){
            if(validateNumbersPair.test(numero)){
                System.out.println(numero);
            }
        }

        System.out.println("imprimiendo numeros pares con forma 2");
        numeros
                .forEach(numero ->{
                    if(validateNumbersPair.test(numero)){
                        System.out.println(numero);
                    }
                });
        //forma 2
        System.out.println("Validando con el stream y interfaz Predicate");
        numeros
                .stream() //1,2,3,4,5,6,7,8,9,10
                .filter(validateNumbersPair)//2 ,4,6,8,10
                .forEach(valor -> System.out.println(valor));//2 ,4,6,8,10

        Predicate<String> validarTamanoCadena= cadena -> cadena.length() >5;


        System.out.println(validarTamanoCadena.test("Daniel Yesid Florez"));//true
        System.out.println(validarTamanoCadena.test("juan"));//false

        System.out.println("aplicando referencia a metodos ::");
        Predicate <String> esCadenaVacia = String::isEmpty;

        System.out.println(esCadenaVacia.test(""));
        System.out.println(esCadenaVacia.test("Daniel"));

    }

    public static void ejemploFuction(){
        /**
         *  interfaz function
         *
         *  un objeto realiza una operacion y devuelve un resultado => Realiza una transformacion
         */

        Function<String,String>  crearMensaje =  nombre -> "hola rey " + nombre;

        System.out.println(crearMensaje.apply("juan"));
        System.out.println(crearMensaje.apply("Daniel Florez"));

        List<String> listaNombres =  List.of("Daniel", "yesid","juan");

        //Ejemplo 2
        System.out.println("Imprimier por for");
        for (String nombre : listaNombres){
            String mensaje = crearMensaje.apply(nombre);
            System.out.println(mensaje);
        }

    }


}
