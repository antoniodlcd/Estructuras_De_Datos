package registros.escuela;

public class Alumno {
    protected String matricula;
    protected String nombre;
    protected int edad;
    protected char sexo;


    public Alumno(String mat, String nom, int age, char sex) {
        matricula = mat;
        nombre = nom;
        edad = age;
        sexo = sex;
    }


    // getters y setters
    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
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


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // método toString
    public String toString() {
        return matricula;
    }
    
}
