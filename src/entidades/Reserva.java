package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    
    private Cliente cliente;
    private ArrayList<Habitacion> habitaciones;
    private LocalDate fechaEntrada;
    private int numeroDiasReservados;

    public Reserva() {
    }

    public Reserva(Cliente cliente, ArrayList<Habitacion> habitaciones, LocalDate fechaEntrada, int numeroDiasReservados) {
        this.cliente = cliente;
        this.habitaciones = habitaciones;
        this.fechaEntrada = fechaEntrada;
        this.numeroDiasReservados = numeroDiasReservados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroDiasReservados() {
        return numeroDiasReservados;
    }

    public void setNumeroDiasReservados(int numeroDiasReservados) {
        this.numeroDiasReservados = numeroDiasReservados;
    }
    
}
