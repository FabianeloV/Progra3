package org.example.fabianelo.Practica1MVC.controlador;

import org.example.fabianelo.Practica1MVC.vista.Vista;

public class CalcularMasa {
    public Vista vista = new Vista();
    public CalcularMasa(){
        vista.getBotonSaludar().addActionListener(e -> {
            vista.mostrarMensaje(validarEntradas(vista.getPeso(), vista.getEstatura()));
        });

        vista.getLimpiar().addActionListener(e -> {
            vista.limpiar();
        });
    }

    public String validarEntradas(String peso, String altura){
        if(peso.isEmpty() || altura.isEmpty()){
            return "No puede estar vacio ningún campo";
        }

        int pesoInt;
        float alturaFloat;

        try {
            pesoInt = Integer.parseInt(peso);
        } catch (Exception e){
            return "Peso ingresado en formato incorrecto";
        }

        try {
            alturaFloat = Float.parseFloat(altura);
        } catch (Exception e){
            return "Altura ingresada en formato incorrecto";
        }

        if(pesoInt < 0){
            return "Peso negativo, ingrese un peso válido";
        }
        if(alturaFloat < 0){
            return "Altura negativa, ingrese un altura válida";
        }

        String mayorMenor;

        if (calcularMasa(pesoInt, alturaFloat) > 26) {
            mayorMenor = "Correspondiente a sobrePeso";
        } else {
            mayorMenor = "Correspondiente a índice normal";
        }

        return "Su índice de masa corporal es: " + calcularMasa(pesoInt, alturaFloat) + "\n" + mayorMenor;
    }

    public Float calcularMasa(int peso, Float altura){
        return peso/(altura*altura);
    }
}
