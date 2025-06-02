package org.example.fabianelo.Practica1MVC.controlador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularMasaTest extends CalcularMasa {

    @Test
    void testCalcularMasa() {
        assertEquals(24.618105F, calcularMasa(78, 1.78F));
    }
}