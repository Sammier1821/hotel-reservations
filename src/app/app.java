package app;

import entidades.Hotel;
import presentacion.FrmLogin;

public class app {
    
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("HOTEL CIELO");
        new FrmLogin().setVisible(true);
        
    }
    
}
