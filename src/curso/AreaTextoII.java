/* * * *
 * El ejemplo presenta una practica poco recomendada
 * sobre escribir el codigo en una sola clase
 *
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaTextoII {
    public static void main(String[] args) {
        FrameAreaText mainFrame = new FrameAreaText();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}


class FrameAreaText extends JFrame{

    private JPanel laminaBotones;
    private JButton botonInsertar, botonSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;

    public FrameAreaText(){
        String textoSaltar = "Salto de linea";
        setTitle("Probando Area de Texto");
        setBounds(500,300,500,350);

        setLayout(new BorderLayout());

        laminaBotones = new JPanel();

        botonInsertar = new JButton("Insertar");
        // El boton esta a la escucha del evento clic, observe como se instancio la interface en conjunto con su metodo
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme");
            }
        });
        laminaBotones.add(botonInsertar);

        botonSaltoLinea=new JButton(textoSaltar);
        botonSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar =! areaTexto.getLineWrap();
                // Establecemos un salto de linea o lo quitamos
                areaTexto.setLineWrap(saltar);
                /*if (saltar==true){
                    botonSaltoLinea.setText("Quitar salto");
                }else{
                    botonSaltoLinea.setText(textoSaltar);
                }*/
                /* Operador ternario en sustitucion de IF [condicion a evaluar] [? finaliza la prueba logica][separador de true:false]*/
                botonSaltoLinea.setText(saltar ?  "Quitar salto" : textoSaltar);

            }
        });
        laminaBotones.add(botonSaltoLinea);

        add(laminaBotones, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8,20);
        laminaConBarras=new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);


    }


}

