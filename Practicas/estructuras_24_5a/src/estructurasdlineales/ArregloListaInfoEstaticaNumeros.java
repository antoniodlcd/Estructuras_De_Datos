package estructurasdlineales;

import java.lang.Math;

public class ArregloListaInfoEstaticaNumeros extends ArregloListaInfoEstatica {
    public ArregloListaInfoEstaticaNumeros(int max) {
        super(max);
    }

    // metodos sobre-escritos para las operaciones necesarias
    @Override
    public Integer buscar(Object valor) {
        if (valor instanceof Number) {
            return super.buscar(valor);
        } else {
            return null;
        }
    }

    @Override   
    public boolean modificar(Object valorViejo, Object valorNuevo) {
        if ((valorViejo instanceof Number) && (valorNuevo instanceof Number)) {
            return super.modificar(valorViejo, valorNuevo);
        } else {
            return false;
        }
    }

    @Override
    public Integer nuevo(Object valor) {
        if (valor instanceof Number) {
            return super.nuevo(valor);
        } else {
            return null;
        }
    }

    @Override
    public Object quitar(Object valor) {
        if (valor instanceof Number) {
            return super.quitar(valor);
        } else {
            return null;
        }
    }

    @Override
    public boolean porEscalar(Number escalar) {
        if (vacio()) {
            return false;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Object valorPosicion = arreglo[posicion];
                if (valorPosicion instanceof Number) {
                    Number valor = (Number)valorPosicion;
                    Double producto = escalar.doubleValue() * valor.doubleValue();
                    
                    arreglo[posicion] = producto;
                } else {
                    return false;
                }
            }
            return super.porEscalar(escalar);
            
        }
    }

    @Override
    public boolean sumarEscalar(Number escalar) {
        if (vacio()) {
            return false;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Object valorPosicion = arreglo[posicion];
                if (valorPosicion instanceof Number) {
                    Number valor = (Number)valorPosicion;
                    Double suma = escalar.doubleValue() + valor.doubleValue();
                    
                    arreglo[posicion] = suma;
                } else {
                    return false;
                }
            }
            return super.sumarEscalar(escalar);
        }
    }

    @Override
    public boolean sumar(ArregloListaInfoEstaticaNumeros arreglo2) {
        if (indiceUltimo != arreglo2.indiceUltimo) {
            return false;
        }

        for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
            Object valorArreglo1 = arreglo[posicion];
            Object valorArreglo2 = arreglo2.arreglo[posicion];

            if ((valorArreglo1 instanceof Number) && (valorArreglo2 instanceof Number)) {
                Number valor1 = (Number)valorArreglo1;
                Number valor2 = (Number)valorArreglo2;

                Double suma = valor1.doubleValue() + valor2.doubleValue();
                
                arreglo[posicion] = suma;
            } else {
                
            }
        }

        return super.sumar(arreglo2);

    }
    
    @Override
    public boolean multiplicar(ArregloListaInfoEstaticaNumeros arreglo2) {
        if (indiceUltimo != arreglo2.indiceUltimo) {
            return false;
        }

        for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
            Object valorArreglo1 = arreglo[posicion];
            Object valorArreglo2 = arreglo2.arreglo[posicion];

            if ((valorArreglo1 instanceof Number) && (valorArreglo2 instanceof Number)) {
                Number valor1 = (Number)valorArreglo1;
                Number valor2 = (Number)valorArreglo2;

                Double producto = valor1.doubleValue() * valor2.doubleValue();
                
                arreglo[posicion] = producto;
            } else {
                
            }
        }

        return super.multiplicar(arreglo2);
    }

    @Override
    public boolean aplicarPotencia(Number escalar) {
        if (vacio()) {
            return false;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Object valorPosicion = arreglo[posicion];
                if (valorPosicion instanceof Number) {
                    Number valor = (Number)valorPosicion;
                    Double potencia = Math.pow(escalar.doubleValue(), valor.doubleValue());
                    
                    arreglo[posicion] = potencia;
                } else {
                    return false;
                }
            }
            return super.sumarEscalar(escalar);
        }
    }

    @Override
    public boolean aplicarPotencia(ArregloListaInfoEstaticaNumeros arregloEscalares) {
        if ((arregloEscalares.tamanio() != tamanio) || (vacio() == true)) {
            return false;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Number base = (Number)arreglo[posicion];
                Number exponente = (Number)arregloEscalares.arreglo[posicion];

                if (!(base instanceof Number) && !(exponente instanceof Number)) {
                    return false;
                } else {
                    Double potencia = Math.pow(base.doubleValue(), exponente.doubleValue());
                    
                    arreglo[posicion] = potencia;
                }


            }
            
            return super.aplicarPotencia(arregloEscalares);
        }
        
    }

    @Override
    public Double productoEscalar(ArregloListaInfoEstaticaNumeros arreglo2) {
        Number ultimoIndice1 = indiceUltimo;
        Number ultimoIndice2 = arreglo2.indiceUltimo;
        Double producto = 0.0;
        if ((arreglo2.tamanio() != tamanio) || (ultimoIndice1 != ultimoIndice2)) {
            return null;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Number valor1 = (Number)arreglo[posicion];
                Number valor2 = (Number)arreglo2.arreglo[posicion];

                if (!(valor1 instanceof Number) && !(valor2 instanceof Number)){
                    return null;
                } else {
                    producto += valor1.doubleValue() + valor1.doubleValue();
                }
            }
            return producto;
        }
    }

    @Override
    public Double normal2() {
        Double suma2 = 0.0;
        Double normal2 = 0.0;

        for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
            Number valor = (Number)arreglo[posicion];
            if (!(valor instanceof Number)) {
                return null;
            } else {
                suma2 = valor.doubleValue() * valor.doubleValue(); 
            }
        }
        normal2 = Math.sqrt(suma2);
        return normal2;
    }

    @Override
    public Double normaEuclidiana(ArregloListaInfoEstaticaNumeros arreglo2) {
        Double suma = 0.0;
        Double normaEu = null;
        if ((tamanio != arreglo2.tamanio()) || (indiceUltimo != arreglo2.numDatos())) {
            return null;
        } else {
            for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
                Number valor1 = (Number)arreglo[posicion];
                Number valor2 = (Number)arreglo2.arreglo[posicion];
                if (!(valor1 instanceof Number) || !(valor2 instanceof Number)) {
                    return null;
                } else {
                    Double resta = valor1.doubleValue() - valor2.doubleValue();
                    suma += resta * resta;
                    
                }
            }
            normaEu = Math.sqrt(suma);
            return normaEu;
        }
    }

    @Override
    public Double sumarArregloEstatico(ArregloListaInfoEstatica listasArreglos) {
        Double suma = 0.0;
        if ((tamanio != listasArreglos.tamanio()) || (indiceUltimo != listasArreglos.numDatos())) {
            return null;
        } else {
            for (int posicionArreglo = 0; posicionArreglo <= listasArreglos.numDatos(); posicionArreglo++) {
                Number valor1 = (Number)arreglo[posicionArreglo];
                ArregloListaInfoEstatica arregloInterno = (ArregloListaInfoEstatica)listasArreglos.dato(posicionArreglo);
                if (!(valor1 instanceof Number)) {
                    return null;
                } else {
                    int indiceUltimoArrInt = (int)arregloInterno.numDatos();
                    for (int posicion = 0; posicion <= indiceUltimoArrInt ; posicion++) {
                        Double valorInterno = (Double)arregloInterno.arreglo[posicion];
                        suma += valorInterno.doubleValue() + valor1.doubleValue();
                    }
                }
            }
            return suma;
        }
    }

    @Override
    public Double sumarEscalares(ArregloListaInfoEstaticaNumeros escalares) {
        Double suma = 0.0;
        if (indiceUltimo != escalares.numDatos()) {
            return null;
        } else {
            for (int posicionArr1 = 0; posicionArr1 <= indiceUltimo; posicionArr1++) {
                Number valorArr1 = (Number)arreglo[posicionArr1];
                if (!(valorArr1 instanceof Number)) {
                    return null;
                } else {
                    for (int posicionArr2 = 0; posicionArr2 <= escalares.numDatos(); posicionArr2++) {
                        Number valorArr2 = (Number)escalares.arreglo[posicionArr2];
                        if (!(valorArr2 instanceof Number)) {
                            return null;
                        } else {
                            suma += valorArr1.doubleValue() + valorArr2.doubleValue();
                        }
                    }
                }
            }
            return suma;
        }
    }

    @Override
    public Double sumarIndices(ArregloListaInfoEstaticaNumeros arregloIndices) {
        Double suma = 0.0;
        for (int posicion = 0; posicion <= indiceUltimo; posicion++) {
            Number valor = (Number)arreglo[posicion];
            if (!(valor instanceof Number)) {
                return null;
            } else {
                for (int posicionIndices = 0; posicionIndices <= arregloIndices.numDatos(); posicionIndices++) {
                    Number indicePosicion = (Number)arregloIndices.arreglo[posicionIndices];
                    if (!(indicePosicion instanceof Number)) {
                        return null;
                    } else {
                        if (posicion == indicePosicion.intValue()) {
                            suma += valor.doubleValue();
                        }
                    }
                }
            }
        }
        return suma;
    }

    @Override
    public ArregloListaInfoEstatica subArreglo(ArregloListaInfoEstaticaNumeros arregloIndices) {
        if (arregloIndices.numDatos() != 2) {
            return null;
        } else {
            Number indiceInicio = (Number)arregloIndices.arreglo[0];
            Number indiceFinal = (Number)arregloIndices.arreglo[1];
            if (!(indiceInicio instanceof Number) || !(indiceFinal instanceof Number)) {
                return null;
            } else {
                int rango = (indiceFinal.intValue() - indiceInicio.intValue()) + 1;
                if (rango <= 0) {
                    return null;
                } else {
                    ArregloListaInfoEstatica arregloSub = new ArregloListaInfoEstatica(rango);
                    for (int posicion = 0; posicion < indiceUltimo; posicion++) {
                        if ((posicion >= indiceInicio.intValue()) && (posicion <= indiceFinal.intValue())) {
                            arregloSub.nuevo(arreglo[posicion]);
                        }
                    }
                    return arregloSub;

                }
            }
        }
    }

    @Override
    public boolean esOrtogonal(ArregloListaInfoEstaticaNumeros arreglo2) {
        Number procucto = this.productoEscalar(arreglo2);
        if (procucto.doubleValue() == 0) {
            return false;
        } else {
            return super.esOrtogonal(arreglo2);
        }

    }

    @Override
    public boolean esParalelo(ArregloListaInfoEstaticaNumeros arreglo2) {
        if ((arreglo2.tamanio() != tamanio()) || (this.vacio() || arreglo2.vacio())) {
            return false;
        } else {
            Double escalarComparar = null;
            for (int posicion = 0; posicion < indiceUltimo; posicion++) {
                Number valor1 = (Number)arreglo[posicion];
                Number valor2 = (Number)arreglo2.arreglo[posicion];
                if ((valor1.doubleValue() == 0) && (valor2.doubleValue() == 0)) {
                    continue;
                }

                if ((valor1.doubleValue() == 0) || (valor2.doubleValue() == 0)) {
                    return false;
                } else {
                    Double escalar = valor1.doubleValue() / valor2.doubleValue();
                    if (escalarComparar == null) {
                        escalarComparar = escalar;
                    } else if (escalarComparar != escalar) {
                        return false;
                    }
                }
            }
            return super.esParalelo(arreglo2);
        }
        
    }

    
    
    
}
