package org.example.fabianelo.abril07;

import javax.swing.*;

public class JOptionPaneExample {
    public static void main(String[] args) {
        String[] genders = {"Masculino", "Femenino"};
        Usuario usuario = new Usuario();
        usuario.setName(JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Usuario", JOptionPane.QUESTION_MESSAGE));
        usuario.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad:", "Edad", JOptionPane.QUESTION_MESSAGE)));
        usuario.setGender((String) JOptionPane.showInputDialog(null, "Ingrese su género:", "Género", JOptionPane.QUESTION_MESSAGE, null, genders, genders[0]));

        JOptionPane.showMessageDialog(null, "Hola " + usuario.getName() + "\nTu edad es: " + usuario.getAge() + "\nTu género es: " + usuario.getGender(), "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
}
