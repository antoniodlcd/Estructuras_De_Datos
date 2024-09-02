package practica01.clases;
public class Gabinete extends Producto{

    private String Procesador;

    // constructor
    private Gabinete(){}

    private Gabinete(String nombre, Double precio, Integer cantidadUnidades, String procesador) {
        super(nombre, precio, cantidadUnidades);
        this.Procesador = procesador;
    }

    // getters y setters
    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    // método toString
    @Override
    public String toString() {
        return "Gabinete [Procesador=" + Procesador + "]";
    }

    
    
}
