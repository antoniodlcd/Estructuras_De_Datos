package registros.escuela;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstatica;

public class Boleta {
    protected String alumno;
    protected ArregloListaInfoEstatica asignaturas;
    protected ArregloListaInfoEstatica calificaciones;

    public Boleta(String matricula, int maximoAsig) {
        alumno = matricula;
        asignaturas = new ArregloListaInfoEstatica(maximoAsig);
        calificaciones = new ArregloListaInfoEstatica(maximoAsig);
    }

    public boolean agregarAsignatura (Asignatura asign, double calif) {
        int indiceBusqueda = asignaturas.buscar(asign);
        if (indiceBusqueda < 0) { // no existe, puedo agregarlo
            // la vamos a agregar
            int retorno = asignaturas.nuevo(asign);
            if (retorno == -1) { // no había espacio, hay error
                return false;
            }

            retorno = calificaciones.nuevo(calif);
            if (retorno == -1) { // no había espacio, hay error
                return false;
            }
            return true; // llego hasta aca abajo, no hay error
        } else { // ya existe, no se debe agregar
            return false;
        }
    }

    public void mostrar() {
        FlujoSalida.mostrarConsola("Los datos de la boleta de: " + alumno + "\n\n");
        FlujoSalida.mostrarConsola("Asignatura\t\tCalificacion");
        
        // recorrer los arreglos paralelos para sacar los datos de uno en uno
        for (int cadaDato = 0; cadaDato < asignaturas.numDatos(); cadaDato++) {
            Asignatura asignaturaTemporal = (Asignatura)asignaturas.dato(cadaDato);
            FlujoSalida.mostrarConsola(asignaturaTemporal.getNombre() + "\t\t" + calificaciones.dato(cadaDato) + "\n");
        }
        FlujoSalida.mostrarConsola("El promedio general es: " + promedio() + "\n");
    }

    public Double promedio() {
        double prom = 0.0;
        // recorrer el arreglo de calificaciones para cuando no haya nada
        for (int cadaCalidf = 0; cadaCalidf < calificaciones.numDatos(); cadaCalidf++) {
            prom = prom + (double)calificaciones.dato(cadaCalidf);
        }

        if (calificaciones.numDatos() > 0) {
            prom = prom / calificaciones.numDatos();
            return prom;
        } else {
            return null;
            
        }
    }

}
