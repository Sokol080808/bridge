import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        MyFrame frame = new MyFrame();
        while (true) {
            frame.repaint();
            Thread.sleep(10);
        }
    }
}