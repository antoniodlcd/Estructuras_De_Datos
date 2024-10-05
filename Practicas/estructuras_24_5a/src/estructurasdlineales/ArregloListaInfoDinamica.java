package estructurasdlineales;

import entradasalida.FlujoSalida;
import estructurasdlineales.auxiliares.NodoBusqueda;

public class ArregloListaInfoDinamica implements ArregloListaDatos{
    protected Nodo inicio;
    protected Nodo fin;

    public ArregloListaInfoDinamica() {
        inicio = null;
        fin = null;
    }
    
    public boolean vacio(){
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unused")
    public Integer nuevo(Object valor){
        Nodo nuevo = new Nodo(valor);
        if (nuevo == null) {
            return -1;
        }
        if (vacio() == true) {
            // Nodo nuevo = new Nodo(valor);
            // if (nuevo == null) {
            //     return -1;
            // }
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Nodo nuevo = new Nodo(valor);
            // if (nuevo == null) {
            //     return -1;
            // }
            fin.nodoDerecho = nuevo;
            fin = nuevo;
        }
        return 1;
    }

    @SuppressWarnings("unused")
    public Integer nuevoInicio(Object valor) {
        // paso 1
        Nodo nuevo = new Nodo(valor);
        if (nuevo == null) { // ya no hay espacio de memoria
            return -1;
        }
        if (vacio() == true) { // a)
            // paso 2
            inicio = nuevo;
            fin = nuevo;
        } else { // b)
            // paso 2
            nuevo.setNodoDerecho(inicio);
            // paso 3
            inicio = nuevo;
        }
        return 1;  // satisfactorio
    }

    public void imprimir(){
        Nodo temporal = inicio;
        while (temporal != null) {
            FlujoSalida.mostrarConsola(temporal.getInfo() + " -> ");
            temporal = temporal.getNodoDerecho();
        }
        FlujoSalida.mostrarConsola("null");
    }

    public void imprimirReves(){

    }

    public Integer buscar(Object valor){
        return null;
    }

    public Object quitar(Object valor){
        if (vacio() == false) { // sí hay elementos
            NodoBusqueda nodoRetorno = buscarNodo(valor);
            Object respaldo = nodoRetorno.getBuscado().getInfo();
            if (nodoRetorno.getBuscado() == null) { // el valor buscado no está
                return null;
            } else { // sí se puede eliminar algo
                if (inicio == fin) { // es el único nodo
                    inicio = null;
                    fin = null;
                } else if (nodoRetorno.getBuscado() == fin) {
                    nodoRetorno.getAnterior().setNodoDerecho(null);
                    fin = nodoRetorno.getAnterior();
                } else if (nodoRetorno.getBuscado() == inicio) {
                    inicio = nodoRetorno.getBuscado().getNodoDerecho();
                } else {
                    Nodo anterior = nodoRetorno.getAnterior();
                    Nodo siguiente = nodoRetorno.getBuscado().getNodoDerecho();
                    anterior.setNodoDerecho(siguiente);
                }
                return respaldo;
            }
        } else {
            return null;
        }
    }

    public Boolean esIdentico(Object arreglo2) {
        return false;
    }

    public Boolean modificar(Object valorViejo, Object valorNuevo, int cuantasVeces) {
        return false;
    }

    public ArregloListaInfoEstatica buscarValores(Object valor) {
        return null;
    }

    // se elimina el último elemento del arreglo
    public Object quitar() {
        NodoBusqueda nodoRetorno;
        Object respaldo;
        if (vacio() == false) { // no está vacío
            nodoRetorno = buscarNodo(fin.getInfo());
            respaldo = nodoRetorno.getBuscado().getInfo();
            if (inicio == fin) { // sólo hay un nodo
                fin = null;
                inicio = null; 
            } else { // hay más de un nodo
                fin = nodoRetorno.getAnterior();
                fin.setNodoDerecho(null);
            }
            return respaldo;
        } else { // sí está vacío
            return null;
        }
    }

    public Object quitarInicio() {
        if (vacio() == true) { // b) c)
            // paso 1
            Object respaldo = inicio.getInfo();
            if (inicio == fin) { // b)
                // paso 2
                inicio = null;
                fin = null;
            } else { // c)
                // paso 2
                inicio = inicio.getNodoDerecho();
            }
            return respaldo;
        } else {
            return null;
        }
    }

    private NodoBusqueda buscarNodo(Object valor) {
        NodoBusqueda nodoRetorno = new NodoBusqueda();
        Nodo temporal = inicio;
        Nodo anterior = inicio;

        while ((temporal != null) && temporal.getInfo().toString().equalsIgnoreCase(valor.toString()) == false) {
            anterior = temporal;
            temporal = temporal.getNodoDerecho();
        }
        if (temporal == null) {
            return null;
        } else {
            nodoRetorno.setBuscado(temporal);
            nodoRetorno.setAnterior(anterior);
            return nodoRetorno;
        }
    }

    public Object buscarObjeto(Object valor) {
        NodoBusqueda nodoRetorno = buscarNodo(valor);

        if (nodoRetorno != null) { // sí lo encontró
            return nodoRetorno.getBuscado().getInfo();
        } else { // no lo encontró
            return null;
        }
    }

    public void limpiar() {
        
    }

    public Boolean agregarArreglo(Object arreglo2) {
        return false;
    }

    public void voltear() {
        
    }

    public int cuantificar(Object valor) {
        return -1;
    }

    public Boolean quitarArreglo(Object arreglo2) {
        return null;
    }

    public void llenar(Object valor, int numElementos) {
        
    }

    public ArregloListaDatos copiar() {
        return null;
    }

    public ArregloListaDatos subArreglo(int posicionInicial, int posicionFinal) {
        return null;
    }


    public boolean sumar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return false;
    }

    public boolean multiplicar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return false;
    }

    public boolean aplicarPotencia(ArregloListaInfoEstaticaNumeros arregloEscalares) {
        return false;
    }

    public Double productoEscalar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return null;
    }

    public Double normal2() {
        return null;
    }

    public Double normaEuclidiana(ArregloListaInfoEstaticaNumeros arreglo2) {
        return null;
    }

    public Double sumarArregloEstatico(ArregloListaInfoEstatica listasArreglos) {
        return null;
    }

    public Double sumarEscalares(ArregloListaInfoEstaticaNumeros escalares) {
        return null;
    }

    public Double sumarIndices(ArregloListaInfoEstaticaNumeros arregloIndices) {
        return null;
    }

    public ArregloListaInfoEstatica subArreglo(ArregloListaInfoEstaticaNumeros arregloIndices) {
        return null;
    }

    public boolean esOrtogonal(ArregloListaInfoEstaticaNumeros arreglo2) {
        return false;
    }

    public boolean esParalelo(ArregloListaInfoEstaticaNumeros arreglo2) {
        return false;
    }

}
