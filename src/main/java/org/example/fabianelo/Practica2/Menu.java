package org.example.fabianelo.Practica2;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    ComputadorComplejo[] computadoresComplejos = new ComputadorComplejo[10];

    public Menu() {
    }


    public void mostrar() {
        boolean option = true;

        while (option) {
            mostrarOpciones();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    listarComputadores(computadoresComplejos);
                    break;
                case 2:
                    agregarComputadorComplejo();
                    break;
                case 3:
                    option = false;
                    break;
                default:
                    System.out.println("Opción invalida\n");
                    break;
            }
        }
    }


    public void mostrarOpciones() {
        System.out.print("----------------MENU----------------\n");
        System.out.println("Escoja una opción: ");
        System.out.println("1. Listar datos de los computadores");
        System.out.println("2. Agregar computador");
        System.out.println("3. Salir");
        System.out.print("------------------------------------\n");
    }

    public void agregarComputadorComplejo() {
        for (int i = 0; i < computadoresComplejos.length; i++) {
            if (computadoresComplejos[i] == null) {
                computadoresComplejos[i] = crearComputador();
                System.out.println("\nComputador creado");
                break;
            }

            if (i == computadoresComplejos.length - 1 && computadoresComplejos[i] != null) {
                System.out.println("\nNo se pueden agregar mas computadores");
            }
        }
    }


    public ComputadorComplejo crearComputador() {
        //Declarar el scanner
        Scanner sc = new Scanner(System.in);

        ComputadorComplejo computador = new ComputadorComplejo();
        Programa programa = new Programa();

        System.out.println("Ingrese el nombre del computador: ");
        computador.setNombre(sc.nextLine());

        System.out.println("Ingrese el modelo del computador: ");
        computador.setModelo(sc.nextLine());

        System.out.println("Ingrese el precio del computador: ");
        computador.setPrecio(sc.nextInt());

        System.out.println("Ingrese la ram del computador: ");
        computador.setRam(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el programa del computador: ");
        programa.setNombre(sc.nextLine());

        System.out.println("Ingrese la version del programa del computador: ");
        programa.setVersion(sc.nextInt());

        computador.setPrograma(programa);

        return computador;
    }

    public void listarComputadores(ComputadorComplejo[] computadores) {
        if (computadoresComplejos[0] == null){
            System.out.println("\nNo hay computadores para listar\n");
            return;
        }
        for (ComputadorComplejo computador : computadores) {
            if (computador != null) {
                System.out.println("\nNombre del computador: " + computador.getNombre());
                System.out.println("Modelo del computador: " + computador.getModelo());
                System.out.println("Precio del computador: " + computador.getPrecio() + "$");
                System.out.println("Ram del computador: " + computador.getRam() + "Gb");
                System.out.println("Programa: " + computador.getPrograma().getNombre() + " - Version " + computador.getPrograma().getVersion() + "\n");
            } else {
                break;
            }
        }

    }
}
