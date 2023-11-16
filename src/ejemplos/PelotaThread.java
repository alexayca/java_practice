package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class PelotaThread {

    public static void main(String[] args){
        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

/** clase que implementa la interfaz runnable (1) */
class PelotaHilos implements Runnable{
    private Pelota pelotas;
    private Component componenteLamina;

    public PelotaHilos(Pelota pelota, Component componenteLamina){
        /* al asignar estos atributos a la clase es posible utilizarlos en el metodo run() */
        this.pelotas = pelota;
        this.componenteLamina = componenteLamina;
    }

    /** Codigo correspondiente a la tarea que deseamos sea simultanea
     * en este caso la aparicion de la pelota varias veces
     * hay que retomar los atributos "pelotas" y "componenteLamina" correspondiente a esta clase
     * */
    @Override
    public void run() {
        for (int i = 1; i < 3000; i++) {
            pelotas.mueve_pelota(componenteLamina.getBounds());
            componenteLamina.paint(componenteLamina.getGraphics());
            // pausa en la ejecucion de un hilo
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/** Movimiento de la pelota */
class Pelota{
    // Mueve la pelota invirtiendo posicion si choca con limites
    public void mueve_pelota(Rectangle2D limites){
        // coordenadas
        x+=dx;
        y+=dy;

        if (x<limites.getMinX()){
            x=limites.getMinX();
            dx=-dx;
        }

        if (x+TAMX>=limites.getMaxX()){
            x=limites.getMaxX() - TAMX;
            dx=-dx;
        }
        if (y<limites.getMinY()){
            y=limites.getMinY();
            dy=-dy;
        }
        if (y+TAMY>=limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy = -dy;
        }
    }

    // Forma de la pelota en su posicion inicial
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,TAMX,TAMY);
    }

    private static final int TAMX=15;
    private static final int TAMY=15;
    private double x=0;
    private double y=0;
    private  double dx=1;
    private double dy=1;

}

// Lamina que dibuja las pelotas
class LaminaPelota extends JPanel{
    // añadimos pelota a la lamina
    public void add(Pelota b){
        pelotas.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota b: pelotas){
            g2.fill(b.getShape());
        }
    }
    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

}

/** Marco con lámina y botones */
class MarcoRebote extends JFrame{
    public MarcoRebote(){
        setBounds(600,300,400,350);
        setTitle("Rebotes");
        lamina=new LaminaPelota();
        add(lamina,BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Empezar!", new ActionListener(){
            public void actionPerformed(ActionEvent event){
                comienza_el_juego();
            }
        });

        ponerBoton(laminaBotones,"Salir", new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        add(laminaBotones, BorderLayout.SOUTH);
    }

    // Ponemos botones
    public void ponerBoton(Container c,String titulo, ActionListener oyente){
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    // Añade pelota y la bota miles de veces
    public void comienza_el_juego(){
        Pelota pelota = new Pelota();
        lamina.add(pelota);

        // 2 Codigo implementado para el metodo run()
        // De otra forma es un programa monohilo
/*        
        for (int i = 1; i < 3000; i++) {
            pelota.mueve_pelota(lamina.getBounds());
            lamina.paint(lamina.getGraphics());
            // pausa en la ejecucion de un hilo
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 */

        // 3 creamos una instancia de la clase que implementa la interfaz runnable
        Runnable runnable = new PelotaHilos(pelota, lamina);

        // 4    Thread(Runnable target)
        Thread thread = new Thread(runnable);
        thread.start(); // indicamos al hilo de ejecucion que comience
    }

    private LaminaPelota lamina;
}

