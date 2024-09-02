package herramientas;

public class UtileriasVarias {

    // este método compara dos objetos, regresándome un valor:
    // positivo: objeto1 > objeto2
    // negativo: objeto1 < objeto2
    // igual a cero: objeto1 = objeto2
    public static int compararObjetos(Object objeto1, Object objeto2) {
        // detectar cuando los objetos son números
        if ((objeto1 instanceof Number) == true && (objeto2 instanceof Number) == true) {
            double numero1 = Double.parseDouble(objeto1.toString());
            double numero2 = Double.parseDouble(objeto2.toString());
         
            if (numero1 > numero2) {
                return 1;
            }else if (numero1 < numero2) {
                return -1;
            } else {
                return 0;
            }
        } else { // detectar cuando los objetos no son números
            // el método compareTo compara dos cadenas y retorna:
            //      positivo si cadena 1 es mayor que cadena 2,
            //      negativo si cadena 1 es menor que cadena 2,
            //      cero si son iguales
            return objeto1.toString().compareToIgnoreCase(objeto2.toString());
        }

    }
}
