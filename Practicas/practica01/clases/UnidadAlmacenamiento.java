package practica01.clases;
public class UnidadAlmacenamiento extends Producto{

    private String Tipo;
    private Integer Capacidad;
    
    // constructor
    private UnidadAlmacenamiento(){}

    private UnidadAlmacenamiento(String nombre, Double precio, Integer cantidadUnidades, String tipo, Integer capacidad) {
        super(nombre, precio, cantidadUnidades);
        this.Tipo = tipo;
        this.Capacidad = capacidad;
    }

    // getters y setters
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Integer getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        Capacidad = capacidad;
    }

    // método toString
    @Override
    public String toString() {
        return "UnidadAlmacenamiento [Tipo=" + Tipo + ", Capacidad=" + Capacidad + "]";
    }

    
}
