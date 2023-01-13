package work.oscarramos.archivos.ejemplos;

import work.oscarramos.archivos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "java.txt";
        String nombreArchivo2 = "java2.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);

        service.crearArchivo2(nombreArchivo2);
    }
}
