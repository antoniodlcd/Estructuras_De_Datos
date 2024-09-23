package registros.ciclismo;

import javax.naming.InitialContext;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstatica;
import estructurasdnolineales.ArregloListaInfoEstatica3;
import registros.IndicesCubo;

public class AdministracionEventosCiclismo {
    protected ArregloListaInfoEstatica3 kilometros;
    protected ArregloListaInfoEstatica ciclistas;
    protected ArregloListaInfoEstatica eventos;
    protected ArregloListaInfoEstatica anios;

    // constructor
    public AdministracionEventosCiclismo(int cuantosAnios, int cuantosEventos, int cuantosCiclistas) {
        ciclistas = new ArregloListaInfoEstatica(cuantosCiclistas);
        eventos = new ArregloListaInfoEstatica(cuantosEventos);
        anios = new ArregloListaInfoEstatica(cuantosAnios);
        kilometros = new ArregloListaInfoEstatica3(cuantosCiclistas, cuantosEventos, cuantosAnios, 0.0);
    }

    // metodo para agregar ciclistas
    public boolean agregarCiclista(Ciclista ciclistaNuevo){
        int retornoBusqueda = ciclistas.buscar(ciclistaNuevo);
        if (retornoBusqueda < 0) { // no existe
            int retornoNuevo = ciclistas.nuevo(ciclistaNuevo);
            if (retornoNuevo >= 0) { // si se pudo agregar
                return true;
            } else {
                return false;
            }
        } else { // ya existe
            return false;
        }
    }

    public boolean agregarEvento(Evento eventoNuevo){
        int retornoBusqueda = eventos.buscar(eventoNuevo);
        if (retornoBusqueda < 0) { // no existe
            int retornoNuevo = eventos.nuevo(eventoNuevo);
            if (retornoNuevo >= 0) { // si se pudo agregar
                return true;
            } else {
                return false;
            }
        } else { // ya existe
            return false;
        }
    }

    public boolean agregarAnios(int anio){
        int retornoBusqueda = anios.buscar(anio);
        if (retornoBusqueda < 0) { // no existe
            int retornoNuevo = anios.nuevo(anio);
            if (retornoNuevo >= 0) { // si se pudo agregar
                return true;
            } else {
                return false;
            }
        } else { // ya existe
            return false;
        }
    }

    private IndicesCubo calcularIndices(int claveCiclista, String nombreEvento, int anio) {
        IndicesCubo indices = new IndicesCubo();
        int retornoBusqueda = ciclistas.buscar(claveCiclista);
        indices.setIndiceX(retornoBusqueda);
        
        int retornoNombreEvento = eventos.buscar(nombreEvento);
        indices.setIndiceY(retornoNombreEvento);

        int retornoAnio = eventos.buscar(anio);
        indices.setIndiceZ(retornoAnio);

        return indices;
    }

    private int calcularIndiceCiclista(int claveCiclista){
        return ciclistas.buscar(claveCiclista);
    }

    private int calcularIndiceEventos(int nombreE){
        return eventos.buscar(nombreE);
    }

    private int calcularIndiceAnio(int anio){
        return anios.buscar(anio);
    }

    public boolean agregarKilometros(int claveCiclista, String nombreEvento, int anio, Double kms) {
        IndicesCubo indices = calcularIndices(claveCiclista, nombreEvento, anio);
        
        // verificar que los indices obtenidos sean validos
        if (indices != null) {

            boolean retorno = kilometros.cambiar(indices.getIndiceX(), indices.getIndiceY(), indices.getIndiceZ(), kms);
            return retorno;
        } else {
            return false;
        }

    }

    public void mostrarDatos() {
        FlujoSalida.mostrarConsola("Datos de Ciclistas: \n");

        // imprimir los datos de los ciclistas
        // recorrer el arreglo de ciclistas y sacar de uno en uno
        FlujoSalida.mostrarConsola("Datos de cada ciclista: \n");
        for (int cadaCiclista = 0; cadaCiclista < ciclistas.numDatos(); cadaCiclista++) {
            Ciclista ciclistaTemporal = (Ciclista)ciclistas.dato(cadaCiclista);
            FlujoSalida.mostrarConsola("Clave: " + ciclistaTemporal.getClaveCiclista() + " ; ");
            FlujoSalida.mostrarConsola("Nombre: " + ciclistaTemporal.getNombre() + " ; ");
            FlujoSalida.mostrarConsola("Edad: " + ciclistaTemporal.getEdad());
            FlujoSalida.mostrarConsola("\n");
        }

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Datos del evento: \n");

        for (int cadaEvento = 0; cadaEvento < eventos.numDatos(); cadaEvento++) {
            Evento eventoTemporal = (Evento)eventos.dato(cadaEvento);
            FlujoSalida.mostrarConsola("Nombre: " + eventoTemporal.getNombre() + " ; ");
            FlujoSalida.mostrarConsola("Lugar: " + eventoTemporal.getLugar() + " ; ");
            FlujoSalida.mostrarConsola("Fecha: " + eventoTemporal.getFecha());
            FlujoSalida.mostrarConsola("\n");
        }

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Datos del año: \n");

        for (int cadaAnio = 0; cadaAnio < anios.numDatos(); cadaAnio++) {
            Integer anioTemporal = (Integer)anios.dato(cadaAnio);
            FlujoSalida.mostrarConsola("Año: " + anioTemporal);
            FlujoSalida.mostrarConsola("\n");
        }

        FlujoSalida.mostrarConsola("\n");

        FlujoSalida.mostrarConsola("Datos de cada ciclista: \n");
        kilometros.imprimirXColumnas();
        FlujoSalida.mostrarConsola("\n");
    }

    //Se pide que se obtenga la informacion de los kilometros
    //recorridos por jorge el 2010, 2011, 2012.
    //Resp. 1:  2010: 400km
    //          2011: 200km
    //          2012: 343km
    //Resp. 2:  Los kms recorridos de Jorge en 2010, 2011 y 2012 son 
    
    public ArregloListaInfoEstatica kmsRecorridosXCiclista(int claveCiclista, ArregloListaInfoEstatica aniosPedidos){
        //Recorremos el arreglo de aniosPedidos para calcular
        //los kms de cada año
        ArregloListaInfoEstatica kmsXAnio = new ArregloListaInfoEstatica(aniosPedidos.numDatos());
        for (int cadaAnio = 0; cadaAnio < aniosPedidos.numDatos(); cadaAnio++) {
            int anioTemp = (int)aniosPedidos.dato(cadaAnio);
            kmsXAnio.nuevo(kmsRecorridosXAnio(claveCiclista, anioTemp));
        }
        return null;
    }

    //Hacer un metodo que calcule solo por un año
    public Double kmsRecorridosXAnio(int claveCiclista, int anio){
        Double kmsAcumulados = 0.0;
        int indiceCiclista = calcularIndiceCiclista(claveCiclista);
        int indiceAnio = calcularIndiceAnio(anio);

        //Recorrer todas las columnas(eventos)
        for(int cadaEventoCol = 0; cadaEventoCol < kilometros.getColumnas(); cadaEventoCol++){
            Double kmsTemp = (Double)kilometros.dato(indiceCiclista, cadaEventoCol, indiceAnio);
            if (kmsTemp != null) {
                kmsAcumulados = kmsAcumulados + kmsTemp;
            }// Si son nulos, simplemente no acumulo nada
        }
        return kmsAcumulados;
    }

}