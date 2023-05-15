package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALHabitacionesDobles {
    
    private static final String NOMBRE_ARCHIVO = "data_habitaciones_dobles.txt";
    private static RandomAccessFile stream;
    private static final int TAMAÑO_REGISTRO = 65;
    private static int numeroHabitacionesDobles;
    
    private static String crearFlujo(){
        try{
            stream = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroHabitacionesDobles = (int) Math.ceil(
                    (double) stream.length() / (double) TAMAÑO_REGISTRO);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static String escribirHabitacionDoble(HabitacionDoble habitacion){
        String mensaje = "";
        try {
            crearFlujo();
            stream.close();
            mensaje = setHabitacionDoble(numeroHabitacionesDobles, habitacion);
            if (mensaje.compareTo("ok") == 0) {
                numeroHabitacionesDobles++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mensaje; 
    }

    public static String setHabitacionDoble(int posicion, HabitacionDoble habitacion){
        String mensaje = "";
        try {
            if (habitacion.getTamaño() + 2 > TAMAÑO_REGISTRO)
                mensaje = "Tamaño de Registro insuficiente";
            else {
                crearFlujo();
                stream.seek(posicion * TAMAÑO_REGISTRO);
                stream.writeUTF(HabitacionDoble.NOMBRE);
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
            for (int i = 0; i < getNumeroHabitacionesDobles(); i++) {
                crearFlujo();
                stream.seek(i * TAMAÑO_REGISTRO);
                stream.readUTF();
                stream.readUTF();
                stream.writeDouble(precioPorNoche);
            }
            mensaje = "ok";
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return mensaje;
    }

    public static HabitacionDoble getHabitacionDoble(int pos){
        HabitacionDoble habitacion = null;
        try {
            crearFlujo();
            stream.seek(pos * TAMAÑO_REGISTRO);
            stream.readUTF();
            habitacion = new HabitacionDoble(
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
    
    public static ArrayList<HabitacionDoble> getHabitacionesDobles(){
        ArrayList<HabitacionDoble> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroHabitacionesDobles; i++)
                lista.add(getHabitacionDoble(i));
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroHabitacionesDobles() {
        try {
            crearFlujo();
            stream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroHabitacionesDobles;
    }
}