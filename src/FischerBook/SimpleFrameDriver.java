package FischerBook.Its;

public class SimpleFrameDriver {
    public static void main(String[] args) {
        SimpleFrame sFrame1 = new SimpleFrame();
        SimpleFrame sFrame2 = new SimpleFrame();

        sFrame1.showIt("Simple Frame 1");
        sFrame2.showIt("Simple Frame 2",300,300);
    }
}
