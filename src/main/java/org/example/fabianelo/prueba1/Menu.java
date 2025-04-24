package org.example.fabianelo.prueba1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;


public class Menu {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    boolean agregado = false;

    String[] diccionario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] granDiccionario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] especiales = {"#", "&", "!", "@", "$", "%", ".", ",", "*", "/", "+", "-", "_", "?", "¿", "¡"};

    public void mostrarMenu() {
        boolean option = true;
        while (option) {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Seleccione opcion:
                    1 -Ingresar cuenta
                    2 -Mostrar cuentas
                    3 -Autocompletar usuarios
                    4 -Salir""", "MENU", JOptionPane.INFORMATION_MESSAGE));

            switch (opc) {
                case 1:
                    ingresarCuenta();
                    break;
                case 2:
                    mostrarUsuarios();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias");
                    option = false;
                    break;
                    case 3:
                        autoCompletar();
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }
    }

    public void autoCompletar() {
        if (agregado) {
            JOptionPane.showMessageDialog(null, "Los usuarios ya han sido agregados", "Agregar", JOptionPane.ERROR_MESSAGE);
        } else {
            //Usuario 1 con setters
            Usuario usuario = new Usuario();
            usuario.setNombres("Fabian Verdesoto");
            usuario.setNombreUsuario("Fabianelo");
            usuario.setContrasenia("Fabian29#");
            usuarios.add(usuario);

            //Usuario 2 con setters
            Usuario usuario2 = new Usuario();
            usuario2.setNombres("Karen Gomez");
            usuario2.setNombreUsuario("Karencita");
            usuario2.setContrasenia("Karen30%");
            usuarios.add(usuario2);
            agregado = true;
            JOptionPane.showMessageDialog(null, "2 Usuarios agregados");
        }
    }

    public void ingresarCuenta() {
        //Instanciamos el usuario
        Usuario usuario = new Usuario();

        // Nombres y apellidos
        usuario.setNombres(JOptionPane.showInputDialog(null, "Ingrese los nombres y apellidos"));
        while (usuario.getNombres().isEmpty() || usuario.getNombres().length() < 4) {
            usuario.setNombres(JOptionPane.showInputDialog(null, "Ingrese un nombre y apellido valido"));
        }

        // Nombre de usuario
        String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        while (nombreUsuario.length() < 4 || nombreUsuarioRepetido(nombreUsuario)) {
            nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese un nombre de usuario valido");
        }
        usuario.setNombreUsuario(nombreUsuario);


        // Contraseña
        String contrasenia = JOptionPane.showInputDialog(null, "Ingrese la contraseña");
        while (validarContrasenia(contrasenia)) {
            contrasenia = JOptionPane.showInputDialog(null, "Ingrese una contraseña valida");
        }
        usuario.setContrasenia(contrasenia);

        //Agregamos el usuario al Array
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado");
    }

    public void mostrarUsuarios() {
        // Validamos que se haya agregado al menos un usuario
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay nigun usuario para mostrar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //En caso de que hayan, los listamos todos
            usuarios.forEach(u -> JOptionPane.showMessageDialog(null, "Nombres: " + u.getNombres() + "\nNombre de usuario: " + u.getNombreUsuario() + "\nContrasenia: " + u.getContrasenia()));
        }
    }

    public boolean validarContrasenia(String contrasenia) {

        //Validar contraseña vacia
        if (contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña no debe ser vacia", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar largo de la contraseña
        if (contrasenia.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar minusculas
        if (!minuscula(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una minuscula", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar mayusculas
        if (!mayuscula(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una mayuscula", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar numeros
        if (!numero(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos un numero", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar caracteres especiales
        if (!especial(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos un caracter especial", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        //Validar que la contraseña no esté repetida
        if (repetida(contrasenia)) {
            JOptionPane.showMessageDialog(null, "La contraseña ya está en uso", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    //Validar que la contraseña contenga al menos uno de los valores del diccionario de minusculas
    public boolean minuscula(String contrasenia) {
        for (int i = 0; i < diccionario.length; i++) {
            if (contrasenia.contains(diccionario[i])) {
                return true;
            }
        }
        return false;
    }

    //Validar que la contraseña contenga al menos uno de los valores del diccionario de mayusculas
    public boolean mayuscula(String contrasenia) {
        for (int i = 0; i < granDiccionario.length; i++) {
            if (contrasenia.contains(granDiccionario[i])) {
                return true;
            }
        }
        return false;
    }

    //Validar que la contraseña contenga al menos uno de los valores del diccionario de numeros
    public boolean numero(String contrasenia) {
        for (int i = 0; i < numeros.length; i++) {
            if (contrasenia.contains(numeros[i])) {
                return true;
            }
        }
        return false;
    }

    //Validar que la contraseña contenga al menos uno de los valores del diccionario de caracteres especiales
    public boolean especial(String contrasenia) {
        for (int i = 0; i < especiales.length; i++) {
            if (contrasenia.contains(especiales[i])) {
                return true;
            }
        }
        return false;
    }

    //Validar que la contraseña no este en la lista de usuarios
    public boolean repetida(String contrasenia) {
        if (usuarios.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (Objects.equals(usuarios.get(i).getContrasenia(), contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Validar que el nombre de usuario no este en la lista de usuarios
    public boolean nombreUsuarioRepetido(String nombre) {
        if (usuarios.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (Objects.equals(usuarios.get(i).getNombreUsuario(), nombre)) {
                    JOptionPane.showMessageDialog(null, "El nombre del usuario ya esta en uso", "Error", JOptionPane.ERROR_MESSAGE);
                    return true;
                }
            }
        }
        return false;
    }

}
