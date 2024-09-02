package registros.ciclismo;

public class Ciclista {
    protected int claveCiclista;
    protected String nombre;
    protected int edad;
    protected String pais;

    // constructor
    public Ciclista(int claveCiclista, String nombre, int edad, String pais) {
        this.claveCiclista = claveCiclista;
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    // getters y setters
    public int getClaveCiclista() {
        return claveCiclista;
    }

    public void setClaveCiclista(int claveCiclista) {
        this.claveCiclista = claveCiclista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // metodo toString
    @Override
    public String toString() {
        return claveCiclista + "";
    }

    
}
