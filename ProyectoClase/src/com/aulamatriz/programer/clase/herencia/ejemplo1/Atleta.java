package com.aulamatriz.programer.clase.herencia.ejemplo1;

public class Atleta extends  Deportista{
    private  String recordPersonal;
    private String club ;
    private  int id;
    private String categoria;


    public Atleta(String paisOrigen,
                  int numeroMedallas,
                  int edad,
                  double peso,
                  String nombre,
                  String recordPersonal,
                  String club,
                  int id,
                  String categoria
    ) {
        super(paisOrigen, numeroMedallas, edad, peso, nombre, "Atletismo");
        this.recordPersonal = recordPersonal;
        this.club = club;
        this.id = id;
        this.categoria = categoria;
    }

    public String getRecordPersonal() {
        return recordPersonal;
    }

    public void setRecordPersonal(String recordPersonal) {
        this.recordPersonal = recordPersonal;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mensajeShow(){
        System.out.println("soy un atleta");
    }
}
