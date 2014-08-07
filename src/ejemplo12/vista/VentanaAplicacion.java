package ejemplo12.vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaAplicacion extends JFrame{
    public VentanaAplicacion(String titulo){
        super(titulo);
        ajustarComponentes(getContentPane());
        setSize(new Dimension(640,480));
        setResizable(true);
        setLocationByPlatform(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
    
    private void ajustarComponentes(Container c){
       //1. Ajusta el administrador de disposicion(Layout manager)
        c.setLayout(new GridLayout(3,3,16,16));
        
        //2. Coloca los componentes en el contenedor
        c.add(new JButton("Boton 1"));
        c.add(new JButton("Boton 2"));
        c.add(new JButton("Boton 3"));
        c.add(new JButton("Boton 4"));
        c.add(new JButton("Boton 5"));
        c.add(new JButton("Boton 6"));
        c.add(new JButton("Boton 7"));
        c.add(new JButton("Boton 8"));
        
    }
    
    
    
    
    public void init(){
        setVisible(true);
        
        System.out.println("Ventana inicializada..");
    }
    
}
