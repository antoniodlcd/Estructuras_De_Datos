package practica01.clases;
public class Monitor extends Producto{
    
    private String Resolucion;

    // constructor
    private Monitor(){}

    private Monitor(String nombre, Double precio, Integer cantidadUnidades, String resolucion) {
        super(nombre, precio, cantidadUnidades);
        this.Resolucion = resolucion;
    }

    // getters y setters
    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String resolucion) {
        Resolucion = resolucion;
    }

    
    // método toString
    @Override
    public String toString() {
        return "Monitor [Resolucion=" + Resolucion + "]";
    }
    
    
}
