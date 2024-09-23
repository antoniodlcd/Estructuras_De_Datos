package estructurasdnolineales;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstatica;

public class ArregloListaInfoEstatica2 {
    protected int filas;
    protected int columnas;

    protected Object arreglo[][];

    public ArregloListaInfoEstatica2(int filas, int cols) {
        this.filas = filas;
        this.columnas = cols;
        arreglo = new Object[filas][cols];
    }

    public ArregloListaInfoEstatica2(int filas, int cols, Object valor) {
        this.filas = filas;
        this.columnas = cols;
        arreglo = new Object[filas][cols];

        this.llenar(valor);

    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    public Object dato(int indiceFila, int indiceCol) {
        if ((indiceFila < filas)   && (indiceFila >= 0) && 
            (indiceCol < columnas) && (indiceCol >= 0)) {
            
            return arreglo[indiceFila][indiceCol];
        } else {
            return null;
        }
    }
    
    public boolean cambiar(int indiceFila, int indiceCol, Object valor) {
        if ((indiceFila < filas)   && (indiceFila >= 0) && 
            (indiceCol < columnas) && (indiceCol >= 0)) {
            
            arreglo[indiceFila][indiceCol] = valor;
            return true;
        } else {
            return false;
        }
           
    }
    
    public Integer numElementos() {
        return filas * columnas;
    }

    public void imprimirXRenglones() {
        // iterar cada renglón
        for (int cadaRenglon = 0; cadaRenglon < filas; cadaRenglon++) {
            for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                // imprimir cada elemento del renglón
                Object elemento = (Object)arreglo[cadaRenglon][cadaElemento];
                FlujoSalida.mostrarConsola(elemento + "  ");
            }
            // salto de línea por cada renglón
            FlujoSalida.mostrarConsola("\n");
        }
    }
    
    public void imprimirXColumnas() {
        // iterar cada columna
        for (int cadaColumna = 0; cadaColumna < columnas; cadaColumna++) {
            for (int cadaElemento = 0; cadaElemento < filas; cadaElemento++) {
                // imprimir cada elemento de la columna
                Object elemento = (Object)arreglo[cadaElemento][cadaColumna];
                FlujoSalida.mostrarConsola(elemento + "  ");
            }
            // salto de línea por cada columna
            FlujoSalida.mostrarConsola("\n");
        }
    }
    
    public void transpuesta() {
        // crear una matriz que tenga las filas y columnas 
        // intercambiadas a la actual
        ArregloListaInfoEstatica2 mTranspuesta = new ArregloListaInfoEstatica2(columnas, filas);

        // iterar cada fila del arreglo actual
        for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
            for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                // copiar cada elemento a la nueva matríz
                // con el nuevo orden
                mTranspuesta.arreglo[cadaElemento][cadaFila] = arreglo[cadaFila][cadaElemento];
            }
        }
        // reemplazar el arreglo actual con su transpuesta
        arreglo = mTranspuesta.arreglo;

        // cambiar las filas y columnas
        int filaTemp = filas;
        filas = columnas;
        columnas = filaTemp;
        
    }
    
    public void llenar(Object valor) {
        // iterar cada fila de la matríz
        for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
            for (int cadaColumna = 0; cadaColumna < columnas; cadaColumna++) {
                // llenar cada espacio de la matríz con el valor especificado
                arreglo[cadaFila][cadaColumna] = valor;
            }
        }
    }

    public ArregloListaInfoEstatica2 copiar() {
        // crear una matríz con las mismas dimensiones que la actual
        ArregloListaInfoEstatica2 mCopia = new ArregloListaInfoEstatica2(filas, columnas);

        // iterar cada fila de la matríz actual
        for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
            for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                // copiar cada elemento de la matríz actual a la copia
                mCopia.arreglo[cadaFila][cadaElemento] = arreglo[cadaFila][cadaElemento]; 
            }
        }
        return mCopia;
    }

    public boolean esIgual(ArregloListaInfoEstatica2 matriz2) {
        // validar dimensiones
        if ((matriz2.getFilas() == this.filas) && (matriz2.getColumnas() == this.columnas)) { // tienen las mismas dimensiones
            // iterar cada fila de la matríz
            for (int cadaFila = 0; cadaFila < filas ; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // evaluar cada elemento de ámbas matrices
                    Object elementoActual = arreglo[cadaFila][cadaElemento];
                    Object elementoEval = (Object)matriz2.arreglo[cadaFila][cadaElemento];
                    if (elementoActual != elementoEval) { // hay algún elemento diferente
                        return false;
                    }
                }
            }
            // si no hay ningún elemento diferente, regresa true
            return true;
        } else { // no tienen las mismas dimensiones
            return false;
        }
    }

    public boolean vectorColumna(int numFilas, Object valor) {
        // crear variable que devolverá el resultado
        boolean resultado = false;

        // comprobar que el número de filas estén dentro del rango
        // de las dimensiones de la matríz
        if ((numFilas <= filas) && (numFilas >= 0)) { // está dentro del rango
            // iterar las columnas hasta encontrar una vacía
            for (int cadaColumna = 0; cadaColumna < columnas; cadaColumna++) {
                Object objetoColumna = arreglo[0][cadaColumna];
                if (objetoColumna == null) { // la columna esta vacía, ahí se colocará el vector
                    // generar un vector del tamaño especificado usando un ciclo
                    for (int cadaFila = 0; cadaFila < numFilas; cadaFila++) {
                        arreglo[cadaFila][cadaColumna] = valor;
                    }
                    resultado = true;
                    break; // cuando llene una columna, se saldrá del ciclo
                }

            }
            return resultado;
        } else { // está fuera del rango
            return resultado;
        }
    }

    public boolean vectorRenglon(int numColumnas, Object valor) {
        // crear variable que devolverá el resultado
        boolean resultado = false;

        // comprobar que el número de columnas estén dentro del rango
        // de las dimensiones de la matríz
        if ((numColumnas <= columnas) && (numColumnas >= 0)) { // está dentro del rango
            // iterar las filas hasta encontrar una vacía
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                Object objetoFila = arreglo[cadaFila][0];
                if (objetoFila == null) { // la fila está vacía, ahí se colocara el vector
                    // generar un vector de tamaño especificado unando un ciclo
                    for (int cadaColumna = 0; cadaColumna < numColumnas; cadaColumna++) {
                        arreglo[cadaFila][cadaColumna] = valor;
                    }
                    resultado = true;
                    break; // cuando llene una columna, se saldrá del ciclo
                }
            }
            return resultado;
        } else { // está fuera del rango
            return resultado;
        }
    }

    public boolean redefinir(ArregloListaInfoEstatica2 matriz2) {
        return false;
    }

    public boolean agregarRenglon(ArregloListaInfoEstatica arreglo) {
        return false;
    }

    public boolean agregarColumna(ArregloListaInfoEstatica arreglo) {
        return false;
    }

    public boolean agregarMatrizXColumna(ArregloListaInfoEstatica2 matriz2) {
        return false;
    }

    public boolean agregarMatrizXRenglon(ArregloListaInfoEstatica2 matriz2) {
        return false;
    }

    public ArregloListaInfoEstatica3 aMatriz3(ArregloListaInfoEstatica matrices) {
        return null;
    }

    public ArregloListaInfoEstatica2 aVectorColumna() {
        return null;
    }
    
    public ArregloListaInfoEstatica2 aVectorRenglon() {
        return null;
    }

    /*  
     public boolean eliminarColumna(TipoColumna tipoCol) {
        return false;
    }
    
    public boolean eliminarRenglon(TipoRenglon tipoRenglon) {
        return false;
    }
    */

    public boolean eliminarRenglon(int renglon) {
        return false;
    }

    public boolean eliminarColumna(int columna) {
        return false;
    }

    
    
}
