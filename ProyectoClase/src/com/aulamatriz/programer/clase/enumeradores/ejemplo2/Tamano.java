package com.aulamatriz.programer.clase.enumeradores.ejemplo2;

public enum Tamano {
    PEQUENO("S"),
    MEDIANO("M"),
    GRANDE("L"),
    EXTRA_GRANDE("XL");

    public String talla;

    Tamano(String talla) {
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

}
