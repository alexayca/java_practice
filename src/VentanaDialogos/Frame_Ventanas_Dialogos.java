package VentanaDialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Frame_Ventanas_Dialogos extends JFrame {

    private Panel_Buttons laminaTipo, laminaTipoMensaje, laminaMensaje,
                            laminaConfirmar, laminaOpcion, laminaEntrada;
    private String cadenaMensaje="Mensaje";
    private Icon iconoMensaje = new ImageIcon("src/img/blue.png");
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new LaminaEjemplo();


    public Frame_Ventanas_Dialogos() throws HeadlessException {

        setTitle("Ejercicio de ventanas de dialogos");
        setBounds(500,300,650,400);

        JPanel panelSuperiorCuadricular = new JPanel();
        panelSuperiorCuadricular.setLayout(new GridLayout(2,3));

        String primerGrupoBox[]={"Mensaje", "Confirmar", "Opcion", "Entrada"};
        laminaTipo = new Panel_Buttons("Tipo", primerGrupoBox);

        laminaTipoMensaje = new Panel_Buttons("Tipo de Mensaje", new String[]{
                "ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"
        });

        laminaMensaje = new Panel_Buttons("Mensaje", new String[]{
                "Cadena","Icono","Componente","Otros","Object[]"
        });

        laminaConfirmar = new Panel_Buttons("Confirmar", new String[]{
                "DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"
        });

        laminaOpcion = new Panel_Buttons("Opcion", new String[]{
                "String[]","Icon[]","Object []"
        });

        laminaEntrada = new Panel_Buttons("Entrada", new String[]{
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

        botonMostrar.addActionListener(new AccionMostrar());

        add(panelSuperiorCuadricular, BorderLayout.CENTER);
        add(laminaBotonMostrar,BorderLayout.SOUTH);


    }

    // -------------------------proporciona el mensaje----------------------------------
    public Object dameMensaje(){
        String s = laminaMensaje.dameSeleccion();
        if (s.equals("Cadena")){
            return cadenaMensaje;
        } else if(s.equals("Icono")){
            return iconoMensaje;
        }else if(s.equals("Componente")){
            return componenteMensaje;
        }else if(s.equals("Otros")){
            return objetoMensaje;
        }else if(s.equals("Object[]")){
            return new Object[]{
                    cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objetoMensaje
            };
        }else {
            return null;
        }
    }

    // -------------------------devuelve tipo de icono y numero de botones en confirmar----------------------------------
    public int dameTipo(Panel_Buttons lamina){
        String s = lamina.dameSeleccion();
        if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
            return 0;
        }else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
            return 1;
        }else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")){
            return 2;
        }else if(s.equals("QUESTION_MESSAGE")){
            return 3;
        }else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")){
            return -1;
        }else
            return 0;
    }


    // -------------------------clase interna que gestiona los eventos----------------------------------
    private class AccionMostrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(laminaTipo.dameSeleccion());
            if (laminaTipo.dameSeleccion().equals("Mensaje")){
                JOptionPane.showMessageDialog(Frame_Ventanas_Dialogos.this,dameMensaje(),"Titulo", dameTipo(laminaTipoMensaje));
            }else if (laminaTipo.dameSeleccion().equals("Confirmar")){
                JOptionPane.showConfirmDialog(Frame_Ventanas_Dialogos.this,dameMensaje(),"Titulo",dameTipo(laminaConfirmar), dameTipo(laminaTipoMensaje));
            }else if(laminaTipo.dameSeleccion().equals("Opcion")){
                JOptionPane.showOptionDialog(Frame_Ventanas_Dialogos.this, dameMensaje(),"Titulo",0, dameTipo(laminaTipoMensaje),null,null,null);
            }else if (laminaTipo.dameSeleccion().equals("Entrada")){
                JOptionPane.showInputDialog(Frame_Ventanas_Dialogos.this,dameMensaje(),"Titulo", dameTipo(laminaTipoMensaje));
            }
        }
    }   // END private class
}
