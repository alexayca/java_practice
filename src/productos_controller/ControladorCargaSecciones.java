package productos_controller;

import productos_model.CargaSecciones;
import productos_view.MarcoAplicacion;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;   // implements

public class ControladorCargaSecciones extends WindowAdapter {

    CargaSecciones obj=new CargaSecciones();
    private MarcoAplicacion elMarco;

    public ControladorCargaSecciones(MarcoAplicacion elMarco) {
        this.elMarco=elMarco;
    }

    @Override
    public void windowOpened(WindowEvent event) {
        //super.windowOpened(event);
        obj.ejecutaConsultas();

        try {
            while (obj.rs.next()){
                elMarco.secciones.addItem(obj.rs.getString(1));
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
