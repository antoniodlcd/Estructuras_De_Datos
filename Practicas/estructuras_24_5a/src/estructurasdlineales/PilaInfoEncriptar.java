package estructurasdlineales;

import entradasalida.FlujoSalida;

public class PilaInfoEncriptar extends PilaInfoEstatica {
    protected int tamanio;
    protected PilaInfoEstatica pilaMensaje;

    public PilaInfoEncriptar(int tam) {
        super(tam);
        this.tamanio = tam;
        pilaMensaje = new PilaInfoEstatica(tamanio);
    }

    public PilaInfoEstatica convertirMensaje(String mensaje) {
        try {
            // convertir el mensaje a una lista para poder separar cada caracter
            String[] listaMensaje = mensaje.split("");
            for (String elemento : listaMensaje) {
                // agregar cada elemento de la lista a la pila
                pilaMensaje.poner(elemento);
            }
            return pilaMensaje;
        } catch (Exception e) {
            return null;
        }
    }

    // public PilaInfoEstatica colocarParentesis(int posicionParentesis, int tamanioParentesis) {
    //     // se valida que la pila no esté vacía
    //     if ((this.vacio() == false) && ((posicionParentesis + tamanioParentesis) <= tamanio)) { // no está vacía y los paréntesis están dentro de rango
    //         // se crea un pila temporal, contemplando los espacios extra por los paréntesis
    //         PilaInfoEstatica pilaTemporal = new PilaInfoEstatica(tamanio + 2);
    //         if ((posicionParentesis + tamanioParentesis) == tamanio) { // el paréntesis de cierre va al último
    //             pilaTemporal.poner(")");
    //             // los elementos se colocan en una pila temporal para agregar los paréntesis
    //             for (int cadaElemento = tamanio - 1; cadaElemento >= 0; cadaElemento--) {
    //                 String elemento = (String)pilaMensaje.quitar();
    //                 if ((cadaElemento + 1) == posicionParentesis) { // se encuentra en la posición del paréntesis de apertura
    //                     pilaTemporal.poner("(");
    //                 } else {
    //                     pilaTemporal.poner(elemento);
    //                 }
    //             }
                
    //         } else { // los paréntesis están dentro del mensaje
    //             for (int cadaElemento = tamanio - 1; cadaElemento >= 0; cadaElemento--) {
    //                 String elemento = (String)pilaMensaje.quitar();
    //                 if ((cadaElemento + 1) == (posicionParentesis + tamanioParentesis)) { // se encuentra en la posición del paréntesis de cierre
    //                     pilaTemporal.poner(")");
    //                 } else if ((cadaElemento + 1) == posicionParentesis) { // se encuentra en la posición del paréntesis de apertura
    //                     pilaTemporal.poner("(");
    //                 } else {
    //                     pilaTemporal.poner(elemento);
    //                 }
    //             }
    //         }
    //         // los elementos se vuelven a colocar en la pila original
    //         for (int cadaElemento = tamanio - 1; cadaElemento >= 0; cadaElemento--) {
    //             String elemento = (String)pilaTemporal.quitar();
    //             pilaMensaje.poner(elemento);
    //         }
    //         return pilaMensaje;
    //     } else { // la pila está vacía o los paréntesis están fuera de rango
    //         return null;
    //     }
    // }

    public PilaInfoEstatica colocarParentesis(int posicionParentesis, int tamanioParentesis) {
        if (!this.vacio() && (posicionParentesis >= 0) && (tamanioParentesis > 0) &&
            (posicionParentesis + tamanioParentesis - 1 < tamanio)) {
            
                PilaInfoEstatica pilaTemporal = new PilaInfoEstatica(tamanio + 2);

                for (int cadaElemento = tamanio - 1; cadaElemento >= 0; cadaElemento--) {
                    String elemento = (String)pilaMensaje.quitar();
                    if (cadaElemento == posicionParentesis) {
                        pilaTemporal.poner("(");
                    }
                    pilaTemporal.poner(elemento);

                    if (cadaElemento == (posicionParentesis + tamanioParentesis - 1)) {
                        pilaTemporal.poner(")");
                    }
                }

                this.tamanio = tamanio + 2;

                for (int cadaElemento = tamanio + 1; cadaElemento >= 0; cadaElemento--) {
                    String elemento = (String)pilaTemporal.quitar();
                    pilaMensaje.poner(elemento);
                }
                return pilaMensaje;
        } else {
            return null;
        }
    }

    public boolean voltearPila(PilaInfoEstatica pilaVoltear) {
        return false;
    }

    @Override
    public void mostrar() {
        // se crea una pila temporal para colocar los elementos de la pila invertidos
        PilaInfoEstatica pilaTemporal = new PilaInfoEstatica(tamanio);
        for (int cadaElemento = tamanio-1 ; cadaElemento >= 0; cadaElemento--) {
            String elemento = (String)pilaMensaje.quitar();
            pilaTemporal.poner(elemento);
        }

        // los elementos se vuelven a colocar en la pila original
        // y cada uno, se muestra en la pantalla
        for (int cadaElemento = tamanio-1 ; cadaElemento >= 0; cadaElemento--) {
            String elemento = (String)pilaTemporal.quitar();
            pilaMensaje.poner(elemento);
            FlujoSalida.mostrarConsola(elemento + "");
        }
    }

}
