
package ejemplo12;

import ejemplo12.vista.VentanaAplicacion;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo12 {
    
    public static void main(String[] args) {
        
        //1. Ajusta el aspecto general de la aplicacion
       try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           JFrame.setDefaultLookAndFeelDecorated(true);           
       }
       catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
           System.err.println(e.getMessage());
       }
        SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {
               iniciarInterfaz();
           }
       });
        
        System.out.println("Programa finalizado..");
    }

    private static void iniciarInterfaz() {
        VentanaAplicacion ventanaPrincipal = new VentanaAplicacion("Ejemplo 12");
        ventanaPrincipal.init();
    }
    
}
