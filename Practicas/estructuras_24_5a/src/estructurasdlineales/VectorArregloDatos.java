package estructurasdlineales;

public interface VectorArregloDatos extends ArregloListaDatos{
    public boolean lleno();
    public int tamanio();
    public int numDatos();

    // metodos de la practica 2
    public Object dato(int posicion);
    public boolean modificar(Object valorViejo, Object valorNuevo);
    public Boolean cambiar(int posicion, Object valor);
    public Boolean modificar(ArregloListaInfoEstatica posicionesBusqueda, ArregloListaInfoEstatica valoresNuevos);
    public Object quitar(int posicion);
    public Boolean cambiarTamanio(int max);

    // metodos de la practica 3
    public boolean porEscalar(Number escalar);
    public boolean sumarEscalar(Number escalar);
    public boolean aplicarPotencia(Number escalar);
}
