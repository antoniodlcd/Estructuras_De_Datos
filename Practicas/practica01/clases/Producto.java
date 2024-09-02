package practica01.clases;
public class Producto {
    
    private String Nombre;
    private Double Precio;
    private Integer CantidadUnidades;

    // constructor
    public Producto(){}

    public Producto(String nombre, Double precio, Integer cantidadUnidades){
        this.Nombre = nombre;
        this.Precio = precio;
        this.CantidadUnidades = cantidadUnidades;
    }

    // getters y setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public Double getPrecio() {
        return Precio;
    }
    
    public void setPrecio(Double precio) {
        this.Precio = precio;
    }
    
    public Integer getCantidadUnidades() {
        return CantidadUnidades;
    }
    
    public void setCantidadUnidades(Integer cantidadUnidades) {
        CantidadUnidades = cantidadUnidades;
    }
    
    // métodos para manejar el inventario
    private void agregarProducto(Integer cantidad) {
        
        try {
            if (cantidad > 0) {
                this.CantidadUnidades += cantidad;
            }  
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void eliminarProducto(Integer cantidad) {
        try {
            if (cantidad > 0 && this.CantidadUnidades >= cantidad) {
                this.CantidadUnidades -= cantidad;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    // método toString
    @Override
    public String toString() {
        return "Producto [nombre=" + Nombre + ", precio=" + Precio + ", CantidadUnidades=" + CantidadUnidades + "]";
    }

    

    
}
