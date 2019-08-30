package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class _033_DrawGraphics {
    private ArrayList<_032_BouncingBox> boxes = new ArrayList<>();

    /** Initializes this class for drawing. */
    public _033_DrawGraphics() {
        boxes.add(new _032_BouncingBox(200, 50, Color.RED));
        boxes.add(new _032_BouncingBox(10, 100, Color.GREEN));
        boxes.add(new _032_BouncingBox(10, 100, Color.BLUE));
        boxes.add(new _032_BouncingBox(10, 100, Color.BLACK));
        boxes.add(new _032_BouncingBox(200, 50, Color.CYAN));
        boxes.add(new _032_BouncingBox(200, 50, Color.PINK));

        for (_032_BouncingBox box : boxes) {
            Random rand = new Random();
            box.setMovementVector(rand.nextInt(10) - 5,rand.nextInt(6) - 3);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);

        for (_032_BouncingBox box : boxes) {
            box.draw(surface);
        }

        surface.fillRect (150, 100, 25, 40);
        surface.fillOval (40, 40, 25, 10);
        surface.setColor (Color.YELLOW);
        surface.drawString ("Mr. And Mrs. Smith", 200, 10);

        surface.drawRect(150, 200, 150, 50);
        surface.setColor(Color.yellow);
        surface.fillRect(150, 200, 150, 50);
        surface.setColor(Color.magenta);
        surface.drawOval(100, 100, 50, 150);
    }
}