package entradasalida;

import java.io.*;

public class FlujoEntrada {
    @SuppressWarnings("finally")
    public static String consolaCadenas(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String cadenaEntrada="";

        try{
            cadenaEntrada= buffer.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return cadenaEntrada;
        }
    }

    @SuppressWarnings("finally")
    public static Double consolaDouble(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        double entrada=0.0;

        try{
            entrada= Double.parseDouble(buffer.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return entrada;
        }
    }
}