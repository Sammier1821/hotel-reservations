package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALHabitacionesSimples {
    
    private static final String NOMBRE_ARCHIVO = "data_habitaciones_simples.txt";
    private static RandomAccessFile stream;
    private static final int TAMAÑO_REGISTRO = 65;
    private static int numeroHabitacionesSimples;
    
    private static String crearFlujo(){
        try{
            stream = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroHabitacionesSimples = (int) Math.ceil(
                    (double) stream.length() / (double) TAMAÑO_REGISTRO);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static String escribirHabitacionSimple(HabitacionSimple habitacion){
        String mensaje = "";
        try {
            crearFlujo();
            stream.close();
            mensaje = setHabitacionSimple(numeroHabitacionesSimples, habitacion);
            if (mensaje.compareTo("ok") == 0) {
                numeroHabitacionesSimples++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mensaje; 
    }

    public static String setHabitacionSimple(int posicion, HabitacionSimple habitacion){
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
    
    public static String actualizarPrecio(double precioPorNoche) {
        String mensaje = "";
        try {
            for (int i = 0; i < getNumeroHabitacionesSimples(); i++) {
                crearFlujo();
                stream.seek(i * TAMAÑO_REGISTRO);
                stream.readUTF();
                stream.readUTF();
                stream.writeDouble(precioPorNoche);
            }
            mensaje = "ok";
        } catch (IOException ex) {
            System.out.println("PROBLEMA: " + ex.getMessage());
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return mensaje;
    }

    public static HabitacionSimple getHabitacionSimple(int pos){
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
    
    public static ArrayList<HabitacionSimple> getHabitacionesSimples(){
        ArrayList<HabitacionSimple> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroHabitacionesSimples; i++)
                lista.add(getHabitacionSimple(i));
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroHabitacionesSimples() {
        try {
            crearFlujo();
            stream.close();
            //Obtiene el NumRegistro actualizado
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroHabitacionesSimples;
    }
    
}