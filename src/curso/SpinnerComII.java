import javax.swing.*;
import java.awt.*;

public class SpinnerComII {
    public static void main(String[] args) {
        FrameSpinnerII sliderFrame = new FrameSpinnerII();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class FrameSpinnerII extends JFrame{
    public FrameSpinnerII() {
        setBounds(400,300,550,400);
        add(new PanelSpinnerII());
        setVisible(true);
    }
}

class PanelSpinnerII extends JPanel{

    public PanelSpinnerII() {

        // Las clases internas anonimas crean la clase entera dentro de los argumentos del constructor,
        // se suelen utilizar con componentes swing. Y obviamente no tiene nombre
        JSpinner controlNumerico = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            @Override
            public Object getNextValue() {
                // Se invoca el metodo original de la clase padre SpinnerNumberModel,
                // considere que se sobreescribe en esta clase
                return super.getPreviousValue();
            }
            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });  // Se instancia el nuevo modelo con la clase interna
        controlNumerico.setPreferredSize(new Dimension(40,20));
        add(controlNumerico);

    }

    // Creamos un modelo para el comportamiento de moverse con las flechas arriba y abajo de forma inversa
    // al comportamiento por default
/*    private class MiModeloJSpinnerNumber extends SpinnerNumberModel{

        public MiModeloJSpinnerNumber() {
            super(5,0,10,1);
        }

        @Override
        public Object getNextValue() {
            // Se invoca el metodo original de la clase padre SpinnerNumberModel,
            // considere que se sobreescribe en esta clase
            return super.getPreviousValue();
        }

        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
    }
*/
}