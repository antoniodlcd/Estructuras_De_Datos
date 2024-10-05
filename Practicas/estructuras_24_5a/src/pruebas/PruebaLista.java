package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoDinamica;

public class PruebaLista {
    public static void main(String[] args) {
        
        ArregloListaInfoDinamica lista = new ArregloListaInfoDinamica();
        
        lista.nuevo("X");
        lista.nuevo("A");
        lista.nuevo("C");
        lista.nuevo("D");
        lista.nuevo("H");

        lista.imprimir();
        FlujoSalida.mostrarConsola("\n");

        lista.nuevoInicio("X");
        lista.imprimir();
        FlujoSalida.mostrarConsola("\n");
        FlujoSalida.mostrarConsola("Quitando el inicial: " +
                    lista.quitarInicio() + "\n");
        lista.imprimir();
        FlujoSalida.mostrarConsola("\n");
        FlujoSalida.mostrarConsola("Buscando: " + 
                    lista.buscarObjeto("G") + "\n");
        
    }
}
