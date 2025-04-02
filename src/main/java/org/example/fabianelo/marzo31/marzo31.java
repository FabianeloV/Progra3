package org.example.fabianelo.marzo31;

import java.util.Date;

public class marzo31 {
    public static void main(String[] args) {
        Persona persona = new Persona("Pablito", 'M', new Date(2004,05,24, 0, 0 ,0), "Estudiante");

        System.out.println("Nombre de la persona: "+ persona.nombre);
        System.out.println("Sexo: "+ persona.getSexo());

        persona.setNombre("Fabianelo");
        System.out.println("Nuevo nombre de la persona: "+ persona.nombre);

        System.out.println("Fecha: "+ persona.fechaNacimiento.toString());
    }
}
