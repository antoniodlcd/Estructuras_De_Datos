package registros.escuela;

import estructurasdlineales.ArregloListaInfoEstatica;

public class Escuela {
    protected String clave;
    protected String nombre;
    protected ArregloListaInfoEstatica alumnos;
    protected ArregloListaInfoEstatica boletas;

    public Escuela(String clave, String nombre, int cantAlumnos) {
        this.clave = clave;
        this.nombre = nombre;
        alumnos = new ArregloListaInfoEstatica(cantAlumnos);
        boletas = new ArregloListaInfoEstatica(cantAlumnos);
    }

    public boolean agregarAlumno(Alumno alumno, Boleta boleta) {
        // checar que no existe ya duplicado
        int indiceBusqueda = alumnos.buscar(alumno);

        if (indiceBusqueda < 0) { // no existe
            // podemos agregarlo
            int retorno = alumnos.nuevo(alumno);
            if (retorno == -1) {
                return false;
            }
            retorno = boletas.nuevo(boleta);
            if (retorno == -1) {
                return false;
            }
            return true;
        } else { // ya existe
            return false;
        }
    }

    public void kardex(String matricula) {
        // buscar al alumno con eta matricula
        int indiceAlumno = alumnos.buscar(matricula);
        if (indiceAlumno >= 0) { // si existe
            // mostrar su boleta
            Boleta boletaTemporal = (Boleta)boletas.dato(indiceAlumno);
            boletaTemporal.mostrar();
        }
    }
}
