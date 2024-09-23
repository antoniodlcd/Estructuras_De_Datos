package pruebas;

import entradasalida.FlujoSalida;
import estructurasdnolineales.ArregloListaInfoEstatica2;

public class PruebaArregloEstatico2 {
    public static void main(String args[]) {
        ArregloListaInfoEstatica2 arr1 = new ArregloListaInfoEstatica2(5, 3, 0);

        // prueba método dato()
        FlujoSalida.mostrarConsola("Dato del arreglo 1 en la posicion (2, 3): " + arr1.dato(2, 3) + "\n");

        FlujoSalida.mostrarConsola("\n");

        // prueba método imprimirXRenglones()
        arr1.imprimirXRenglones();

        // prueba método cambiar()
        FlujoSalida.mostrarConsola("Cambiar las posiciones \n(4,1): " + arr1.cambiar(4, 1, 7) +
                                                          "\n(3,3): " + arr1.cambiar(3, 3, 7) +
                                                          "\n(5,2): " + arr1.cambiar(5, 2, 7) +
                                                          "\n(2,1): " + arr1.cambiar(2, 1, 7) +
                                                          "\n(1,3): " + arr1.cambiar(1, 3, 7) +
                                                          "\npor el valor 7\n");


        FlujoSalida.mostrarConsola("Imprimir la matríz por renglones\n");
        
        arr1.imprimirXRenglones();

        // prueba método imprimirXColumnas
        FlujoSalida.mostrarConsola("Imprimir la matríz por columnas\n");
        
        arr1.imprimirXColumnas();

        // prueba método transpuesta()
        FlujoSalida.mostrarConsola("Cambiar la matríz actual por su transpuesta: \n");

        arr1.transpuesta();

        arr1.imprimirXRenglones();

        // prueba método copiar()
        FlujoSalida.mostrarConsola("Crear una copia del arreglo actual: \n");

        ArregloListaInfoEstatica2 arr1Copia = arr1.copiar();

        FlujoSalida.mostrarConsola("Original:\n");

        arr1.imprimirXRenglones();

        FlujoSalida.mostrarConsola("Copia:\n");

        arr1Copia.imprimirXRenglones();

        // prueba método esIgual()
        FlujoSalida.mostrarConsola("arr1 es igual a arr1Copia: " + arr1.esIgual(arr1Copia) + "\n");

        FlujoSalida.mostrarConsola("Cambiar (1,2) del arr1Copia por un 3: " + arr1Copia.cambiar(1, 2, 3) + "\n");

        arr1Copia.imprimirXRenglones();

        FlujoSalida.mostrarConsola("arr1 es igual a arr1Copia: " + arr1.esIgual(arr1Copia) + "\n");

        // prueba método vectorColumna()
        ArregloListaInfoEstatica2 arr2 = new ArregloListaInfoEstatica2(6,4);

        FlujoSalida.mostrarConsola("Generar una columna de 5 filas con la letra k: " + arr2.vectorColumna(5, "k") + "\n");

        arr2.imprimirXRenglones();

        // pueba método vectorRenglon()
        ArregloListaInfoEstatica2 arr3 = new ArregloListaInfoEstatica2(6,4);

        FlujoSalida.mostrarConsola("Generar una fila de 4 filas con la letra x: " + arr3.vectorRenglon(4, "x") + "\n");

        arr3.imprimirXRenglones();

    }
}
