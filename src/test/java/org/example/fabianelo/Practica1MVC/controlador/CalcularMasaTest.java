package org.example.fabianelo.Practica1MVC.controlador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularMasaTest extends CalcularMasa {

    // Test acertado
    @Test
    void testCalcularMasa() {
        assertEquals(24.618105F, calcularMasa(78, 1.78F));
    }

    // Test erróneo
    @Test
    void testCalcularMasa1() {
        assertEquals(27, calcularMasa(76, 1.75F));
    }

    // Test acertado
    @Test
    void testCalcularMasa2() {
        assertEquals(24.816326F, calcularMasa(76, 1.75F));
    }

    //Test para validar que no pasen entradas vacias
    @Test
    void testValidarEntradas() {
        assertEquals("No puede estar vacio ningún campo", validarEntradas("",""));
    }

}