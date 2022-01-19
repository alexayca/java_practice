import javax.swing.*;
import java.awt.*;

public class SliderComponente {
    public static void main(String[] args) {
        MarcoSlider sliderFrame = new MarcoSlider();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSlider extends JFrame{
    public MarcoSlider() {
        setBounds(400,300,550,400);
        PanelSlider miPanelSlider = new PanelSlider();
        add(miPanelSlider);
        setVisible(true);
    }
}

class PanelSlider extends JPanel{
    public PanelSlider() {

        JSlider control = new JSlider(0,100,25);
        control.setOrientation(SwingConstants.HORIZONTAL);
        control.setMajorTickSpacing(45);
        control.setMinorTickSpacing(15);
        control.setPaintTicks(true);
        control.setFont(new Font("Comic Sans MS", Font.ITALIC,10));
        control.setPaintLabels(true);
        control.setSnapToTicks(true);   // Las marcas funcionan a modo de iman, las aproxima
        add(control);
    }
}