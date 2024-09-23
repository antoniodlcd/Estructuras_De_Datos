package estructurasdnolineales;

import estructurasdlineales.ArregloListaInfoEstaticaNumeros;

public class ArregloListaInfoEstatica2Numeros extends ArregloListaInfoEstatica2 {
    protected int filas;
    protected int columnas;

    protected Object arreglo[][];

    public ArregloListaInfoEstatica2Numeros(int filas, int cols) {
        super(filas, cols);
        super.llenar(0.0);
    }

    public ArregloListaInfoEstatica2Numeros(int filas, int cols, Object valor) {
        super(filas, cols);

        // validar que el valor sea Number
        if (valor instanceof Number) {
            double valorNum = ((Number) valor).doubleValue();
            super.llenar(valorNum);
        }
    }

    @Override
    public void imprimirXRenglones() {
        super.imprimirXRenglones();
    }

    public boolean porEscalar(Object escalar) {
        try {
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double numEscalar = ((Number)escalar).doubleValue();
                    arreglo[cadaFila][cadaElemento] = elementoMatriz * numEscalar;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean porEscalares(ArregloListaInfoEstaticaNumeros escalares) {
        if (escalares.numDatos() == (filas * columnas)) { // tienen las mismas dimensiones
            int cadaEscalar = 0;
            // iterar cada fila de la matríz
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // se multiplica cada elemento de la matríz con cada escalar
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double elementoEscalar = ((Number)escalares.dato(cadaEscalar)).doubleValue();
                    arreglo[cadaFila][cadaElemento] = elementoMatriz * elementoEscalar;
                    cadaEscalar ++;
                }
            }
            return true;
        } else { // no tienen las mismas dimensiones
            return false;
        }
    }

    public boolean sumarEscalar(Object escalar) {
        try {
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double numEscalar = ((Number)escalar).doubleValue();
                    arreglo[cadaFila][cadaElemento] = elementoMatriz + numEscalar;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean multiplicar(ArregloListaInfoEstatica2Numeros matriz2) {
        // validar que tengan las mismas dimensiones
        if ((matriz2.filas == filas) && (matriz2.columnas == columnas)) { // sí tienen las mismas dimensiones
            // iterar cada fila de las matrices
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // por cada elemento de las matrices,
                    // se multiplica el elemento de la misma posición
                    double elementoMatriz1 = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double elementoMatriz2 = ((Number)matriz2.arreglo[cadaFila][cadaElemento]).doubleValue();
                    arreglo[cadaFila][cadaElemento] = elementoMatriz1 * elementoMatriz2;
                }
            }
            return true;
        } else { // tienen diferentes dimensiones
            return false;
        }
    }

    public boolean sumar(ArregloListaInfoEstatica2Numeros matriz2) {
        // validar que tengan las mismas dimensiones
        if ((matriz2.filas == filas) && (matriz2.columnas == columnas)) { // sí tienen las mismas dimensiones
            // iterar cada fila de las matrices
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // por cada elemento de las matrices,
                    // se suma el elemento de la misma posición
                    double elementoMatriz1 = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double elementoMatriz2 = ((Number)matriz2.arreglo[cadaFila][cadaElemento]).doubleValue();
                    arreglo[cadaFila][cadaElemento] = elementoMatriz1 + elementoMatriz2;
                }
            }
            return true;
        } else { // tienen diferentes dimensiones
            return false;
        }
    }

    public boolean aplicarPotencia(Object escalar) {
        try {
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    double numEscalar = ((Number)escalar).doubleValue();
                    arreglo[cadaFila][cadaElemento] = Math.pow(elementoMatriz, numEscalar);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public enum TipoLogaritmo {
        NATURAL, BASE10, BASE2
    }

    public boolean aplicarLogaritmo(TipoLogaritmo tipoLogaritmo) {
        try {
            // iterar cada fila de la matríz
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // por cada elemento de la matríz, 
                    // se valida que sea positivo, ya que,
                    // no se le aplicar logaritmos a números negativos
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    switch (tipoLogaritmo) {
                        case NATURAL:
                            arreglo[cadaFila][cadaElemento] = Math.log(elementoMatriz);
                            break;
                        case BASE10:
                            arreglo[cadaFila][cadaElemento] = Math.log10(elementoMatriz);
                            break;
                        case BASE2:
                            arreglo[cadaFila][cadaElemento] = Math.log(elementoMatriz) / Math.log(2);
                            break;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean matrizDiagonal(Object contenido) {
        try {
            // iterar cada fila de la matriz
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    // se evalúa cada elemento de la matríz para saber
                    // si está dentro de la diagonal principal
                    if (cadaFila == cadaElemento) { // sí esta en la diagonal principal
                        // se sustituyen los valores de la diagonal, por el valor ingresado
                        arreglo[cadaFila][cadaElemento] = ((Number)contenido).doubleValue();
                    } else { // si esta fuera de la diagonal, asignar el valor 0.0
                        arreglo[cadaFila][cadaElemento] = 0.0;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean esDiagonalSuperior() {
        try {
            // iterar cada fila de la matríz,
            // empieza en 1, porque en la 0 comienza la diagonal
            for (int cadaFila = 1; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < cadaFila; cadaElemento++) {
                    // se evalua cada elemento debajo de la diagonal
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    if (elementoMatriz != 0.0) { // es diferente a 0.0, no es triangular superior
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean esDiagonalInferior() {
        try {
            // iterar cada fila de la matríz
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                // iterar cada elemento del arreglo
                // empieza en cada fila +1 para que itere sólo
                // los que están encima de la diagonal
                for (int cadaElemento = cadaFila + 1; cadaElemento < columnas; cadaElemento++) {
                    // se evalúa cada elemento
                    double elementoMatriz = ((Number)arreglo[cadaFila][cadaElemento]).doubleValue();
                    if (elementoMatriz != 0.0) { // es diferente a 0.0, no es triangular inferior
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean potencia(int exponente) {
        // verificar que la matríz sea cuadrada
        if (filas == columnas) {
            // crear copia de la matríz original
            ArregloListaInfoEstatica2Numeros matrizCuadrada = new ArregloListaInfoEstatica2Numeros(filas, columnas);
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                    matrizCuadrada.arreglo[cadaFila][cadaElemento] = arreglo[cadaFila][cadaElemento];
                }
            }

            if (exponente == 1) { // si el exponente es 1, la matríz se mantiene igual
                return true;
            }

            try {
                // se multiplica el número de veces indicado
                for (int cadaMult = 1; cadaMult < exponente; cadaMult++) {
                    // multiplicar la matríz con la copia del resultado acumulado
                    ArregloListaInfoEstatica2Numeros matrizTemp = new ArregloListaInfoEstatica2Numeros(filas, columnas);
                    for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                        for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                            matrizTemp.arreglo[cadaFila][cadaElemento] = matrizCuadrada.arreglo[cadaFila][cadaElemento];
                        }
                    }
                    matrizCuadrada.multiplicar(this); // multiplicar con la matríz original
                }

                // guardar el resultado en la matriz actual
                for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                    for (int cadaElemento = 0; cadaElemento < columnas; cadaElemento++) {
                        arreglo[cadaFila][cadaElemento] = matrizCuadrada.arreglo[cadaFila][cadaElemento];
                    }
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean doblarRenglones() {
        try {
            if (columnas < 2) { // si hay menos de 2 columnas, no se puede doblar
                return false;
            }

            // calcular el nuevo número de columnas
            int nuevasColumnas = columnas / 2 + (columnas % 2); // si es impar, el centro queda intacto

            ArregloListaInfoEstatica2Numeros matrizDoblada = new ArregloListaInfoEstatica2Numeros(filas, nuevasColumnas);

            // iterar cada fila
            for (int cadaFila = 0; cadaFila < filas; cadaFila++) {
                int nuevaColumna = 0;

                // iterar por pares de columnas
                for (int cadaColumna = 0; cadaColumna < columnas / 2; cadaColumna++) {
                    double primeraColumna = ((Number)arreglo[cadaFila][cadaColumna]).doubleValue();
                    double ultimaColumna = ((Number)arreglo[cadaFila][columnas - 1 - cadaColumna]).doubleValue();
                    matrizDoblada.arreglo[cadaFila][cadaColumna] = primeraColumna + ultimaColumna;
                    nuevaColumna ++;
                }
                // si el número de columnas es impar, no se modifica la columna central
                if (columnas % 2 != 0) { // es par
                    matrizDoblada.arreglo[cadaFila][nuevaColumna] = arreglo[cadaFila][columnas / 2];
                }
            }

            // asignar el resultado de la matríz doblada
            // a la matríz actual
            this.arreglo = matrizDoblada.arreglo;
            this.columnas = nuevasColumnas;

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // public boolean doblarColumnas() {
    //     try {
    //         // si hay menos de 2 filas, no

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }

    

}
