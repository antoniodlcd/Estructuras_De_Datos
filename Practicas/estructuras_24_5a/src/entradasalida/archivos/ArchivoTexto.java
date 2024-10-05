package entradasalida.archivos;

// import entradasalida.*;
import estructurasdlineales.*;
import java.io.*;

public class ArchivoTexto {

    public static ArregloListaInfoEstatica leer(String archivo) {
        FileReader input = null;
        // int registro = 0;
        ArregloListaInfoEstatica datos = null;
        BufferedReader buffer = null;

        try {
            String cadena = null;
            input = new FileReader(archivo);
            buffer = new BufferedReader(input);
            datos = new ArregloListaInfoEstatica((int)buffer.lines().count());
            buffer.close();
            input.close();
            input = new FileReader(archivo);
            buffer = new BufferedReader(input);
            while ((cadena = buffer.readLine()) != null) {
                datos.nuevo(cadena);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                buffer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return datos;
    }
    
    public static void escribir(ArregloListaInfoEstatica arreglo, String archivo) {
        FileWriter output = null;
        try {
            output = new FileWriter(archivo);
            for (int posicion = 0; posicion < arreglo.numDatos() - 1; posicion++) {
                output.write((String)arreglo.dato(posicion) + "\n");
            }
            output.write((String)arreglo.dato(arreglo.numDatos() - 1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
