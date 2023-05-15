package entidades;

public class ClienteHabitual extends Cliente {

    private String codigoCliente;               // 10 caracteres    11 bytes
    private static float porcentajeDescuento;   //                  4 bytes
    
    public ClienteHabitual() {
    }

    public ClienteHabitual(String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public static float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public static void setPorcentajeDescuento(float porcentajeDescuento) {
        ClienteHabitual.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public String toString() {
        return "ClienteHabitual{" 
                + "dni=" + dni 
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos + '}';
    }
    
}
