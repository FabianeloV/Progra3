package org.example.fabianelo.abril02.Practica1;

public class Computador {
    public String nombre;
    public String modelo;
    public Integer precio;
    public Integer ram;
    public Boolean ssd = Boolean.FALSE;

    public Computador() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Boolean getSsd() {
        return ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }
}
