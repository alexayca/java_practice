package GUI;

import javax.swing.*;
import java.awt.*;

// JFrame : el marco lo podemos considerar como la mesa de trabajo de un dibujante (donde apoyarse)
// JPanel : a este marco se le agragan paneles o laminas (capas transparentes)
public class Marco extends JFrame {

    // constructor
    public Marco(){
        Toolkit myComputer = Toolkit.getDefaultToolkit();

        Dimension screenSize = myComputer.getScreenSize();
        int heightScreen = screenSize.height;   // Obtenemos el campo de clase height
        int widthScreen = screenSize.width;

        Image myIco = myComputer.getImage("src/GUI/images/favicons.png");
        setIconImage(myIco);

        setSize(widthScreen/2,heightScreen/2);
        setLocation(widthScreen/4,heightScreen/4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        // Como es un solo marco
        setVisible(true);
        setTitle("GUI.Marco centrado con Icono y figuras de colores");

        // Se agrega el Panel al Frame
        //GUI.Lamina myPanel = new GUI.Lamina();
        //add(myPanel);
        //myPanel.setBackground(SystemColor.window);
        //myPanel.setForeground(new Color(115,21,85));      // Todo lo que se dibuje en la lamina sin especificar color tomara este color

        LaminaImagen panelConImagen = new LaminaImagen();
        add(panelConImagen);
        panelConImagen.setBackground(Color.black);

    }

}
