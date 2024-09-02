package pruebas;

import registros.escuela.Alumno;
import registros.escuela.Asignatura;
import registros.escuela.Boleta;
import registros.escuela.Escuela;

public class PruebaEscuela {
    public static void main(String args[]) {
        Escuela escuela1 = new Escuela("ESC001", "IS 1.0", 10);
        
        Alumno al1 = new Alumno("11111111", "Pedro", 22, 'M');
        Alumno al2 = new Alumno("22222222", "Juan", 23, 'M');
        Alumno al3 = new Alumno("33333333", "Lola", 20, 'F');

        Boleta boleta1 = new Boleta("11111111", 5);
        Boleta boleta2 = new Boleta("22222222", 5);
        Boleta boleta3 = new Boleta("33333333", 5);

        Asignatura asig1 = new Asignatura("Mat0001", "Matematicas 1", 7);
        Asignatura asig2 = new Asignatura("Prog0001", "Programacion 1", 7);
        Asignatura asig3 = new Asignatura("Alg0001", "Algoritmos", 7);

        boleta1.agregarAsignatura(asig1, 9.0);
        boleta1.agregarAsignatura(asig2, 8.0);
        boleta1.agregarAsignatura(asig3, 7.1);
        
        boleta2.agregarAsignatura(asig1, 9.5);
        boleta2.agregarAsignatura(asig2, 6.1);
        boleta2.agregarAsignatura(asig3, 7.9);

        boleta3.agregarAsignatura(asig1, 9.7);
        boleta3.agregarAsignatura(asig2, 8.2);
        boleta3.agregarAsignatura(asig3, 9.1);

        escuela1.agregarAlumno(al1, boleta1);
        escuela1.agregarAlumno(al2, boleta2);
        escuela1.agregarAlumno(al3, boleta3);

        escuela1.kardex("22222222");
    }
}
