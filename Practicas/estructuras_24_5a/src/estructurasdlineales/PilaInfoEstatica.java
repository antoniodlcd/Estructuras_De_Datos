package estructurasdlineales;

public class PilaInfoEstatica implements AlmacenInfo {
    protected ArregloListaInfoEstatica pila;

    public PilaInfoEstatica(int tamanio) {
        pila = new ArregloListaInfoEstatica(tamanio);
    }

    public boolean vacio() {
        return pila.vacio();
    }
    
    public boolean lleno() {
        return pila.lleno();
    }

    public boolean poner(Object valor) {
        int retorno = pila.nuevo(valor);
        if(retorno >= 0) { // exito
            return true;
        } else { // error
            return false;
        }
    }

    public Object quitar() {
        return pila.quitar();
    }

    public void mostrar() {
        pila.imprimir();
    }

}