package org.example.fabianelo.PersistenciaDatos;

public class main {
    public static void main(String[] args){
        ContenedorComputadoras contenedor = new ContenedorComputadoras();

        contenedor.recuperarComputadoras();

        contenedor.mostrarCompus();

        contenedor.agregarCompu(new Compu("ASUS", "ROG Army", 600, 8, false));

        contenedor.grabarCompus();

        System.out.println("--------------------");

        contenedor.mostrarCompus();
    }
}
