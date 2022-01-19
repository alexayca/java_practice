import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderComponenteII {
    public static void main(String[] args) {
        MarcoSliderII sliderFrame = new MarcoSliderII();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSliderII extends JFrame{
    public MarcoSliderII() {
        setBounds(400,300,550,400);
        PanelSliderII miPanelSlider = new PanelSliderII();
        add(miPanelSlider);
        setVisible(true);
    }
}

class PanelSliderII extends JPanel{

    private JLabel rotulo;
    private JSlider control;

    public PanelSliderII() {

        setLayout(new BorderLayout());
        rotulo = new JLabel("Mi madre me llevo al aeropuerto con las ventanillas del coche abiertas.");
        add(rotulo, BorderLayout.CENTER);

        control = new JSlider(8,50,12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));

        control.addChangeListener(new manejaSizeLetra());

        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }

    class manejaSizeLetra implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e) {
            //System.out.println("Estas moviendo el deslizador: " +control.getValue());
            rotulo.setFont(new Font("Serif", Font.ITALIC, control.getValue()));
        }
    }

}