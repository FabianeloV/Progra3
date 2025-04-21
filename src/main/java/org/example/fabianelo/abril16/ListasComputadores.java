package org.example.fabianelo.abril16;

import java.util.LinkedList;

public class ListasComputadores {
    public static void main(String[] args) {
        MenuComputadoresArrays menu = new MenuComputadoresArrays();
        menu.mostrar();

        //Listas ligadas
        LinkedList<String> listaLigada = new LinkedList<>();

        listaLigada.add("Fabianelo");
        listaLigada.add("Pabloski");

        listaLigada.forEach(System.out::println);

        if (listaLigada.contains("Fabianelo")){
            System.out.println("Si está");
        }
    }
}
