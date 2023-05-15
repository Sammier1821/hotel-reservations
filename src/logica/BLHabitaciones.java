package logica;

import datos.DALHabitacionesDobles;
import datos.DALHabitacionesMatrimoniales;
import datos.DALClientesHabituales;
import entidades.HabitacionDoble;
import entidades.HabitacionMatrimonial;
import entidades.HabitacionSimple;
import java.util.ArrayList;

public class BLHabitaciones {
    
    public static String crearHabitacionSimple(String codigo, double precioPorNoche) {
        String mensaje = null;
        HabitacionSimple habitacion;
        boolean ocupada = false;
        if (codigo.length() <= 5) {
            habitacion = new HabitacionSimple(codigo, precioPorNoche, ocupada);
            mensaje = DALClientesHabituales.escribirClienteHabitual(habitacion);
        } else
            mensaje = "Número de caracteres no válido";
        return mensaje;
    }
    
    public static String crearHabitacionDoble(String codigo, double precioPorNoche) {
        String mensaje = null;
        HabitacionDoble habitacion;
        boolean ocupada = false;
        if (codigo.length() <= 5) {
            habitacion = new HabitacionDoble(codigo, precioPorNoche, ocupada);
            mensaje = DALHabitacionesDobles.escribirHabitacionDoble(habitacion);
        } else
            mensaje = "Número de caracteres no válido";
        return mensaje;
    }
    
    public static String crearHabitacionMatrimonial(String codigo, double precioPorNoche) {
        String mensaje = null;
        HabitacionMatrimonial habitacion;
        boolean ocupada = false;
        if (codigo.length() <= 5) {
            habitacion = new HabitacionMatrimonial(codigo, precioPorNoche, ocupada);
            mensaje = DALHabitacionesMatrimoniales.escribirHabitacionMatrimonial(habitacion);
        } else
            mensaje = "Número de caracteres no válido";
        return mensaje;
    }
    
    public static ArrayList<HabitacionSimple> getHabitacionesSimples() {
        if (DALClientesHabituales.getNumeroHabitacionesSimples() != 0)
            return DALClientesHabituales.getHabitacionesSimples();
        return null;
    }
    
    public static ArrayList<HabitacionDoble> getHabitacionesDobles() {
        if (DALHabitacionesDobles.getNumeroHabitacionesDobles() != 0)
            return DALHabitacionesDobles.getHabitacionesDobles();
        return null;
    }
    
    public static ArrayList<HabitacionMatrimonial> getHabitacionesMatrimoniales() {
        if (DALHabitacionesMatrimoniales.getNumeroHabitacionesMatrimoniales() != 0)
            return DALHabitacionesMatrimoniales.getHabitacionesMatrimoniales();
        return null;
    }
    
    public static String updatePrecioHBSimple(double precioPorNoche) {
        if (precioPorNoche > 0)
            return DALClientesHabituales.actualizarPrecio(precioPorNoche);
        return "Precio negativo o igual a 0";
    }
    
    public static String updatePrecioHBDoble(double precioPorNoche) {
        if (precioPorNoche > 0)
            return DALHabitacionesDobles.actualizarPrecio(precioPorNoche);
        return "Precio negativo o igual a 0";
    }
    
    public static String updatePrecioHBMatrimonial(double precioPorNoche) {
        if (precioPorNoche > 0)
            return DALHabitacionesMatrimoniales.actualizarPrecio(precioPorNoche);
        return "Precio negativo o igual a 0";
    }
    
    public static double getPrecioHBSimple() {
        double precio = -1;
        for (HabitacionSimple habitacion : getHabitacionesSimples()) {
            precio = habitacion.getPrecioPorNoche();
            break;
        }
        return precio;
    }
    
    public static double getPrecioHBDoble() {
        double precio = -1;
        for (HabitacionDoble habitacion : getHabitacionesDobles()) {
            precio = habitacion.getPrecioPorNoche();
            break;
        }
        return precio;
    }
    
    public static double getPrecioHBMatrimonial() {
        double precio = -1;
        for (HabitacionMatrimonial habitacion : getHabitacionesMatrimoniales()) {
            precio = habitacion.getPrecioPorNoche();
            break;
        }
        return precio;
    }
    
}
