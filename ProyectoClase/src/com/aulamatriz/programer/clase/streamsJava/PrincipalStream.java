package com.aulamatriz.programer.clase.streamsJava;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrincipalStream {

    /**
     *
     *
     * Objeto que permite realizar de formas rapia y sencilla operaciones como :
     *  Busquedas
     *  Filtrado
     *  Recoleccion
     *  todo esto sobre un grupo de datos (Collection)
     *
     *  1)Para manipular un Stream se utiliza la interfaz Stream de JAva.util.stream,
     *  2)Si se va trabajar con primitivos se usa DoubleString , IntegerStream
     *  3) Recorre dato a dato desde el principio hasta el fin
     *
     *    Ventajas
     *
     *    1)Programacion declarativa : Los Streams permiten Escribir codigo en un estilo mas comprendicble y claro
     *    2)Operaciones funcionales : Usa lamda p ionterfaces como map, filter, reduce,collect
     *    3)Eficiencia y paralelismo: Los Stram pueden aprovechar automaticamente el paralelismo(procesos la mismo tiempo)
     *    para procesas grandes volumenes de datos
     *    4)No es Mutable :
     *    5)Facilita el filtrado de datos
     *
     *    Existen dos tipos de Streams ( dos metodos de Stream)
     *
     *    1)Metodo Intermedio : El resultado de su ejecucion es un nuevo Stream : Filtrados ,Transformaciones de datos
     *    o Ordenamientos
     *    2) Metodos Finles:Generan un resultado final  , Busquedas, reducciones , calculos
     *
     */

    public static void main(String[] args) {
        //PrincipalStream.declararStream();
        //PrincipalStream.streamConteoProcesos();
        //PrincipalStream.streamDiferente();
        //streamLimite();
        //streamComprobacion();
       // streamFiltro();
        streamTransformacion();


    }

    public static  void streamTransformacion(){
        /**
         * Transformacion ,
         * map: trasforma cada elemento en otro
         */

        List<String > nombreList = new ArrayList<>();
        nombreList.add("daniel");
        nombreList.add("diana");
        nombreList.add("mac");
        nombreList.add("casa");
        nombreList.add("a");

       var contarValores = nombreList
                .stream()
                .mapToInt(elemto -> elemto.length())
                .map( e-> e+20)
                .peek(n -> System.out.println(n))
                .filter(v -> v>10 )
               .anyMatch(v-> v>5)
               ;

        System.out.println("el total de los caracteres es " + contarValores);

    }
    public static  void declararStream (){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(1);
        numeros.add(22);
        numeros.add(60);
        numeros.add(20);
        //DECLARAR Y USAR LOS STREAMS
        System.out.println("Pasando un stream dedsde un arreglo");
        Stream<Integer> numerStream =  numeros.stream();

        numerStream.forEach(a-> System.out.println(a));
        System.out.println("usando Stream desde un Arreglo");
        numeros.stream().forEach(a-> System.out.println(a));

        //PASAR DE UN VECTOR A UN STREAM

        System.out.println("PASAR DE UN VECTOR A UN STREAM");
        String[] cadenasVec ={"a","b","c","d"};

        Stream<String> cadenaStram = Arrays.stream(cadenasVec);
        cadenaStram.forEach(a-> System.out.println(a));

        Arrays.stream(cadenasVec).forEach(a-> System.out.println(a));


        //Declarar Stream para valores primitivos
        System.out.println("Stream Primitivos");
        System.out.println("Stream Primitivos range");
        IntStream prmitivoIntStream =  IntStream.range(1,10);
        prmitivoIntStream.forEach(a-> System.out.println(a));


        System.out.println("Stream Primitivos rangeClose");
        IntStream prmitivoIntStreamClose =  IntStream.rangeClosed(1,10);
        prmitivoIntStreamClose.forEach(a-> System.out.println(a));
    }

    public static void streamLimite(){

        /**
         *
         * Limit  Devuelve un nuevo Stream con los N primeros elementos
         */

        var lista =retornarListInteger();

        System.out.println("Imprimir los primeros 3 elementos");
        lista
                .stream()
                .limit(3)
                .forEach(System.out::println);

        /**
         *
         * skip se saltan los n primeros elementos
         */

        System.out.println("saltar los n elementos");

        retornarListInteger()
                .stream()
                .skip(4)
                .forEach(System.out::println);

    }

    public static  void streamFiltro(){
        /**
         * Filter : aplica un fiultro sobre el Stream y devuelve un nuevo stream con base a un predicado
         */

        retornarListInteger()
                .stream()
                .filter(n-> n>80)
                .forEach(System.out::println);

        //optener el primer dato
        var optonal= retornarListInteger()
                .stream()
                .filter(n-> n>110000)
                .findFirst();

        /**if(optonal.isPresent()){
            System.out.println(optonal.get());
        }**/
        //optonal.stream().forEach(integer -> System.out.println(integer));
        var numeroDefaul = optonal.orElse(90);

        //OPTIONAL
        System.out.println( numeroDefaul );
    }

    public static  void streamDiferente(){
        /**
         *  distinct (distinto) : Devuelve un Stream que elimina los elementos duplicado
         *  Metodo Final
         */
        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(2);
        numerosList.add(20);
        numerosList.add(26);
        numerosList.add(90);
        numerosList.add(2);
        numerosList.add(90);

        System.out.println("mostrando datos no repetidos");
          numerosList
                 .stream()
                 .distinct()
                 // .forEach(n-> System.out.println(n));
                  .forEach(System.out::println);
          //CREAR EL FOR EACTH
        // CREAR UN IF
        //CREAR UN VECTOR O LIST NUEVA o MOSTRAR


        System.out.println("mostrando stream");

        numerosList.stream().forEach(n-> System.out.println(n));
        System.out.println("mostrando metodo por referencia");

        numerosList.stream().forEach(System.out::println);

        System.out.println("for eacth");
        for (int numero : numerosList) {
            System.out.println(numero);
        }






    }

    public static  void streamComprobacion(){

        //Cree una condicion Predicate para ser utilizada en el Stream
        Predicate<Integer> validarMayorOchenta= numero -> numero==90;
        /**
         *   boolean  anyMatch : Devuelve true si algun elemento cumple con las condiciones del predicado
         */

        var bandera = retornarListInteger()
                .stream()
               // .anyMatch(numero -> numero>80);
                .anyMatch(validarMayorOchenta);


        System.out.println("anyMatch es  = "  +bandera);

        /**
         *   boolean  allMatch : Devuelve true si todos cumplen con la condicion de predicado
         */
         bandera = retornarListInteger()
                .stream()
                // .anyMatch(numero -> numero>80);
                .allMatch(validarMayorOchenta);


        System.out.println("allMatch es  = "  +bandera);


        /**
         *   boolean  nonMatch : Devuelve true si ninguno cumple con la condicionc
         */
        bandera = retornarListInteger()
                .stream()
                // .anyMatch(numero -> numero>80);
                .noneMatch(validarMayorOchenta);


        System.out.println("noneMatch es  = "  +bandera);
    }


    public static  void streamConteoProcesos(){
        /**
         *  count : Devuelve el numero de elementos de un Stream
         */

        List<Integer>  numerosList = new ArrayList<>();
        numerosList.add(2);
        numerosList.add(3);
        numerosList.add(4);
        numerosList.add(5);

        //contar cuantos valores tiene el List
        System.out.println("contando por metodo size");
        System.out.println("tamaño es " + numerosList.size());

        System.out.println("contando por medio de un STREAM");

        Stream conteoStream = numerosList.stream();

        System.out.println("Contando con Stream");
        System.out.println("conteo con Stream es " + conteoStream.count());

        System.out.println("Contando con ArrayList y Stream");


        System.out.println("conteo con Stream es " +  numerosList.stream().count());

        long tamano = numerosList.stream().count();

        System.out.println("tamano asignado es " + tamano);

        /**
         * cuando un Stream es abierto o utilizado no se puede volver a usar ya que los datos fueron extraidos
         * y se cierra el Stream
         */
        //como se pasaron los datos de nuevo , el Stram vuelve a tener los valores
        conteoStream= numerosList.stream();
        long tamano2 = conteoStream.count();

        System.out.println("tamano asignado es " + tamano2);


    }


    public static  List<Integer>  retornarListInteger(){
        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(2);
        numerosList.add(20);
        numerosList.add(26);
        numerosList.add(90);
        numerosList.add(2);
        numerosList.add(50);
        numerosList.add(98);
        numerosList.add(60);
        numerosList.add(80);

        return numerosList;
    }

}
