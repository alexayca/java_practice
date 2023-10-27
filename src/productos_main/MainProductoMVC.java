package productos_main;

//import productos_model.*;
import productos_view.MarcoAplicacion;
//import productos_controller.*;

import javax.swing.*;

public class MainProductoMVC {

    public static void main(String[] args) {

        MarcoAplicacion myFrameMVC = new MarcoAplicacion();
        myFrameMVC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrameMVC.setVisible(true); // al final para que se visualice
    }
}
