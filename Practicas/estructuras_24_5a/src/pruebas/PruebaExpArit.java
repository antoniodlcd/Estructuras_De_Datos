package pruebas;

import entradasalida.FlujoSalida;
import herramientas.Matematicas;

public class PruebaExpArit {
    public static void main(String nadiePasa[]) {
        
        //abc*de-f^/+
        //234432
        //234*43-2^/+
        FlujoSalida.mostrarConsola("La expresión 234*43-2^/+ evaluada es: " + Matematicas.evaluarPostfija("234*43-2^/+"));

    }
}