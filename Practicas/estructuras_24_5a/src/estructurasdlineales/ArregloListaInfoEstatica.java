package estructurasdlineales;

import entradasalida.FlujoSalida;

// define la ED-TDA arreglo
public class ArregloListaInfoEstatica implements VectorArregloDatos{
    
    // datos
    protected int tamanio;
    protected int indiceUltimo;
    protected Object[] arreglo;

    // constructores
    public ArregloListaInfoEstatica(int max) {
        tamanio = max;
        indiceUltimo = -1;
        arreglo = new Object[max];
    }

    // operaciones
    public boolean vacio(){
        if (indiceUltimo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lleno() {
        if (indiceUltimo == tamanio -1) {
            return true;
        } else {
            return false;
        }
    }

    public Integer nuevo(Object valor) {
        if (lleno() == false) {
            indiceUltimo = indiceUltimo + 1;
            arreglo[indiceUltimo] = valor;
            return indiceUltimo;
        } else {
            return -1;
        }
    }

    public void imprimir(){
        for (int posicion = indiceUltimo; posicion >= 0; posicion--) {
            FlujoSalida.mostrarConsola(arreglo[posicion] + "\n");
        }
    }

    public void imprimirReves(){
        for (int posicion = 0; posicion <= indiceUltimo; posicion++){
            FlujoSalida.mostrarConsola(arreglo[posicion] + "\n");
        }
    }

    public Integer buscar(Object valor) {
        int posicionBusqueda = 0;
        while ((posicionBusqueda <= indiceUltimo) && (valor.toString().equalsIgnoreCase(arreglo[posicionBusqueda].toString())) == false) {
            posicionBusqueda ++;
        }

        if (posicionBusqueda > indiceUltimo) {
            return -1;
        } else {
            return posicionBusqueda;
        }
    }

    public Object quitar(Object valor){
        Integer posicion = buscar(valor);

        if (posicion >= 0){
            indiceUltimo --;
            Object respaldo = arreglo[posicion];
            for (int modificacion = posicion; modificacion <= indiceUltimo; modificacion++) {
                arreglo[modificacion] = arreglo[modificacion + 1];
            }
            return respaldo;
        } else {
            return null;
        }
    }

    // practica 2
    public int tamanio(){
        return tamanio;
    }

    public int numDatos() {
        return indiceUltimo + 1;
    }

    public Boolean esIdentico(Object arreglo2) {
        
        if ( arreglo2 instanceof ArregloListaInfoEstatica ){
            ArregloListaInfoEstatica arreglo2Cast = (ArregloListaInfoEstatica) arreglo2;

            // declaracion de variables
            Integer arreglo1IndiceUltimo = numDatos();
            Integer arreglo2IndiceUltimo = arreglo2Cast.numDatos();
            int arreglo1Tamanio = tamanio();
            int arreglo2Tamanio = arreglo2Cast.tamanio();

            if ( ( arreglo1Tamanio != arreglo2Tamanio ) || ( arreglo1IndiceUltimo != arreglo2IndiceUltimo ) ) {
                return false;
            
            } else {    
                for (int comparador = 0; comparador <= indiceUltimo; comparador++) {
                    if ( !arreglo[comparador].equals( ( ( ArregloListaInfoEstatica )arreglo2 ).arreglo[comparador] ) ) {
                        return false;

                    }
                }

            }
        } else {
            return false;
        }

        return true;

    }

    public Object dato(int posicion) {
        if ( ( posicion < 0 ) || ( posicion > indiceUltimo ) ) {
            return null;
        } else {
            Object objetoPosicion = arreglo[posicion];
            return objetoPosicion;
        }

    }
    
    public boolean modificar(Object valorViejo, Object valorNuevo) {
        Integer posicion = buscar(valorNuevo);
        if (posicion >= 0) {
            arreglo[posicion] = valorNuevo;
            return true;
        } else {
            return false;
        }
    }

    public Boolean modificar(Object valorViejo, Object valorNuevo, int cuantasVeces) {
        Boolean confirmar = false;

        for (int vecesBuscar = 0; vecesBuscar < cuantasVeces; vecesBuscar++) {
            int indiceValorViejo = buscar(valorViejo.toString());
            if (indiceValorViejo != -1) {
                arreglo[indiceValorViejo] = valorNuevo.toString();
                confirmar = true;
            }
        }
        return confirmar;
    }

    public Boolean cambiar(int posicion, Object valor) {
        if ( ( posicion < 0 ) || (posicion > indiceUltimo) ) {
            return false;
        } else {
            arreglo[posicion] = valor;
            return true;
        }
    }

    public Boolean modificar(ArregloListaInfoEstatica posicionesBusqueda, ArregloListaInfoEstatica valoresNuevos) {
       
        
        if ( posicionesBusqueda.tamanio() == valoresNuevos.tamanio() ) {
            
            for (int posicion = 0; posicion < posicionesBusqueda.tamanio(); posicion++) {
                int indiceBusqueda = (int)posicionesBusqueda.dato(posicion);
                if ( ( indiceBusqueda < 0 ) || ( indiceBusqueda > indiceUltimo ) ) {
                    return false;
                }
            }

            for (int posicion = 0; posicion < posicionesBusqueda.tamanio(); posicion++) {
                int indiceBusqueda = (int)posicionesBusqueda.dato(posicion);
                Object nuevoValor = (Object)valoresNuevos.dato(posicion);

                arreglo[indiceBusqueda] = nuevoValor;
            }
            return true;

        } else {
            return false;
        }
    }

    public ArregloListaInfoEstatica buscarValores(Object valor) {
        int tamanioArregloPosiciones = tamanio();
        ArregloListaInfoEstatica ArregloPosiciones = new ArregloListaInfoEstatica(tamanioArregloPosiciones);

        for (int indiceBuscar = 0; indiceBuscar < tamanioArregloPosiciones; indiceBuscar++) {
            if ( arreglo[indiceBuscar].equals(valor) ) {
                ArregloPosiciones.nuevo(indiceBuscar);
            }
        }

        return ArregloPosiciones;
    }

    public Object quitar(int posicion) {
        if ( ( posicion < 0 ) || ( posicion > indiceUltimo ) ) {
            return null;

        } else {
            Object respaldo = arreglo[posicion];
            indiceUltimo --;
            for (int modificacion = posicion; modificacion < indiceUltimo; modificacion++) {
                arreglo[modificacion] = arreglo[modificacion - 1];
            }
            return respaldo;
            
        }
    }

    public Object quitar() {
        if (vacio() == false) {
            Object arregloEliminado = arreglo[indiceUltimo];
            arreglo[indiceUltimo] = null;
            indiceUltimo--;
            return arregloEliminado;
        } else {
            return null;
        }
    }

    public void limpiar() {
        for (int posicion = 0; posicion < tamanio(); posicion++) {
            indiceUltimo --;
        }
    }

    public Boolean agregarArreglo(Object arreglo2) {
        if ( !(arreglo2 instanceof ArregloListaInfoEstatica) ) {
            return false;

        } else {
            ArregloListaInfoEstatica arreglo2Cast = (ArregloListaInfoEstatica) arreglo2;
            Integer arreglo2IndiceUltimo = arreglo2Cast.numDatos();

            if ( ( ( indiceUltimo + arreglo2IndiceUltimo ) > tamanio() ) || ( arreglo2IndiceUltimo <= 0 ) || ( arreglo2IndiceUltimo == null ) ) {
                return false;

            } else {
                for (int posicion = 0; posicion < arreglo2IndiceUltimo; posicion++) {
                    Object nuevoObjeto = ((ArregloListaInfoEstatica)arreglo2).arreglo[posicion];
                    nuevo(nuevoObjeto);

                }
                
            }
            return true;

        }
    }

    public void voltear() {
        ArregloListaInfoEstatica arreglo2 = new ArregloListaInfoEstatica(tamanio());

        for (int posicion = indiceUltimo - 1; posicion > - 2; posicion--) {
            Object posicionUltima = arreglo[posicion + 1];
            arreglo2.nuevo(posicionUltima);
        }

        for (int posicion = 0; posicion < indiceUltimo + 1; posicion++) {
            Object posicionVoltear = ((ArregloListaInfoEstatica)arreglo2).arreglo[posicion];
            arreglo[posicion] = posicionVoltear;

        }
    }

    public int cuantificar(Object valor) {
        int cuantosElementos = 0;
        for (int indiceBuscar = 0; indiceBuscar < indiceUltimo; indiceBuscar++) {
            if (arreglo[indiceBuscar].equals(valor)) {
                cuantosElementos ++;

            }

        }
        return cuantosElementos;
    }

    public Boolean quitarArreglo(Object arreglo2) {
        Boolean confirmacion = false;
        if ( !(arreglo2 instanceof ArregloListaInfoEstatica) ) {
            confirmacion = false;
        } else {
            ArregloListaInfoEstatica arreglo2Cast = (ArregloListaInfoEstatica) arreglo2;
            Integer arreglo2IndiceUltimo = arreglo2Cast.numDatos();

            if ( !(arreglo2IndiceUltimo == null) ){
                for (int indiceQuitar = 0; indiceQuitar < arreglo2IndiceUltimo; indiceQuitar++) {
                    try {
                        Object elementoQuitar = ((ArregloListaInfoEstatica)arreglo2).arreglo[indiceQuitar];
                        quitar(elementoQuitar);
                        confirmacion = true;

                    } catch (Exception e) {}
                }   
            }
        }
        return confirmacion;

    }

    public void llenar(Object valor, int numElementos) {
        if ( numElementos >= 0 ) {

            if (numElementos > tamanio){
                numElementos = tamanio;
            }
            for (int indiceLlenar = 0; indiceLlenar < numElementos; indiceLlenar++) {
                
                arreglo[indiceLlenar] = valor;
                if ( (indiceLlenar > indiceUltimo) && (indiceLlenar <= numElementos)){
                    nuevo(valor);
                }
                
            }
        }
    }

    public ArregloListaDatos copiar() {
        ArregloListaInfoEstatica arregloCopia = new ArregloListaInfoEstatica(tamanio);
        for (int indiceCopiar = 0; indiceCopiar < tamanio; indiceCopiar++) {
            arregloCopia.arreglo[indiceCopiar] = arreglo[indiceCopiar];
        }
        arregloCopia.indiceUltimo = this.indiceUltimo;
        
        return arregloCopia;
    }

    public ArregloListaDatos subArreglo(int posicionInicial, int posicionFinal) {
        int arregloSubTamanio = (posicionFinal) - (posicionInicial);

        if (( posicionInicial < 0 ) || ( posicionFinal >= tamanio ) || ( arregloSubTamanio < 0 )) {
            throw new IllegalArgumentException("Rangos Inválidos...");
        } else {

            ArregloListaInfoEstatica arregloSub = new ArregloListaInfoEstatica(arregloSubTamanio + 1);
            for (int posicion = posicionInicial; posicion < posicionFinal+1; posicion++) {
                arregloSub.arreglo[posicion - posicionInicial] = arreglo[posicion];
                
            }
            arregloSub.indiceUltimo = posicionFinal - posicionInicial;
            return arregloSub;
        }

    }

    public Boolean cambiarTamanio(int max) {
        Boolean confirmacion = false;
        if (max > 0) {
            ArregloListaInfoEstatica arregloCopia = (ArregloListaInfoEstatica)copiar();
            arreglo = new Object[max];
            indiceUltimo = Math.min(max -1, arregloCopia.indiceUltimo);

            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                arreglo[posicion] = arregloCopia.arreglo[posicion];
            }

            tamanio = max;
            confirmacion = true;
        }
        return confirmacion;
    }
    

    // practica 3
    public boolean porEscalar(Number escalar) {
        return true;
    }

    public boolean sumarEscalar(Number escalar) {
        return true;
    }

    public boolean sumar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return true;
    }

    public boolean multiplicar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return true;
    }

    public boolean aplicarPotencia(Number arreglo2) {
        return true;
    }

    public boolean aplicarPotencia(ArregloListaInfoEstaticaNumeros arregloEscalares) {
        return true;
    }

    public Double productoEscalar(ArregloListaInfoEstaticaNumeros arreglo2) {
        return null;
    }

    public Double normal2() {
        return null;
    }

    public Double normaEuclidiana(ArregloListaInfoEstaticaNumeros arreglo2) {
        return null;
    }

    public Double sumarArregloEstatico(ArregloListaInfoEstatica listasArreglos) {
        return null;
    }

    public Double sumarEscalares(ArregloListaInfoEstaticaNumeros escalares) {
        return null;
    }    

    public Double sumarIndices(ArregloListaInfoEstaticaNumeros arregloIndices) {
        return null;
    }
    
    public ArregloListaInfoEstatica subArreglo(ArregloListaInfoEstaticaNumeros arregloIndices) {
        return null;
    }

    public boolean esOrtogonal(ArregloListaInfoEstaticaNumeros arreglo2){
        return true;
    }
    
    public boolean esParalelo(ArregloListaInfoEstaticaNumeros arreglo2) {
        return true;
    }

    @Override
    public Integer nuevoInicio(Object valor) {
        return 0;
    }

    @Override
    public Object quitarInicio() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object buscarObjeto(Object valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarObjeto'");
    }

    
    
}
