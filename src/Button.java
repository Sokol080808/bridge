
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button {
    int x;
    int y;
    int width;
    int height;
    BufferedImage image;

    public void onMouseHit(int mouseX, int mouseY) {
        if (mouseX > (x + width) || mouseX < x || mouseY < y + height || mouseY > y) {
            System.out.println("ВЫ ВЫИГРАЛИ!!!!");
        } else {
        }
    }

    public void paint(Graphics g) {
        g.drawImage(image,x,y,null);
    }

    Button(int x, int y, int height, int width) throws IOException {
        this.x = x;
        this.y = y;

        image = ImageIO.read(new File("data\\button.png"));

        this.height = image.getHeight();
        this.width = image.getWidth();
    }
}