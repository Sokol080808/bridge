import java.awt.*;

public class Fastener {
    int x;
    int y;
    int R; // мах реакция
    public void paint(Graphics g) {
        g.drawOval(x, y, 20, 20);
    }
    Fastener(int x, int y, int R) {
        this.R = R;
        this.x = x;
        this.y = y;
    }

}