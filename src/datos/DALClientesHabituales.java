package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALClientesHabituales {
    
    private static final String NOMBRE_ARCHIVO = "data_clientes_habituales.txt";
    private static RandomAccessFile stream;
    private static final int TAMAÑO_REGISTRO = 65;
    private static int numeroClientesHabituales;
    
    private static String crearFlujo(){
        try{
            stream = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroClientesHabituales = (int) Math.ceil(
                    (double) stream.length() / (double) TAMAÑO_REGISTRO);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static String escribirClienteHabitual(HabitacionSimple habitacion){
        String mensaje = "";
        try {
            crearFlujo();
            stream.close();
            mensaje = setClienteHabitual(numeroClientesHabituales, habitacion);
            if (mensaje.compareTo("ok") == 0) {
                numeroClientesHabituales++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mensaje; 
    }

    public static String setClienteHabitual(int posicion, HabitacionSimple habitacion){
        String mensaje = "";
        try {
            if (habitacion.getTamaño() + 2 > TAMAÑO_REGISTRO)
                mensaje = "Tamaño de Registro insuficiente";
            else {
                crearFlujo();
                stream.seek(posicion * TAMAÑO_REGISTRO);
                stream.writeUTF(HabitacionSimple.NOMBRE);
                stream.writeUTF(habitacion.getCodigo());
                stream.writeDouble(habitacion.getPrecioPorNoche());
                stream.writeBoolean(habitacion.isOcupada());
                mensaje = "ok";
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mensaje;
    }
    
    public static HabitacionSimple getClienteHabitual(int pos){
        HabitacionSimple habitacion = null;
        try {
            crearFlujo();
            stream.seek(pos * TAMAÑO_REGISTRO);
            stream.readUTF();
            habitacion = new HabitacionSimple(
                    stream.readUTF(), 
                    stream.readDouble(),
                    stream.readBoolean());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return habitacion;
    }
    
    public static ArrayList<HabitacionSimple> getClientesHabituales(){
        ArrayList<HabitacionSimple> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroClientesHabituales; i++)
                lista.add(getClienteHabitual(i));
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroClientesHabituales() {
        try {
            crearFlujo();
            stream.close();
            //Obtiene el NumRegistro actualizado
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroClientesHabituales;
    }
    
}