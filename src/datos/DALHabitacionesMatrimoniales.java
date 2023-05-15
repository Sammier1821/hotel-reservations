package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALHabitacionesMatrimoniales {
    
    private static final String NOMBRE_ARCHIVO = 
            "data_habitaciones_matrimoniales.txt";
    private static RandomAccessFile stream;
    private static final int TAMAÑO_REGISTRO = 65;
    private static int numeroHabitacionesMatrimoniales;
    
    private static String crearFlujo(){
        try{
            stream = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroHabitacionesMatrimoniales = (int) Math.ceil(
                    (double) stream.length() / (double) TAMAÑO_REGISTRO);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static String escribirHabitacionMatrimonial(HabitacionMatrimonial habitacion){
        String mensaje = "";
        try {
            crearFlujo();
            stream.close();
            mensaje = setHabitacionMatrimonial(numeroHabitacionesMatrimoniales, habitacion);
            if (mensaje.compareTo("ok") == 0) {
                numeroHabitacionesMatrimoniales++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return mensaje; 
    }

    public static String setHabitacionMatrimonial(int posicion, HabitacionMatrimonial habitacion){
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
            for (int i = 0; i < getNumeroHabitacionesMatrimoniales(); i++) {
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

    public static HabitacionMatrimonial getHabitacionMatrimonial(int pos){
        HabitacionMatrimonial habitacion = null;
        try {
            crearFlujo();
            stream.seek(pos * TAMAÑO_REGISTRO);
            stream.readUTF();
            habitacion = new HabitacionMatrimonial(
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
    
    public static ArrayList<HabitacionMatrimonial> getHabitacionesMatrimoniales(){
        ArrayList<HabitacionMatrimonial> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroHabitacionesMatrimoniales; i++)
                lista.add(getHabitacionMatrimonial(i));
        } finally {
            try{
                stream.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroHabitacionesMatrimoniales() {
        try {
            crearFlujo();
            stream.close();
            //Obtiene el NumRegistro actualizado
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroHabitacionesMatrimoniales;
    }
}