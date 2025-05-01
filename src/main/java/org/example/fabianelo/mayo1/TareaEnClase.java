package org.example.fabianelo.mayo1;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TareaEnClase {
    public static void main(String[] args){
        Set<Persona> personaSet = new HashSet<>();
        SortedSet<Persona> personaSortedSet = new TreeSet<>();

        Persona persona1 = new Persona();
        persona1.setNombre("Abian");
        persona1.setEdad(21);
        persona1.setAltura(180);

        Persona persona2 = new Persona();
        persona2.setNombre("Baniel");
        persona2.setEdad(20);
        persona2.setAltura(170);

        System.out.printf("Diferencia de alturas: " + persona1.compareTo(persona2) + "\n");


        personaSet.add(persona2);
        personaSet.add(persona1);

        personaSortedSet.add(persona2);
        personaSortedSet.add(persona1);

        System.out.println("\nSet:");
        personaSet.forEach(persona -> System.out.println(persona.getNombre() + " - " + persona.getEdad() + " - " + persona.altura + " cm"));

        System.out.println("\nSorted Set:");
        personaSortedSet.forEach(persona -> System.out.println(persona.getNombre() + " - " + persona.getEdad() + " - " + persona.altura + " cm"));

    }
}
