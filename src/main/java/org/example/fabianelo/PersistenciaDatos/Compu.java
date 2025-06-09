package org.example.fabianelo.PersistenciaDatos;

import java.io.Serializable;

public class Compu implements Serializable {
    String nombre;
    String modelo;
    Integer precio;
    Integer ram;
    Boolean ssd = Boolean.FALSE;

    public Compu(String nombre, String modelo, Integer precio, Integer ram, Boolean ssd) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.ram = ram;
        this.ssd = ssd;
    }
}
