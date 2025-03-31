package org.example.fabianelo;

import org.example.fabianelo.marzo31.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pablito", 'M', new Date(2004,05,24), "Estudiante");

        System.out.println("Nombre de la persona: "+ persona.nombre);
        System.out.println("Sexo: "+ persona.getSexo());

        persona.setNombre("Fabianelo");
        System.out.println("Nuevo nombre de la persona: "+ persona.nombre);
    }
}