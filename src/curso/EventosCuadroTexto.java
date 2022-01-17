import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class EventosCuadroTexto {
    public static void main(String[] args) {
        Marco myFrame = new Marco();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame{
    public Marco() throws HeadlessException {
        setBounds(500,300,500,350);
        Lamina myPanel = new Lamina();

        add(myPanel);
        setVisible(true);
    }
}

class Lamina extends JPanel{
    public Lamina() {
        JTextField miCampoTexto = new JTextField(22);
        Document miDocumento = miCampoTexto.getDocument();  // Almacenamos el texto del campo en el objeto myDocument
        miDocumento.addDocumentListener(new EscuchaTexto());// Colocamos el documento a la escucha
        add(miCampoTexto);
    }


    // Clase interna receptora de eventos
    private class EscuchaTexto implements DocumentListener{
        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Haz insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}
