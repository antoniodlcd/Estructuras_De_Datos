package registros.escuela;

public class Asignatura {
    protected String clave;
    protected String nombre;
    protected int creditos;


    // constructor
    public Asignatura(String nom, String clav, int cred) {
        clave = clav;
        nombre = nom;
        creditos = cred;
    }


    // getters y setters
    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCreditos() {
        return creditos;
    }


    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    //Este metodo lo usaremos para comparar,
    //para esto necesitamos un campo unico de Asignatura
    public String toString() {
        return clave;
    }

    
}