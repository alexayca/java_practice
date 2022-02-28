import javax.swing.*;
import java.awt.*;

public class Frame_Ventanas_Dialogos extends JFrame {
    public Frame_Ventanas_Dialogos() throws HeadlessException {
        setTitle("Ejercicio de ventanas de dialogos");
        setBounds(500,300,650,400);

        JPanel panelSuperiorCuadricular = new JPanel();
        panelSuperiorCuadricular.setLayout(new GridLayout(2,3));

    }
}
