package org.example.fabianelo.abril23;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class MenuClientes {
    Queue<String> clientes = new LinkedList<>();

    public void mostrar() {
        boolean option = true;

        while (option) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Escoja una opción:
                    1. Agregar cliente
                    2. Atender cliente
                    3. Listar clientes
                    4. Salir""", "MENU", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    atenderCliente();
                    break;
                case 3:
                    mostrarClientes();
                    break;
                case 4:
                    option = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida","ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void mostrarClientes() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados", "LISTAR CLIENTES", JOptionPane.INFORMATION_MESSAGE);
        } else {
            clientes.forEach(cliente -> JOptionPane.showMessageDialog(null, cliente, "LISTAR CLIENTES", JOptionPane.INFORMATION_MESSAGE)
            );
        }

    }

    private void atenderCliente() {
        if (clientes.isEmpty()) {
           JOptionPane.showMessageDialog(null, "No hay clientes para atender", "ATENDER",  JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente " + clientes.poll() + " ha sido  atendido.", "ATENDER", JOptionPane.QUESTION_MESSAGE);
        }
    }

    private void agregarCliente() {
       clientes.add(JOptionPane.showInputDialog(null, "Ingresar nombre del cliente:", "AGREGAR", JOptionPane.QUESTION_MESSAGE));

    }
}
