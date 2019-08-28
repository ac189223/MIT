package IntroductionToProgrammingInJava._05_AccessControlClassScopePackagesJavaAPI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class _063_DrawGraphics {
    private _062_BouncingBox box1;
    private _062_BouncingBox box2;
    private _062_BouncingBox box3;
    private _062_BouncingBox box4;
    private _062_BouncingBox box5;
    private _062_BouncingBox box6;
    private ArrayList<_062_BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public _063_DrawGraphics() {
        box1 = new _062_BouncingBox(200, 50, Color.RED);
        box2 = new _062_BouncingBox(10, 100, Color.GREEN);
        box3 = new _062_BouncingBox(10, 100, Color.BLUE);
        box4 = new _062_BouncingBox(10, 100, Color.BLACK);
        box5 = new _062_BouncingBox(200, 50, Color.CYAN);
        box6 = new _062_BouncingBox(200, 50, Color.PINK);

        boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
        boxes.add(box6);

        for (_062_BouncingBox box : boxes) {
            Random rand = new Random();
            box.setMovementVector(rand.nextInt(10) - 5,rand.nextInt(6) - 3);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);

        for (_062_BouncingBox box : boxes) {
            box.draw(surface);
        }

//        surface.drawRect(150, 200, 150, 50);
//        surface.setColor(Color.yellow);
//        surface.fillRect(150, 200, 150, 50);
//        surface.setColor(Color.magenta);
//        surface.drawOval(100, 100, 50, 150);
    }
}