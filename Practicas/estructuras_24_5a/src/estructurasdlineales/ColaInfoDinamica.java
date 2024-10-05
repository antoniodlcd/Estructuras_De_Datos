package estructurasdlineales;

public class ColaInfoDinamica implements AlmacenInfo{
    protected ArregloListaInfoDinamica colaDinamica;

    public ColaInfoDinamica() {
        colaDinamica = new ArregloListaInfoDinamica();
        colaDinamica.inicio = null;
        colaDinamica.fin = null;
    }

    @Override
    public boolean vacio() {
        return colaDinamica.vacio();
    }

    @Override
    public boolean lleno() {
        return false;
    }

    @Override
    public boolean poner(Object valor) {
        return false;
    }

    @Override
    public Object quitar() {
        return null;
    }

    @Override
    public void mostrar() {

    }

}
