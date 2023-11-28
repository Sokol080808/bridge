import java.awt.*;

public class Asphalt {
    int x1; // начало х
    int y1; // начало у
    int x2; // конец х
    int y2; // конец у
    int p; // линейная плотость
    int g = 10; // уск св падения
    int a;
    int b;
    Asphalt(int x1, int x2, int y1, int y2, int a) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.a = a;
        this.b = b;
    }
    public void paint(Graphics g) {
        if (x1 != 0 & x2 != 0 & y1 != 0 & y2 != 0 & a != 0) {
            g.drawLine(x1, y1, x2, y2);
        }
    }
}