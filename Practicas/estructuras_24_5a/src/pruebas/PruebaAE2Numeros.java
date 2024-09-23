package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstaticaNumeros;
import estructurasdnolineales.ArregloListaInfoEstatica2Numeros;
import estructurasdnolineales.ArregloListaInfoEstatica2Numeros.TipoLogaritmo;

public class PruebaAE2Numeros {
    public static void main(String[] args) {
        ArregloListaInfoEstatica2Numeros arr1 = new ArregloListaInfoEstatica2Numeros(5, 5, 5);

        // imprimir matríz inicial
        FlujoSalida.mostrarConsola("Matríz inicial:\n");
        arr1.imprimirXRenglones();

        // multiplicar los elementos de arr1 por el escalar 3
        FlujoSalida.mostrarConsola("Elementos del arr1 multiplicados por el escalar 3: " + arr1.porEscalar(3) + "\n");
        arr1.porEscalar(3);
        arr1.imprimirXRenglones();

        // multiplicar por un conjunto de escalares
        FlujoSalida.mostrarConsola("Multiplicando por un conjunto de escalares:\n");
        ArregloListaInfoEstaticaNumeros escalares = new ArregloListaInfoEstaticaNumeros(5);
        escalares.nuevo(1);
        escalares.nuevo(2);
        escalares.nuevo(3);
        escalares.nuevo(4);
        escalares.nuevo(5);
        arr1.porEscalares(escalares);
        arr1.imprimirXRenglones();

        // sumar un escalar a todos lo elementos de arr1
        FlujoSalida.mostrarConsola("Sumando el escalar 5 a todos los elementos:\n");
        arr1.sumarEscalar(5);
        arr1.imprimirXRenglones();

        // aplicar potencia de 2 a los elementos de arr1
        FlujoSalida.mostrarConsola("Aplicando potencia de 2 a todos los elementos:\n");
        arr1.aplicarPotencia(2);
        arr1.imprimirXRenglones();

        // Aplicar logaritmo en base 10 a todos los elementos de arr1
        FlujoSalida.mostrarConsola("Aplicando logaritmo en base 10 a todos los elementos:\n");
        arr1.aplicarLogaritmo(TipoLogaritmo.BASE10);
        arr1.imprimirXRenglones();

        // probar si la matríz es diagonal superior
        FlujoSalida.mostrarConsola("¿Es arr1 una matríz diagonal superior?: " + arr1.esDiagonalSuperior() + "\n");
        
        // probar si la matríz es diagonal inferior
        FlujoSalida.mostrarConsola("¿Es arr1 una matríz diagonal inferior?: " + arr1.esDiagonalInferior() + "\n");

        // redimensionar por renglones (sumando)
        FlujoSalida.mostrarConsola("Redimensionando matríz sumando renglones:\n");
        arr1.doblarRenglones();
        arr1.imprimirXRenglones();

        // redimensionar por columnas (sumando)
        FlujoSalida.mostrarConsola("Redimensionando matríz sumando columnas:\n");
        
    }
}
