package org.example.fabianelo.Practica3;

import org.example.fabianelo.Practica1.Computador;

import javax.swing.*;

public class MenuInteractivo {

    Computador computador = new Computador();

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

    public void crearComputador(Computador computador) {
        String[] opciones = {"true", "false"};

        computador.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del computador:", "Computador", JOptionPane.QUESTION_MESSAGE));

        computador.setModelo(JOptionPane.showInputDialog(null, "Ingrese el modelo:", "Modelo", JOptionPane.QUESTION_MESSAGE));

        computador.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio:", "Precio", JOptionPane.QUESTION_MESSAGE)));

        computador.setRam(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la RAM:", "Ram", JOptionPane.QUESTION_MESSAGE)));

        computador.setSsd(Boolean.valueOf((String) JOptionPane.showInputDialog(null, "¿El computador tiene ssd?: (true/false))", "Género", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0])));
    }

    public void listarComputador(Computador computador) {
        if (computador.getModelo() != null) {
            JOptionPane.showMessageDialog(null, "Nombre del computador: " + computador.getNombre() + "\nModelo del computador: " + computador.getModelo() + "\nPrecio del computador: " + computador.getPrecio() + "\nRam del computador: " + computador.getRam() + "\nEl computador tiene SSD: " + computador.getSsd(), "Computador", JOptionPane.QUESTION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el computador");
        }
    }

    public void eliminarComputador(Computador computador) {
        computador.setNombre(null);
        computador.setModelo(null);
        computador.setPrecio(null);
        computador.setRam(null);
        JOptionPane.showMessageDialog(null, "Computador eliminado correctamente");
    }
}
