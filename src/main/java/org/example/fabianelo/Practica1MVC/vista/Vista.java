package org.example.fabianelo.Practica1MVC.vista;

import javax.swing.*;

public class Vista extends JFrame {
    private Practica fields;

    public Vista(){
        fields = new Practica();
        setContentPane(fields.mainPanel);
        setTitle("Calcular masa MVC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
    }

    // Métodos para acceder a componentes
    public String getEstatura() {
        return fields.estaturaField.getText();
    }

    public String getPeso() {
        return fields.pesoField.getText();
    }

    public JButton getBotonSaludar() {
        return fields.Calcular;
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public JButton getLimpiar() {
        return fields.limpiar;
    }

    public void limpiar(){
        fields.pesoField.setText("");
        fields.estaturaField.setText("");
    }
}
