package org.example.fabianelo.abril02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //Declarar el scanner
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        String sexo = sc.nextLine();
        int edad = sc.nextInt();
        long numero = sc.nextLong();

        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Numero: " + numero);
    }
}
