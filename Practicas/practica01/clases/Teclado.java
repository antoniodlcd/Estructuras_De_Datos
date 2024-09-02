package practica01.clases;
public class Teclado extends Producto{
    
    private String Tipo;

    // constructor
    private Teclado(){}

    private Teclado(String nombre, Double precio, Integer cantidadUnidades, String tipo) {
        super(nombre, precio, cantidadUnidades);
        this.Tipo = tipo;
    }

    // getters y setters
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    // método toString
    @Override
    public String toString() {
        return "Teclado [Tipo=" + Tipo + "]";
    }
    

}
