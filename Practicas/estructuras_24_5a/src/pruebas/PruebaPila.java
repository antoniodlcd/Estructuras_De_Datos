package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.PilaInfoEstatica;

public class PruebaPila {
    public static void main(String alumnosReprobados[]) {
        PilaInfoEstatica pila = new PilaInfoEstatica(6);

        pila.poner("B");
        pila.poner("A");
        pila.poner("S");
        pila.poner("P");
        pila.poner("T");
        pila.mostrar();

        FlujoSalida.mostrarConsola("Eliminando algo de la pila: " + pila.quitar() + "\n");

        pila.mostrar();
    }
}
