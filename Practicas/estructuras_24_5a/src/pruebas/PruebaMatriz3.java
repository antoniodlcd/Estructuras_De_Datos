package pruebas;

import entradasalida.FlujoSalida;
import estructurasdnolineales.ArregloListaInfoEstatica3;

public class PruebaMatriz3 {
    public static void main(String argumentosNuncaUsados[]) {
        ArregloListaInfoEstatica3 mat = new ArregloListaInfoEstatica3(5, 4, 3, 0.0);

        mat.imprimirXColumnas();

        mat.cambiar(3, 2, 0, 50);

        FlujoSalida.mostrarConsola("--------------------------------------\n\n");

        mat.imprimirXColumnas();
    }
}
