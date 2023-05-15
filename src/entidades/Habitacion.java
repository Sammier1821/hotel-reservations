package entidades;

public abstract class Habitacion {
    
    protected String codigo;            // A01 B01 5 caracteres     10 bytes
    protected double precioPorNoche;    //                          4 bytes
    protected boolean ocupada;          //                          1 bytes
                                        // subclase.nombre          50 bytes

    public Habitacion() {
    }

    public Habitacion(String codigo, double precioPorNoche, boolean ocupada) {
        this.codigo = codigo;
        this.precioPorNoche = precioPorNoche;
        this.ocupada = ocupada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean isOcupada) {
        this.ocupada = isOcupada;
    }
    
    public int getTamaño() {
        return 0;
    }
    
}
