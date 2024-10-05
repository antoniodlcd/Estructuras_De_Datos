package estructurasdlineales;

import java.io.Flushable;

import entradasalida.FlujoSalida;

public class PilaInfoDinamica implements AlmacenInfo{
    protected ArregloListaInfoDinamica pilaDinamica;

    public PilaInfoDinamica() {
        pilaDinamica = new ArregloListaInfoDinamica();
        pilaDinamica.fin = null;
    }

    @Override
    public boolean vacio() {
        if (pilaDinamica.fin == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean lleno() {
        return false;
    }

    @SuppressWarnings("unused")
    @Override
    public boolean poner(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (nuevo == null) {
            return false;
        } else if (vacio() == true) {
            // pilaDinamica.inicio = nuevo;
            pilaDinamica.fin = nuevo;
        } else {
            pilaDinamica.fin.setNodoDerecho(nuevo);
            pilaDinamica.fin = nuevo;
        }
        return true;
    }

    @Override
    public Object quitar() {
        return pilaDinamica.quitar();
    }

    @Override
    public void mostrar() {
        PilaInfoDinamica pilaTemporal = new PilaInfoDinamica();
        while (pilaDinamica.fin != null) {
            Nodo nodoTemporal = pilaDinamica.fin;
            Object respaldo = pilaDinamica.quitar();
            FlujoSalida.mostrarConsola(respaldo + "");
        }
    }

}
