package org.example.fabianelo.abril02.Practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        Computador computador = new Computador();

        boolean option = true;

        while (option) {
            menu.mostrarOpciones();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    menu.listarComputador(computador);
                    break;
                case 2:
                    menu.crearComputador(computador);
                    break;
                case 3:
                    menu.eliminarComputador(computador);
                    break;
                case 4:
                    option = false;
                    break;
                default:
                    System.out.println("Opción no valida\n");
                    break;
            }
        }
    }
}
