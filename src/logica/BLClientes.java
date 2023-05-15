package logica;

import entidades.ClienteHabitual;

public class BLClientes {
    
    public static String actualizarPorcentajeDescuento(float porcentajeDescuento) {
        if (porcentajeDescuento > 0 && porcentajeDescuento <= 1) {
            ClienteHabitual.setPorcentajeDescuento(porcentajeDescuento);
            return "ok";
        }
        return "El porcentaje está fuera del intervalo entre 0 y 1";
    }
    
    public static float getPorcentajeDescuento() {
        return ClienteHabitual.getPorcentajeDescuento();
    }
    
}
