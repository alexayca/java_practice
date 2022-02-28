package VentanaDialogos;

import javax.swing.*;
import java.awt.*;

public class Frame_Ventanas_Dialogos extends JFrame {

    private Panel_Buttons laminaTipo, laminaTipoMensaje, laminaMensaje,
                            laminaConfirmar, laminaOpcion, laminaEntrada;

    public Frame_Ventanas_Dialogos() throws HeadlessException {

        setTitle("Ejercicio de ventanas de dialogos");
        setBounds(500,300,650,400);

        JPanel panelSuperiorCuadricular = new JPanel();
        panelSuperiorCuadricular.setLayout(new GridLayout(2,3));

        String primerGrupoBox[]={"Mensaje", "Confirmar", "Opcion", "Entrada"};
        laminaTipo = new Panel_Buttons("Tipo", primerGrupoBox);

        laminaTipoMensaje = new Panel_Buttons("Tipo de Mensaje", new String[]{
                "ERROR_MESSAGE","INFORMATION_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"
        });

        laminaMensaje = new Panel_Buttons("Mensaje", new String[]{
                "Cadena","Icono","Componente","Otros","Object[]"
        });

        laminaConfirmar = new Panel_Buttons("", new String[]{
                "DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"
        });

        laminaOpcion = new Panel_Buttons("", new String[]{
                "String[]","Icon[]","Object[]"
        });

        laminaEntrada = new Panel_Buttons("", new String[]{
                "Campo de texto","Combo"
        });

        setLayout(new BorderLayout());

        panelSuperiorCuadricular.add(laminaTipo);
        panelSuperiorCuadricular.add(laminaTipoMensaje);
        panelSuperiorCuadricular.add(laminaMensaje);
        panelSuperiorCuadricular.add(laminaConfirmar);
        panelSuperiorCuadricular.add(laminaOpcion);
        panelSuperiorCuadricular.add(laminaEntrada);

        JPanel laminaBotonMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        laminaBotonMostrar.add(botonMostrar);

        add(panelSuperiorCuadricular, BorderLayout.CENTER);
        add(laminaBotonMostrar,BorderLayout.SOUTH);


    }
}
