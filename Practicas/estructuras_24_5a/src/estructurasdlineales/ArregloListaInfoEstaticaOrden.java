package estructurasdlineales;

import herramientas.UtileriasVarias;

public class ArregloListaInfoEstaticaOrden extends ArregloListaInfoEstatica{
    protected TipoDeOrden orden;

    
    public ArregloListaInfoEstaticaOrden(int max, TipoDeOrden ord) {
        super(max);
        orden = ord;
    }

    public enum TipoDeOrden {
        ASCENDENTE,
        DESCENTENDE;
    }

    @Override
    public Integer buscar(Object valor) {
        int posicionBusqueda = 0;
        while (posicionBusqueda <= indiceUltimo && UtileriasVarias.compararObjetos(valor, arreglo[posicionBusqueda]) > 0) {
            posicionBusqueda++;
        }
        if (posicionBusqueda > indiceUltimo || UtileriasVarias.compararObjetos(valor, arreglo[posicionBusqueda]) < 0) {
            return (posicionBusqueda + 1) * (-1);
        } else {
            return posicionBusqueda;
        }
    }

    @Override
    public Integer nuevo(Object valor){
        if (lleno() == false) {
            int posicion = buscar(valor);
            if (posicion < 0) { 
                posicion = (posicion * -1) - 1;
                indiceUltimo = indiceUltimo + 1;
                for (int mod = indiceUltimo; mod >= posicion + 1; mod--) {
                    arreglo[mod] = arreglo[mod - 1];
                }
                arreglo[posicion] = valor;
                return posicion;
            } else {
                return - 1;
            }
        }else{
            return - 1;
        }
        
    }


    public Object eliminar(Object valor){
        if (vacio() == false) {
            int posicion = buscar(valor);
            if (posicion >= 0) {
                Object respaldo = arreglo[posicion];
                indiceUltimo --;
                for (int mod = posicion; mod <= indiceUltimo; mod++) {
                    arreglo[mod] = arreglo[mod + 1];
                }
                return respaldo;
            }else{
                return null;
            }
        }else{                      
            return null;
        }
    }

    

}