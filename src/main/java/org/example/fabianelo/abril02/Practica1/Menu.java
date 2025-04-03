package org.example.fabianelo.abril02.Practica1;

import java.util.Scanner;

public class Menu implements MenuInterfaz {
    Scanner sc = new Scanner(System.in);

    Computador computador = new Computador();

    public Menu() {}

    public void mostrar() {
        boolean option = true;

        while (option) {
            mostrarOpciones();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    listarComputador(computador);
                    break;
                case 2:
                    crearComputador(computador);
                    break;
                case 3:
                    eliminarComputador(computador);
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

    @Override
    public void mostrarOpciones() {
        System.out.print("------------------------------------\n");
        System.out.println("Escoja una opción: ");
        System.out.println("1. Listar datos del computador");
        System.out.println("2. Agregar computador");
        System.out.println("3. Eliminar computador");
        System.out.println("4. Salir");
        System.out.print("------------------------------------\n");
    }

    @Override
    public void crearComputador(Computador computador) {
        //Declarar el scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del computador: ");
        computador.setNombre(sc.nextLine());

        System.out.println("Ingrese el modelo del computador: ");
        computador.setModelo(sc.nextLine());

        System.out.println("Ingrese el precio del computador: ");
        computador.setPrecio(sc.nextInt());

        System.out.println("Ingrese la ram del computador: ");
        computador.setRam(sc.nextInt());

        System.out.println("¿El computador tiene ssd?: (true/false))");
        computador.setSsd(sc.nextBoolean());
    }

    @Override
    public void listarComputador(Computador computador) {
        if (computador.getModelo() != null) {
            System.out.println("Nombre del computador: " + computador.getNombre());
            System.out.println("Modelo del computador: " + computador.getModelo());
            System.out.println("Precio del computador: " + computador.getPrecio() + "$");
            System.out.println("Ram del computador: " + computador.getRam() + "Gb");
            System.out.println("Ssd: " + computador.getSsd() + "\n");
        } else {
            System.out.println("El computador no existe\n");
        }
    }

    @Override
    public void eliminarComputador(Computador computador) {
        computador.setNombre(null);
        computador.setModelo(null);
        computador.setPrecio(null);
        computador.setRam(null);
        System.out.println("Computador eliminado correctamente\n");
    }
}
