package entidades;

public class HabitacionSimple extends Habitacion {

    public static final String NOMBRE = "Habitacion Simple";

    public HabitacionSimple() {
    }

    public HabitacionSimple(String codigo, double precioPorNoche, boolean ocupada) {
        super(codigo, precioPorNoche, ocupada);
    }

    @Override
    public int getTamaño() {
        return (codigo.length() + NOMBRE.length() * 2) + 4 + 1;
    }

    @Override
    public String toString() {
        return "HabitacionSimple{"
                + "codigo=" + codigo
                + ", precio=" + precioPorNoche + '}';
    }

}
