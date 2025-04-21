package org.example.fabianelo.abril16;

import org.example.fabianelo.Practica1.Computador;

import javax.swing.*;
import java.util.ArrayList;

public class MenuComputadoresArrays {
    ArrayList<Computador> computadores = new ArrayList<>();

    public void mostrar() {
        boolean option = true;

        while (option) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Escoja una opción:
                    1. Listar datos del computador
                    2. Agregar computador
                    3. Eliminar computador
                    4. Salir""", "MENU", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    listarComputadores();
                    break;
                case 2:
                    crearComputador();
                    break;
                case 3:
                    eliminarComputador();
                    break;
                case 4:
                    option = false;
                    break;
                default:
                    System.out.println("Opción inválida\n");
                    break;
            }
        }
    }

    public void listarComputadores() {
        if (computadores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe el computador");
        } else {
            computadores.forEach(computador -> JOptionPane.showMessageDialog(null, "Nombre del computador: " + computador.getNombre() + "\nModelo del computador: " + computador.getModelo() + "\nPrecio del computador: " + computador.getPrecio() + "\nRam del computador: " + computador.getRam() + "\nEl computador tiene SSD: " + computador.getSsd(), "Computador", JOptionPane.QUESTION_MESSAGE));

        }
    }

    public void crearComputador() {
        String[] opciones = {"true", "false"};

        Computador computador = new Computador();

        computador.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del computador:", "Computador", JOptionPane.QUESTION_MESSAGE));

        computador.setModelo(JOptionPane.showInputDialog(null, "Ingrese el modelo:", "Modelo", JOptionPane.QUESTION_MESSAGE));

        computador.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio:", "Precio", JOptionPane.QUESTION_MESSAGE)));

        computador.setRam(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la RAM:", "Ram", JOptionPane.QUESTION_MESSAGE)));

        computador.setSsd(Boolean.valueOf((String) JOptionPane.showInputDialog(null, "¿El computador tiene ssd?: (true/false))", "Género", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0])));

        computadores.add(computador);
    }

    public void eliminarComputador() {
        if (computadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No existe ningún computador");
        } else {
            computadores.removeLast();
            JOptionPane.showMessageDialog(null, "El último computador fue eliminado correctamente");
        }
    }
}
