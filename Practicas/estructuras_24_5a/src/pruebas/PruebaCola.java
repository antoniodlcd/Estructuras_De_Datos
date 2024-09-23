package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.ColaInfoEstatica;

public class PruebaCola {
    public static void main(String args[]) {
        ColaInfoEstatica cola1 = new ColaInfoEstatica(5);

        cola1.poner("A");
        cola1.poner("B");
        cola1.poner("C");
        cola1.poner("D");
        cola1.poner("E");

        FlujoSalida.mostrarConsola("Elementos de la cola 1:\n");
        cola1.mostrar();

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Sacar " + cola1.quitar() + " de la cola\n");
        cola1.mostrar();

        FlujoSalida.mostrarConsola("Insertar elemento F en la cola: " + cola1.poner("F") + "\n");
        cola1.mostrar();


    }
}
