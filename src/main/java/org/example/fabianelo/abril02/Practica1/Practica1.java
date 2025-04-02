package org.example.fabianelo.abril02.Practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        //Declarar el scanner
        Scanner sc = new Scanner(System.in);

        Computador computador = new Computador();

        System.out.println("Ingrese el nombre del computador: ");
        computador.setNombre(sc.nextLine());

        System.out.println("Ingrese el modelo del computador: ");
        computador.setModelo(sc.nextLine());

        System.out.println("Ingrese el precio del computador: ");
        computador.setPrecio(sc.nextInt());

        System.out.println("Ingrese la ram del computador: ");
        computador.setRam(sc.nextInt());

        System.out.println("Nombre del computador: " + computador.getNombre());
        System.out.println("Modelo del computador: " + computador.getModelo());
        System.out.println("Precio del computador: " + computador.getPrecio());
        System.out.println("Ram del computador: " + computador.getRam());
    }
}
