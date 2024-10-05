package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.PilaInfoDinamica;

public class PruebaPilasyColasDinamicas {
    public static void main(String[] args) {
        PilaInfoDinamica pila = new PilaInfoDinamica();
        
        // pruebas del método vacio y mostrar
        FlujoSalida.mostrarConsola("La pila está vacía: " + pila.vacio() + "\n");

        // prueba del método poner
        FlujoSalida.mostrarConsola("Agregar X a la Pila: " + pila.poner("X") + "\n");
        FlujoSalida.mostrarConsola("Agregar S a la Pila: " + pila.poner("S") + "\n");
        FlujoSalida.mostrarConsola("Agregar R a la Pila: " + pila.poner("R") + "\n");
        FlujoSalida.mostrarConsola("Agregar A a la Pila: " + pila.poner("A") + "\n");

        FlujoSalida.mostrarConsola("La pila está vacía: " + pila.vacio() + "\n");
        
        pila.mostrar();

        // pruebas del método quitar
        FlujoSalida.mostrarConsola("Quitar un elemento de la pila: " + pila.quitar() + "\n");

        pila.mostrar();

    }
}
