package org.example.fabianelo.Practica1MVC;

import org.example.fabianelo.Practica1MVC.controlador.CalcularMasa;
import org.example.fabianelo.Practica1MVC.vista.Vista;

public class mainPracticaMVC {
    public static void main(String[] args) {
        Vista vista = new Vista();
        CalcularMasa calcularMasa = new CalcularMasa(vista);
        vista.setVisible(true);
    }
}
