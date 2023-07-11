package com.aulamatriz.programer.clase.herencia.polimorfismo;



public class MainPolimorfismo {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(2,'G',"Audi","UBT203","100x100","2023",10,"12000 Lt");
        Camion camion = new Camion(2,'G',"Audi","UBT203","100x100","2023",10,"12000 Lt",200.20,"alimenros",true);
        Bicicleta ciclista = new Bicicleta(2,'G',"RX","10x10","2000","Electrica",false);

        vehiculo.acelerar();
        camion.acelerar();
        ciclista.acelerar(20);

        TodoTerreno todoTerreno=  new TodoTerreno(2,'G',"Audi","UBT203","200x100","2023",10000,"14000 turbo","aplica",true);
        System.out.println("todo Terreno");
        todoTerreno.acelerar();
        /**
         *
         */
        Vehiculo vehiculo1 = new Carro(2,'G',"Audi","UBT203","200x100","2023",10000,"14000 turbo");

        vehiculo1.acelerar();


    }
}
