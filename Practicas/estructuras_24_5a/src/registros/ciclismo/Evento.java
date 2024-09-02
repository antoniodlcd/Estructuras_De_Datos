package registros.ciclismo;

public class Evento {
    protected String nombre;
    protected String fecha;
    protected String lugar;

    // constructor
    public Evento(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // metodo toString
    @Override
    public String toString() {
        return nombre + "";
    }

    
    
}
