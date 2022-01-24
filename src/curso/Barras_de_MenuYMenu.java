/* ** ** **
 * Iconos descargados de:
 * https://www.flaticon.es/iconos-gratis/
 * * */
import javax.swing.*;
import java.awt.*;

public class Barras_de_MenuYMenu {
    public static void main(String[] args) {
        MenuFrame miFrame = new MenuFrame();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuFrame extends JFrame{
    public MenuFrame() throws HeadlessException {
        setBounds(550,300,850,350);
        add(new MenuPanel());
        setVisible(true);
    }
}

class MenuPanel extends JPanel{


    public MenuPanel() {

        JMenuBar barraMenuPrincipal = new JMenuBar();   // Soporte de la barra de menu

        // Creamos las opciones que mostrara la barra de menu
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        // Los submenus son JMenu para agregar Items
        JMenu subToolsOpciones = new JMenu("Opciones");

        // Agregamos los elementos que estan contenidos en cada opcion del menu
        JMenuItem guardar =new JMenuItem("Guardar");
        JMenuItem guardarComo =new JMenuItem("Guardar como ...");
        JMenuItem cortar =new JMenuItem("Cortar", new ImageIcon("src/curso/ico/cortar.png"));
        JMenuItem copiar =new JMenuItem("Copiar", new ImageIcon("src/curso/ico/copiar.png"));
        JMenuItem pegar =new JMenuItem("Pegar", new ImageIcon("src/curso/ico/pegar.png"));
        cortar.setHorizontalTextPosition(SwingConstants.LEFT);
        copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        pegar.setHorizontalTextPosition(SwingConstants.LEFT);
        //
        JMenuItem generales =new JMenuItem("Generales");
        JMenuItem opIt1 =new JMenuItem("Opcion 1");
        JMenuItem opIt2 =new JMenuItem("Opcion 2");

        // Se agrega cada item a cada opcion de la barra menu, observe que aqui afecta las posicion
        archivo.add(guardar);
        archivo.add(guardarComo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        herramientas.add(generales);
        herramientas.addSeparator();     // Agrega una separacion, observe a que submenu se agrega
        herramientas.add(subToolsOpciones);
        subToolsOpciones.add(opIt1);
        subToolsOpciones.add(opIt2);

        // Se agregan los elementos a la barra
        barraMenuPrincipal.add(archivo);
        barraMenuPrincipal.add(edicion);
        barraMenuPrincipal.add(herramientas);

        add(barraMenuPrincipal);

    }


}
