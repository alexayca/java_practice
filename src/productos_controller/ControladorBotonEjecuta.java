package productos_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import productos_model.*;
import productos_view.*;

public class ControladorBotonEjecuta implements ActionListener {

    private MarcoAplicacion elmarco;
    EjecutaConsultas obj=new EjecutaConsultas();
    private ResultSet resultadoConsulta;

    public ControladorBotonEjecuta(MarcoAplicacion elmarco){
        this.elmarco=elmarco;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String seleccionSeccion=(String) elmarco.secciones.getSelectedItem();
        String seleccionPaises=(String) elmarco.paises.getSelectedItem();
        //elmarco.resultado.append(obj.filtraBBDD(seleccionSeccion,seleccionPaises)); // return pruebas
        //elmarco.resultado.append("\n");
        resultadoConsulta=obj.filtraBBDD(seleccionSeccion,seleccionPaises);
        try {
            elmarco.resultado.setText("");  // deja en blanco el cuadro de texto, con cada nueva consulta
            while (resultadoConsulta.next()){
                elmarco.resultado.append(resultadoConsulta.getString(1));
                elmarco.resultado.append(" - ");
                elmarco.resultado.append(resultadoConsulta.getString(2));
                elmarco.resultado.append(" - ");
                elmarco.resultado.append(resultadoConsulta.getString(3));
                elmarco.resultado.append(" - ");
                elmarco.resultado.append(resultadoConsulta.getString(4));
                elmarco.resultado.append("\n");
            }
        }catch (Exception exception){

        }

    }
}
