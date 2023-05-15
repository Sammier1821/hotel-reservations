package entidades;

public abstract class Cliente {
    
    protected String dni;           // 8 caracteres     9 bytes
    protected String nombre;        // 25 caracteres    26 bytes
    protected String apellidos;     // 25 caracteres    26 bytes

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
