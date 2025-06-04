package org.example.fabianelo.Practica1MVC;

import org.example.fabianelo.Practica1MVC.controlador.CalcularMasa;

public class mainPracticaMVC {
    public static void main(String[] args) {
        CalcularMasa calcularMasa = new CalcularMasa();
        calcularMasa.vista.setVisible(true);
    }
}
