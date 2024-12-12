
package co.edu.udec.s2.EjercicioFestival;

import co.edu.udec.s2.EjercicioFestival.Vistas.GUI.RegistroPrincipal;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegistroPrincipal registro = new RegistroPrincipal();
        
        registro.setExtendedState(RegistroPrincipal.MAXIMIZED_BOTH);
        
        registro.setVisible(true);
        
    }
    
}
