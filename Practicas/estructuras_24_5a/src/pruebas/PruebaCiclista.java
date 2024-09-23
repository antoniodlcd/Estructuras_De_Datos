package pruebas;

import entradasalida.FlujoSalida;
import estructurasdlineales.ArregloListaInfoEstatica;
import registros.ciclismo.AdministracionEventosCiclismo;
import registros.ciclismo.Ciclista;
import registros.ciclismo.Evento;

public class PruebaCiclista {
    public static void main(String[] args) {
        AdministracionEventosCiclismo controlCiclista = new AdministracionEventosCiclismo(3, 4, 5);
        
        Ciclista ciclista1 = new Ciclista(1, "Juan", 20, "Mexico");
        Ciclista ciclista2 = new Ciclista(2, "Felipe", 31, "Venezuela");
        Ciclista ciclista3 = new Ciclista(3, "Jose", 25, "Honduras");

        controlCiclista.agregarCiclista(ciclista1);
        controlCiclista.agregarCiclista(ciclista2);
        controlCiclista.agregarCiclista(ciclista3);

        Evento evento1 = new Evento("Triatlon", "02/09/2003", "Fresnillo");
        Evento evento2 = new Evento("Exatlon", "03/10/2014", "Calera");
        Evento evento3 = new Evento("Cardias", "05/11/2016", "Guadalupe");

        controlCiclista.agregarEvento(evento1);
        controlCiclista.agregarEvento(evento2);
        controlCiclista.agregarEvento(evento3);

        controlCiclista.agregarAnios(2003);
        controlCiclista.agregarAnios(2016);
        controlCiclista.agregarAnios(2014);

        controlCiclista.agregarKilometros(1, "Triatlon", 2003, 40.0);
        controlCiclista.agregarKilometros(2, "Exatlon", 2014, 60.0);
        controlCiclista.agregarKilometros(3, "Cardias", 2016, 50.0);
        controlCiclista.agregarKilometros(3, "Triatlon", 2003, 45.0);

        controlCiclista.mostrarDatos();
                //Se pide que se obtenga la informacion de los kilometros
        //recorridos por jorge el 2010, 2011, 2012.
        //Resp. 1:  2010: 400km
        //          2011: 200km
        //          2012: 343km
        ArregloListaInfoEstatica aniosPedidos = new ArregloListaInfoEstatica(3);
        aniosPedidos.nuevo(2010);
        aniosPedidos.nuevo(2011);
        aniosPedidos.nuevo(2012);
        
        //invocar a quien lo calcula
        //le voy a pasar un ciclista(claveCIclista) y el arreglo de
        //años que se solicitan
        ArregloListaInfoEstatica kmsRecorridos = null;
        kmsRecorridos = controlCiclista.kmsRecorridosXCiclista(1, aniosPedidos);

        FlujoSalida.mostrarConsola("Los datos por año son: \n");

    }
}
