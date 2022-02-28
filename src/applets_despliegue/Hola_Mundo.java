package applets_despliegue;

import javax.swing.*;

public class Hola_Mundo extends JApplet {

    public void init(){
        JLabel rotulo = new JLabel("Hola alumnos", SwingConstants.CENTER);
        add(rotulo);
    }
}
