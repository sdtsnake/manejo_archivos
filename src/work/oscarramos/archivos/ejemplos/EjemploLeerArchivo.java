package work.oscarramos.archivos.ejemplos;

import work.oscarramos.archivos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombre = "java.txt";
        String nombre2 = "java2.txt";

        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(nombre));
        System.out.println(servicio.leerArchivo2(nombre2));
    }
}
