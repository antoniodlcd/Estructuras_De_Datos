package estructurasdlineales;

public interface ArregloListaDatos {
    public boolean vacio();
    public Integer nuevo(Object valor);
    public void imprimir();
    public void imprimirReves();
    public Integer buscar(Object valor);
    public Object quitar(Object valor);

    // metodos de la practica 2
    public Boolean esIdentico(Object arreglo2); 
    public Boolean modificar(Object valorViejo, Object valorNuevo, int cuantasVeces);
    public ArregloListaInfoEstatica buscarValores(Object valor);
    public Object quitar();
    public void limpiar();
    public Boolean agregarArreglo(Object arreglo2);
    public void voltear();
    public int cuantificar(Object valor);
    public Boolean quitarArreglo(Object arreglo2);
    public void llenar(Object valor, int numElementos);
    public ArregloListaDatos copiar();
    public ArregloListaDatos subArreglo(int posicionInicial, int posicionFinal);

    // metodos de la practica 3
    public boolean sumar(ArregloListaInfoEstaticaNumeros arreglo2);
    public boolean multiplicar(ArregloListaInfoEstaticaNumeros arreglo2);
    public boolean aplicarPotencia(ArregloListaInfoEstaticaNumeros arregloEscalares);
    public Double productoEscalar(ArregloListaInfoEstaticaNumeros arreglo2);
    public Double normal2();
    public Double normaEuclidiana(ArregloListaInfoEstaticaNumeros arreglo2);
    public Double sumarArregloEstatico(ArregloListaInfoEstatica listasArreglos);
    public Double sumarEscalares(ArregloListaInfoEstaticaNumeros escalares);
    public Double sumarIndices(ArregloListaInfoEstaticaNumeros arregloIndices);
    public ArregloListaInfoEstatica subArreglo(ArregloListaInfoEstaticaNumeros arregloIndices);
    public boolean esOrtogonal(ArregloListaInfoEstaticaNumeros arreglo2);
    public boolean esParalelo(ArregloListaInfoEstaticaNumeros arreglo2);
}
