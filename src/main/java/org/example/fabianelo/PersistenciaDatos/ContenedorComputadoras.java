package org.example.fabianelo.PersistenciaDatos;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ContenedorComputadoras {
    private ArrayList<Compu> compus = new ArrayList<Compu>();

    public void grabarCompuPrimeraVez() {
        ArrayList<Compu> primeras = new ArrayList<Compu>();
        primeras.add(new Compu("Lenovo","ThinkPad",500,8, true));
        primeras.add(new Compu("HP","Compaq",150,16, true));

        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados"));
            archivo.writeObject(primeras);
            archivo.flush();
            archivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar archivo empleados");
        }
    }

    public void grabarCompus() {
        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("ArchivoEmpleados"));
            archivo.writeObject(compus);
            archivo.flush();
            archivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar archivo empleados");
        }
    }

    public void recuperarComputadoras(){
        try {
            ObjectInputStream archivo = null;
            File path = new File("ArchivoEmpleados");
            if (path.exists()){
                archivo = new ObjectInputStream(new FileInputStream("ArchivoEmpleados"));
                compus = (ArrayList<Compu>) archivo.readObject();
                archivo.close();
            }
        } catch (IOException e){

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarCompus(){
        compus.forEach(it -> {
            System.out.println(it.modelo + " | " + it.nombre + " | " + it.ram + " | " + it.precio);
        });
    }

    public void agregarCompu(Compu compu){
        compus.add(compu);
    }
}
