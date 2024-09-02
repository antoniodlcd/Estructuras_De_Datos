package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstatica;
import estructurasdlineales.ArregloListaInfoEstaticaNumeros;

public class PruebaArregloEstatico {
    public static void main(String args[]) {
        ArregloListaInfoEstatica miArreglo1 = new ArregloListaInfoEstatica(6);
        ArregloListaInfoEstatica miArreglo2 = new ArregloListaInfoEstatica(6);
        ArregloListaInfoEstatica miArreglo3 = new ArregloListaInfoEstatica(6);
        ArregloListaInfoEstatica miArreglo4 = new ArregloListaInfoEstatica(10);

        ArregloListaInfoEstatica valoresNuevos = new ArregloListaInfoEstatica(6);
        ArregloListaInfoEstatica posicionesBusqueda = new ArregloListaInfoEstatica(6);
        
        ArregloListaInfoEstatica valoresNuevos2 = new ArregloListaInfoEstatica(7);
        ArregloListaInfoEstatica posicionesBusqueda2 = new ArregloListaInfoEstatica(8);

        // arreglos practica 3
        ArregloListaInfoEstatica arregloNumPosiciones = new ArregloListaInfoEstatica(10);
        ArregloListaInfoEstaticaNumeros arregloNumBase = new ArregloListaInfoEstaticaNumeros(10);
        ArregloListaInfoEstaticaNumeros arregloNum1 = new ArregloListaInfoEstaticaNumeros(10);
        ArregloListaInfoEstaticaNumeros arregloNum2 = new ArregloListaInfoEstaticaNumeros(10);
        ArregloListaInfoEstaticaNumeros arregloNum3 = new ArregloListaInfoEstaticaNumeros(10);


        miArreglo1.nuevo("R");
        miArreglo1.nuevo("T");
        miArreglo1.nuevo("S");
        miArreglo1.nuevo("V");
        miArreglo1.nuevo("G");
        miArreglo1.nuevo("Q");
        miArreglo1.nuevo("K");

        miArreglo1.imprimir();
        FlujoSalida.mostrarConsola("\n");
        miArreglo1.imprimirReves();

        // pruebas metodo buscar
        FlujoSalida.mostrarConsola("Buscando a S: " + miArreglo1.buscar("S") + "\n");
        FlujoSalida.mostrarConsola("Buscando a M: " + miArreglo1.buscar("M") + "\n");

        // pruebas metodo quitar
        FlujoSalida.mostrarConsola("Eliminando a S: " + miArreglo1.quitar("S") + "\n");
        FlujoSalida.mostrarConsola("Eliminando a O: " + miArreglo1.quitar("O") + "\n");

        miArreglo1.imprimir();
        FlujoSalida.mostrarConsola("\n");

        // pruebas metodos tamanio y numDatos
        FlujoSalida.mostrarConsola("Tamaño máximo del arreglo: " + miArreglo1.tamanio() + "\n");
        FlujoSalida.mostrarConsola("Cantidad de elementos en el arreglo : " + miArreglo1.numDatos() + "\n");

        FlujoSalida.mostrarConsola("\n");

        miArreglo2.nuevo("R");
        miArreglo2.nuevo("T");
        miArreglo2.nuevo("S");
        miArreglo2.nuevo("V");
        miArreglo2.nuevo("G");
        miArreglo2.nuevo("Q");
        miArreglo2.nuevo("K");

        
        FlujoSalida.mostrarConsola("Buscando a S: " + miArreglo2.buscar("S") + "\n");
        FlujoSalida.mostrarConsola("Buscando a M: " + miArreglo2.buscar("M") + "\n");

        FlujoSalida.mostrarConsola("Eliminando a S: " + miArreglo2.quitar("S") + "\n");
        FlujoSalida.mostrarConsola("Eliminando a O: " + miArreglo2.quitar("O") + "\n");

        miArreglo3.nuevo("B");
        miArreglo3.nuevo("T");
        miArreglo3.nuevo("B");
        miArreglo3.nuevo("V");
        miArreglo3.nuevo("G");
        miArreglo3.nuevo("B");
        miArreglo3.nuevo("K");

        miArreglo2.imprimir();
        FlujoSalida.mostrarConsola("\n");
        miArreglo3.imprimir();

        // pruebas metodo esIdentico
        FlujoSalida.mostrarConsola("Arreglo 1 identico a arreglo 2: " + miArreglo1.esIdentico(miArreglo2) + "\n");
        FlujoSalida.mostrarConsola("Arreglo 2 identico a arreglo 3: " + miArreglo2.esIdentico(miArreglo3) + "\n");
        FlujoSalida.mostrarConsola("Arreglo 3 identico a arreglo 1: " + miArreglo3.esIdentico(miArreglo1) + "\n");

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo dato
        FlujoSalida.mostrarConsola("Objeto de arreglo 1 en posición 3: " + miArreglo1.dato(3) + "\n");
        FlujoSalida.mostrarConsola("Objeto de arreglo 2 en posición 0: " + miArreglo2.dato(1) + "\n");
        FlujoSalida.mostrarConsola("Objeto de arreglo 3 en posición 8: " + miArreglo1.dato(8) + "\n");

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo modificar
        FlujoSalida.mostrarConsola("Cambiar 2 veces B por X del arreglo 3: " + miArreglo3.modificar("B", "X", 2) + "\n");
        FlujoSalida.mostrarConsola("Cambiar 2 veces S por F del arreglo 3: " + miArreglo3.modificar("S", "F", 2) + "\n");
        
        miArreglo3.imprimir();

        FlujoSalida.mostrarConsola("Cambiar 7 veces X por Z del arreglo 3: " + miArreglo3.modificar("X", "Z", 7) + "\n");

        miArreglo3.imprimir();

        // pruebas metodo cambiar
        FlujoSalida.mostrarConsola("Cambiar el objeto de la posición 2 por X del arreglo 2: " + miArreglo2.cambiar(2, "X") + "\n");
        FlujoSalida.mostrarConsola("Cambiar el objeto de la posición 5 por X del arreglo 2: " + miArreglo2.cambiar(5, "X") + "\n");
        
        miArreglo2.imprimir();

        valoresNuevos.nuevo("A");
        valoresNuevos.nuevo("B");
        valoresNuevos.nuevo("C");
        valoresNuevos.nuevo("D");
        valoresNuevos.nuevo("F");
        valoresNuevos.nuevo("G");
        valoresNuevos.nuevo("H");

        posicionesBusqueda.nuevo(0);
        posicionesBusqueda.nuevo(1);
        posicionesBusqueda.nuevo(2);
        posicionesBusqueda.nuevo(3);
        posicionesBusqueda.nuevo(4);
        posicionesBusqueda.nuevo(5);
        posicionesBusqueda.nuevo(6);

        // pruebas metodo modificar
        FlujoSalida.mostrarConsola("Modificar todos los elementos del arreglo 3: " + miArreglo3.modificar(posicionesBusqueda, valoresNuevos) + "\n");

        miArreglo3.imprimir();

        FlujoSalida.mostrarConsola("\n");

        valoresNuevos2.nuevo("A");
        valoresNuevos2.nuevo("B");
        valoresNuevos2.nuevo("C");
        valoresNuevos2.nuevo("D");
        valoresNuevos2.nuevo("F");
        valoresNuevos2.nuevo("G");
        valoresNuevos2.nuevo("H");

        posicionesBusqueda2.nuevo(0);
        posicionesBusqueda2.nuevo(1);
        posicionesBusqueda2.nuevo(2);
        posicionesBusqueda2.nuevo(3);
        posicionesBusqueda2.nuevo(4);
        posicionesBusqueda2.nuevo(5);
        posicionesBusqueda2.nuevo(6);

        FlujoSalida.mostrarConsola("Modificar todos los elementos del arreglo 3: " + miArreglo3.modificar(posicionesBusqueda2, valoresNuevos2) + "\n");

        miArreglo3.imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo cambiar
        FlujoSalida.mostrarConsola("Cambiar el objeto de la posición 0 por X del arreglo 1: " + miArreglo1.cambiar(0, "X") + "\n");
        FlujoSalida.mostrarConsola("Cambiar el objeto de la posición 2 por X del arreglo 1: " + miArreglo1.cambiar(2, "X") + "\n");
        FlujoSalida.mostrarConsola("Cambiar el objeto de la posición 4 por X del arreglo 1: " + miArreglo1.cambiar(4, "X") + "\n");

        miArreglo1.imprimir();

        FlujoSalida.mostrarConsola("Posiciones de todas las X del arreglo 1: \n");

        miArreglo1.buscarValores("X").imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo quitar
        FlujoSalida.mostrarConsola("Eliminar el objeto de la posición 4 del arreglo 1: " + miArreglo1.quitar(4) + "\n");
        FlujoSalida.mostrarConsola("Eliminar el objeto de la posición 5 del arreglo 1: " + miArreglo1.quitar(5) + "\n");

        miArreglo1.imprimir();
        
        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Último objeto del arreglo 2: " + miArreglo2.quitar() + "\n");

        miArreglo2.imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo limpiar
        FlujoSalida.mostrarConsola("Elimiar todos los objetos del arreglo 3: \n");

        miArreglo3.limpiar();

        miArreglo3.imprimir();

        FlujoSalida.mostrarConsola("Agregar elementos al arreglo 3: \n");

        miArreglo3.nuevo("G");
        miArreglo3.nuevo("H");
        miArreglo3.nuevo("I");
        miArreglo3.nuevo("J");

        miArreglo3.imprimir();

        FlujoSalida.mostrarConsola("Agregar elementos al arreglo 4: \n");

        miArreglo4.nuevo("A");
        miArreglo4.nuevo("B");
        miArreglo4.nuevo("C");
        miArreglo4.nuevo("D");
        miArreglo4.nuevo("E");
        miArreglo4.nuevo("F");

        miArreglo4.imprimir();

        // pruebas metodo agregarArreglo
        FlujoSalida.mostrarConsola("Agregar los elementos del arreglo 3 al arreglo 4: " + miArreglo4.agregarArreglo(miArreglo3) + "\n");

        miArreglo4.imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo voltear
        FlujoSalida.mostrarConsola("Voltear el orden de los elementos del arreglo 4: \n");

        miArreglo4.voltear();

        miArreglo4.imprimir();
        
        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo cuantificar
        FlujoSalida.mostrarConsola("Número de X en el arreglo 1: " + miArreglo1.cuantificar("X") + "\n");

        miArreglo1.imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo quitarArreglo
        FlujoSalida.mostrarConsola("Quitar todos los elementos de arreglo 3 del arreglo 4: " + miArreglo4.quitarArreglo(miArreglo3) + "\n");

        miArreglo4.imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo llenar
        FlujoSalida.mostrarConsola("Llenar 7 espacios del arreglo 4 con X: \n");

        miArreglo4.llenar("X", 7);

        miArreglo4.imprimir();

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Llenar 11 espacios del arreglo 4 con X: \n");

        miArreglo4.llenar("X", 11);

        miArreglo4.imprimir();

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Arreglo 1: \n");

        miArreglo1.imprimir();

        // pruebas metodo copiar
        FlujoSalida.mostrarConsola("Crear copia del arreglo 1: \n");

        miArreglo1.copiar().imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo subArreglo
        FlujoSalida.mostrarConsola("Elementos entre las posiciones 1 y 3 del arreglo 1: \n");

        miArreglo1.subArreglo(1, 3).imprimir();

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Elementos entre las posiciones 1 y 1 del arreglo 1: \n");

        miArreglo1.subArreglo(1, 1).imprimir();

        FlujoSalida.mostrarConsola("\n");

        // pruebas metodo cambiarTamanio
        FlujoSalida.mostrarConsola("Cambiar el tamaño del arreglo 4 a 7: " + miArreglo4.cambiarTamanio(7) + "\n");

        miArreglo4.imprimir();

        
        // Pruebas de la practica 3
        arregloNumPosiciones.nuevo(0);
        arregloNumPosiciones.nuevo(1);
        arregloNumPosiciones.nuevo(2);
        arregloNumPosiciones.nuevo(3);
        arregloNumPosiciones.nuevo(4);
        arregloNumPosiciones.nuevo(5);
        arregloNumPosiciones.nuevo(6);
        arregloNumPosiciones.nuevo(7);
        arregloNumPosiciones.nuevo(8);
        arregloNumPosiciones.nuevo(9);

        arregloNumBase.nuevo(1);
        arregloNumBase.nuevo(2);
        arregloNumBase.nuevo(3);
        arregloNumBase.nuevo(4);
        arregloNumBase.nuevo(5);
        arregloNumBase.nuevo(6);
        arregloNumBase.nuevo(7);
        arregloNumBase.nuevo(8);
        arregloNumBase.nuevo(9);
        arregloNumBase.nuevo(10);

        arregloNum1.nuevo(1);
        arregloNum1.nuevo(2);
        arregloNum1.nuevo(3);
        arregloNum1.nuevo(4);
        arregloNum1.nuevo(5);
        arregloNum1.nuevo(6);
        arregloNum1.nuevo(7);
        arregloNum1.nuevo(8);
        arregloNum1.nuevo(9);
        arregloNum1.nuevo(10);

        FlujoSalida.mostrarConsola("Los números del arregloNum1 multiplicados por 5: " + arregloNum1.porEscalar(5) + "\n");

        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);

        FlujoSalida.mostrarConsola("Los números del arregloNum2 multiplicados por 5: " + arregloNum2.porEscalar(5) + "\n");

        arregloNum2.imprimir();
        arregloNum2.modificar(arregloNumPosiciones , arregloNumBase);

        FlujoSalida.mostrarConsola("Los números del arregloNum1 sumados con 5: " + arregloNum1.sumarEscalar(5) + "\n");

        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);

        FlujoSalida.mostrarConsola("Los números del arregloNum2 sumados con 5: " + arregloNum2.sumarEscalar(5) + "\n");

        arregloNum2.imprimir();
        arregloNum2.modificar(arregloNumPosiciones, arregloNumBase);

        FlujoSalida.mostrarConsola("\n");

        arregloNum2.nuevo(2.5);
        arregloNum2.nuevo(4.7);
        arregloNum2.nuevo(7.2);
        arregloNum2.nuevo(2.5);
        arregloNum2.nuevo(4.4);
        arregloNum2.nuevo(4.3);
        arregloNum2.nuevo(2.2);
        arregloNum2.nuevo(8.6);
        arregloNum2.nuevo(7.5);
        arregloNum2.nuevo(6.5);

        FlujoSalida.mostrarConsola("Los números del arregloNum1 sumados con los números del arregloNum2: "+ arregloNum1.sumar(arregloNum2) + "\n");

        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Los números del arregloNum1 multiplicados por los números del arregloNum2: "+ arregloNum1.multiplicar(arregloNum2) + "\n");
        
        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Los números del arregloNum1 elevados a la 2da potencia: "+ arregloNum1.aplicarPotencia(2) + "\n");

        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);
        
        FlujoSalida.mostrarConsola("\n");

        arregloNum3.nuevo(1);
        arregloNum3.nuevo(2);
        arregloNum3.nuevo(3);
        arregloNum3.nuevo(4);
        arregloNum3.nuevo(5);
        arregloNum3.nuevo(6);
        arregloNum3.nuevo(7);
        arregloNum3.nuevo(8);
        arregloNum3.nuevo(9);
        arregloNum3.nuevo(10);

        FlujoSalida.mostrarConsola("Numeros del arreglo 3: \n");

        arregloNum3.imprimir();
    
        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Los números del arregloNum1 elevados a los números del arreglo 3: "+ arregloNum1.aplicarPotencia(arregloNum3) + "\n");

        arregloNum1.imprimir();
        arregloNum1.modificar(arregloNumPosiciones, arregloNumBase);
        
        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Producto escalar del arreglo 1 y el arreglo 3: " + arregloNum1.productoEscalar(arregloNum3) + "\n");
        
        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Norma L2 del vector(arreglo) 1" + arregloNum1.normal2() + "\n");

    }
}
