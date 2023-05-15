package entidades;

public class ClienteEsporadico extends Cliente {

    public ClienteEsporadico() {
    }

    public ClienteEsporadico(String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
    }
    
    @Override
    public String toString() {
        return "ClienteEsporadico{" 
                + "dni=" + dni 
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos + '}';
    }
    
}
