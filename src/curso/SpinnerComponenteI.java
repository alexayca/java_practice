import javax.swing.*;
import java.awt.*;

public class SpinnerComponenteI {
    public static void main(String[] args) {
        MarcoSpinnerI sliderFrame = new MarcoSpinnerI();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSpinnerI extends JFrame{
    public MarcoSpinnerI() {
        setBounds(400,300,550,400);
        add(new PanelSpinnerI());
        setVisible(true);
    }
}

class PanelSpinnerI extends JPanel{

    public PanelSpinnerI() {
        JSpinner controlDateSpinner = new JSpinner(new SpinnerDateModel());
        // SpinnerModel permite representar otro tipo de valores;
        // por defecto, sin parametros en el constructor son enteros
        // como arrays, listas o fechas o valores de texto
        controlDateSpinner.setPreferredSize(new Dimension(100,20));
        add(controlDateSpinner);

        String [] listaFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner controlListSpinner = new JSpinner(new SpinnerListModel(listaFuentes));
        controlListSpinner.setPreferredSize(new Dimension(200,20)); // Establecemos un JSpinner mas ancho
        add(controlListSpinner);

        JSpinner controlNumerico = new JSpinner(new SpinnerNumberModel(5,0,10,1));
        controlNumerico.setPreferredSize(new Dimension(40,20));
        add(controlNumerico);

    }

}