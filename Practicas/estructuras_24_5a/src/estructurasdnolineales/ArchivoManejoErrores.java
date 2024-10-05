package estructurasdnolineales;

import entradasalida.FlujoSalida;
import entradasalida.archivos.ArchivoTexto;
import estructurasdlineales.ArregloListaInfoEstatica;
import estructurasdlineales.ColaInfoEstatica;
import estructurasdlineales.PilaInfoEstatica;

public class ArchivoManejoErrores {
    protected ArregloListaInfoEstatica lineasArchivo;
    protected String archivoErrores = "src\\\\estructurasdnolineales\\\\ArchivoErrores.txt";

    public ArchivoManejoErrores(String archivo){
        lineasArchivo = ArchivoTexto.leer(archivo);
    }

    public void validarSmbolos(ArregloListaInfoEstatica lineasArchivo) {
        PilaInfoEstatica pilaSimbolos = new PilaInfoEstatica(lineasArchivo.numDatos());
        ColaInfoEstatica colaErrores = new ColaInfoEstatica(lineasArchivo.numDatos());
       
       // iterar cada linea del archihvo
       for (int numLinea = 0; numLinea < lineasArchivo.numDatos(); numLinea++) {
            String linea = (String)lineasArchivo.dato(numLinea);

            // iterar cada elemento de la linea
            for (int cadaElemento = 0; cadaElemento < linea.length(); cadaElemento++) {
                char elemento = linea.charAt(cadaElemento);

                // si es un simbolo de apertura, se agrega a la pila
                if (esSimboloApertura(elemento) == true) {
                    pilaSimbolos.poner(elemento);
                } else if (esSimboloCierre(elemento) == true) {
                    // se valida que haya primero un simbolo de apertura
                    if (pilaSimbolos.vacio()) {
                        colaErrores.poner("Error: Línea " + (numLinea + 1) + ", carácter " + (cadaElemento + 1) + ": Faltó abrir " + aperturaCorrespondiente(elemento));
                    } else {
                        char simboloApertura = (char)pilaSimbolos.quitar();
                        if (!validarBalanceo(simboloApertura, elemento)) {
                            colaErrores.poner("Error: Línea " + (numLinea + 1) + ", carácter " + (cadaElemento + 1) + ": Faltó cerrar " + simboloApertura);
                        }
                    }
                }
            }
        }

        while (!pilaSimbolos.vacio()) {
            char simboloApertura = (char)pilaSimbolos.quitar();
            colaErrores.poner("Error: Faltó cerrar " + simboloApertura);
        }

        // ArchivoTexto.escribir(colaErrores, archivoErrores);

    }

    public boolean esSimboloApertura(char elemento) {
        
        return elemento == '(' || 
               elemento == '[' || 
               elemento == '{';
    }

    public boolean esSimboloCierre(char elemento) {
        
        return elemento == ')' || 
               elemento == ']' || 
               elemento == '}';

    }

    public boolean validarBalanceo(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') || 
               (apertura == '[' && cierre == ']') ||  
               (apertura == '{' && cierre == '}');
    }

    public char aperturaCorrespondiente(char cierre) {
        switch (cierre) {
            case ')':
                return '(';
            case ']':
                return '{';
            case '}':
                return '{';
            default:
                return ' ';
        }
    }

    public void imprimirErrores(ColaInfoEstatica colaErrores) {
        if (colaErrores.vacio()) {
            FlujoSalida.mostrarConsola("No hay errores que imprimir.");
        }

        colaErrores.mostrar();
    }
}
