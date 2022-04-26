package productos_controller;

import productos_model.CargaMenus;
import productos_view.MarcoAplicacion;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;   // implements

public class ControladorCargaMenus extends WindowAdapter {

    CargaMenus obj=new CargaMenus();
    private MarcoAplicacion elMarco;

    public ControladorCargaMenus(MarcoAplicacion elMarco) {
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
            while (obj.rsPaises.next()){
                elMarco.paises.addItem(obj.rsPaises.getString(1));
            }

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
