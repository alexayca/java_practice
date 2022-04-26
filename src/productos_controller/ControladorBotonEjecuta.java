package productos_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import productos_model.*;
import productos_view.*;

public class ControladorBotonEjecuta implements ActionListener {

    private MarcoAplicacion elmarco;
    EjecutaConsultas obj=new EjecutaConsultas();

    public ControladorBotonEjecuta(MarcoAplicacion elmarco){
        this.elmarco=elmarco;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String seleccionSeccion=(String) elmarco.secciones.getSelectedItem();
        String seleccionPaises=(String) elmarco.paises.getSelectedItem();
        elmarco.resultado.append(obj.filtraBBDD(seleccionSeccion,seleccionPaises)); // return pruebas
        elmarco.resultado.append("\n");
    }
}
