import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;

public class MyFrame extends JFrame implements MouseListener{

    public MyFrame() throws IOException {
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this);
    }
    Button b = new Button(100, 100, 10, 10);
    Asphalt asphalt = new Asphalt(0,0,0,0, 0);
    Fastener fastener1 = new Fastener(100, 100, 100);
    @Override
    public void paint(Graphics g) {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(2);
            bufferStrategy = getBufferStrategy();
        }
        g = bufferStrategy.getDrawGraphics();
        fastener1.paint(g);
        asphalt.paint(g);
        g.dispose();
        bufferStrategy.show();
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        asphalt.x1 = e.getX();
        asphalt.x1 = asphalt.x1 / 21 * 21 + 11;
        asphalt.y1 = e.getY();
        asphalt.y1 = asphalt.y1 / 21 * 21 + 11;
        asphalt.a = 0;
        b.onMouseHit(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        asphalt.x2 = e.getX();
        asphalt.x2 = asphalt.x2 / 21 * 21 + 11;
        asphalt.y2 = e.getY();
        asphalt.y2 = asphalt.y2 / 21 * 21 + 11;
        asphalt.a = 1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}