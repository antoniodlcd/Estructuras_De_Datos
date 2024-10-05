package estructurasdlineales;

public class Nodo {
    protected Object info;
    protected Nodo nodoDerecho;
   
    public Nodo(Object valor) {
        info = valor;
        nodoDerecho = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public String toString() {
        return info.toString();
    }
}
