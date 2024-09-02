package estructurasdnolineales;

import entradasalida.FlujoSalida;

public class ArregloListaInfoEstatica3 {
    protected int reglones;
    protected int columnas;
    protected int profundidad;

    protected Object arreglo[][][];

    public ArregloListaInfoEstatica3(int reng, int col, int prof, Object valor) {
        reglones = reng;
        columnas = col;
        profundidad = prof;
        arreglo = new Object[reng][col][prof];
        this.llenar(valor);
    }

    public Boolean cambiar(int reng, int col, int prof, Object valor){
        if ((reng >= 0 && reng < reglones) && (col >= 0 && col < columnas) && (prof >= 0 && prof < profundidad)) {
            arreglo[reng][col][prof] = valor;
            return true;
        }else{
            return false;
        }
    }
    public Object dato(int reng, int col, int prof){
        if ((reng >= 0 && reng < reglones) && (col >= 0 && col < columnas) && (prof >= 0 && prof < profundidad)) {
            return arreglo[reng][col][prof];
        }else{
            return null;
        }
    }

    public void imprimir2() {
        // hacemos un ciclo para recorrer todos los renglones
        for (int numReng = 0; numReng < reglones; numReng++) {
            // voy a asumir que existe solo un renglon
            for (int numCol = 0; numCol < columnas; numCol++) {
                // voy a asumir que existe un solo renglon
                // y una sola columna
                for (int numProf = 0; numProf < profundidad; numProf++) {
                    FlujoSalida.mostrarConsola(arreglo[numReng][numCol][numProf] + "");
                }
            }
        }
    }

    public void imprimirXColumnas() {
        // recorrer el numero de rebanadas del cubo
        for (int cadaRebanada = 0; cadaRebanada < columnas; cadaRebanada++) {
            // ahora con cada rebanada (Matriz de dos dimensiones)
            // recorremos primero los renglones
            for (int cadaReng = 0; cadaReng < reglones; cadaReng++) {
                // por cada renglon, recorremos las columnas (profundidadd)
                for (int cadaCol = 0; cadaCol < profundidad; cadaCol++) {
                    FlujoSalida.mostrarConsola(arreglo[cadaReng][cadaRebanada][cadaCol] + " ");
                }
                // cuando termina cada renglon
                FlujoSalida.mostrarConsola("\n");
            }
            // cuando termina cad rebanada
            FlujoSalida.mostrarConsola("\n");
        }

    }

    public void llenar(Object valor) {
        for (int reng = 0; reng < reglones; reng++) {
            for (int col = 0; col < columnas; col++) {
                for (int prof = 0; prof < profundidad; prof++) {
                    arreglo[reng][col][prof] = valor;
                }
            }
        }
    }

}
