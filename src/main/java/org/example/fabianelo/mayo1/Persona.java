package org.example.fabianelo.mayo1;

public class Persona implements Comparable<Persona> {
    public String nombre;
    public int edad;
    public int altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Persona o) {
        return this.altura - o.altura;
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;

        final Persona persona = (Persona) object;

        return this.nombre.equals(persona.nombre) && this.edad == persona.edad && this.altura == persona.altura;
    }
}
