package entidades;

public class HabitacionMatrimonial extends Habitacion {

    public static final String NOMBRE = "Habitacion Matrimonial";

    public HabitacionMatrimonial() {
    }

    public HabitacionMatrimonial(String codigo, double precioPorNoche, boolean ocupada) {
        super(codigo, precioPorNoche, ocupada);
    }

    @Override
    public int getTamaño() {
        return (codigo.length() + NOMBRE.length() * 2) + 4 + 1;
    }

    @Override
    public String toString() {
        return "HabitacionMatrimonial{"
                + "codigo=" + codigo
                + ", precio=" + precioPorNoche + '}';
    }

}
