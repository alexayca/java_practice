/* * * * * * 
 * Retomado del video 76, archivo PruebaAcciones
 * 
 * */
package curso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


import java.awt.Color;
import java.awt.event.ActionEvent;


public class Bara_Herramientas {

	public static void main(String[] args) {
		
		Marco_Barra frame = new Marco_Barra();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}



class Marco_Barra extends JFrame{
	
	private JPanel panel;
	
	public Marco_Barra() {
		setTitle("Marco con barra");
		setBounds(500,300,600,450);
		panel = new JPanel();
		add(panel);
		
		// Configuracion de acciones
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/curso/ico/yellow.png"), Color.YELLOW );
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/curso/ico/blue.png"), Color.BLUE );
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/curso/ico/red.png"), Color.RED );
        
			// Al implementar directamente la clase AbstractAction se requiere se implementen los metodos de la clase abstracta
        Action accionSalir =new AbstractAction("Salir", new ImageIcon("src/curso/ico/power_off.png")) {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
        };
        
        
        // Construccion del menu
        JMenu menu = new JMenu("Color JMenu");
        menu.add(accionAzul);
        menu.add(accionRojo);
        menu.add(accionAmarillo);
        
        JMenuBar barra_menus =new JMenuBar();
        barra_menus.add(menu);
        setJMenuBar(barra_menus);
        
        // Construccion de la barra de herramientas
        JToolBar barra_herramientas = new JToolBar();
		barra_herramientas.setFloatable(true);
		barra_herramientas.setName("JToolBar");
        barra_herramientas.add(accionAzul);
        barra_herramientas.add(accionRojo);
        barra_herramientas.add(accionAmarillo);
        
        barra_herramientas.addSeparator();
        barra_herramientas.add(accionSalir);
        
        add(barra_herramientas, BorderLayout.NORTH);	// Permite generar una barra de herramientas recolocable al norte, sur
        
        
	}
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia el color de la lamina "+nombre);
            putValue("color_de_fondo", colorBoton);		// clave: valor
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("color_de_fondo");
			panel.setBackground(color);
			
		}
		
	}
	
}
