package entidades;

public class HabitacionDoble extends Habitacion {

    public static final String NOMBRE = "Habitacion Doble";

    public HabitacionDoble() {
    }

    public HabitacionDoble(String codigo, double precioPorNoche, boolean ocupada) {
        super(codigo, precioPorNoche, ocupada);
    }

    @Override
    public int getTamaño() {
        return (codigo.length() + NOMBRE.length() * 2) + 4 + 1;
    }

    @Override
    public String toString() {
        return "HabitacionDoble{"
                + "codigo=" + codigo
                + ", precio=" + precioPorNoche + '}';
    }

}
