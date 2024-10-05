package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.PilaInfoEncriptar;

public class PruebaPilaEncriptar {
    public static void main(String[] args) {
        // probar el método de convertirMensaje
        String mensaje = "Hola Mundo";
        PilaInfoEncriptar pila1 = new PilaInfoEncriptar(mensaje.length());
        PilaInfoEncriptar pila2 = new PilaInfoEncriptar(mensaje.length());

        pila1.convertirMensaje(mensaje);

        // prueba del metodo convertirMensaje
        pila1.mostrar();

        FlujoSalida.mostrarConsola("\n");
        
        FlujoSalida.mostrarConsola("Colocar paréntesis dentro del mensaje en la posición 2 y de tamaño 4: \n" + pila1.colocarParentesis(2, 4));
        pila2 = (PilaInfoEncriptar)pila1.colocarParentesis(2, 4);

        if (pila2 != null) {
            pila2.mostrar();
        } else {
            FlujoSalida.mostrarConsola("No se pudieron colocar los paréntesis");
        }

        pila1.mostrar();
        FlujoSalida.mostrarConsola("\n");
        pila2.mostrar();
    }
}
