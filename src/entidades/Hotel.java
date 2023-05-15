package entidades;

import java.util.ArrayList;
import java.util.Dictionary;

public class Hotel {
    
    private String nombre;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Dictionary<Integer, ClienteHabitual> clientesHabituales;
    
    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + '}';
    }
    
}
