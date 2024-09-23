package estructurasdlineales;

import entradasalida.FlujoSalida;

public class ColaInfoEstatica implements AlmacenInfo{
    protected Object arreglo[];
    protected int indicePrimero;
    protected int indiceUltimo;
    protected int tamanio;

    public ColaInfoEstatica(int tam) {
        tamanio = tam;
        indicePrimero = -1;
        indiceUltimo = -1;
        arreglo = new Object[tam];
    }

    public boolean vacio() {
        if (indicePrimero == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lleno() {
        if ((indicePrimero == 0 && indiceUltimo == (tamanio -1)) || 
            (indicePrimero == (indiceUltimo + 1))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean poner(Object valor) {
        if (lleno() == false) {
            // los "if" me sirven sólamente para colocar las variables
            // de los índices en el valor correcto
            if (vacio() == true) { // (a)
                indiceUltimo = 0;
                indicePrimero = 0;
                // arreglo[indiceUltimo] = valor;
            } else if (indiceUltimo == (tamanio - 1)) { // (d)
                indiceUltimo = 0;
                // arreglo[indiceUltimo] = valor;
            } else { // (c, e)
                indiceUltimo ++;
                // arreglo[indiceUltimo] = valor;
            }
            arreglo[indiceUltimo] = valor;
            return true;
        } else { // (b)
            return false;
        }
    }

    public Object quitar() {
        if (vacio() == false) {
            Object sacado;
            sacado = arreglo[indicePrimero];
            if (indicePrimero == indiceUltimo) { // (f)
                // sacado = arreglo[indicePrimero];
                indicePrimero = -1;
                indiceUltimo  = -1;
            } else if (indicePrimero == (tamanio - 1)) { // (e)
                // sacado = arreglo[indicePrimero];
                indicePrimero = 0;
            } else { // (b, c, d, g)
                // sacado = arreglo[indicePrimero];
                indicePrimero ++;
            } 
            return sacado;  
            
        } else {
            return null;
        }
    }

    public void mostrar() {
        if (vacio() == false) {
            
            if (indicePrimero <= indiceUltimo) {
                for (int indice = indicePrimero; indice <= indiceUltimo; indice++) {
                    FlujoSalida.mostrarConsola(arreglo[indice] + " ");
                }
            } else {
                for (int indice = indicePrimero; indice < tamanio; indice++) {
                    FlujoSalida.mostrarConsola(arreglo[indice] + " ");
                }
                for (int indice = 0; indice <= indiceUltimo; indice++) {
                    FlujoSalida.mostrarConsola(arreglo[indice] + " ");   
                }
            }
        }    
    }

}
