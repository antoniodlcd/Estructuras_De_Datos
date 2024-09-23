package estructurasdlineales;

public interface AlmacenInfo {
    public boolean vacio();
    public boolean lleno();
    public boolean poner(Object valor);
    public Object quitar();
    public void mostrar();
}