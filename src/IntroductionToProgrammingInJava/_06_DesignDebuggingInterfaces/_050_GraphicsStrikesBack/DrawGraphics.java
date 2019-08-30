package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._050_GraphicsStrikesBack;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    ArrayList<Mover> movers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._050_GraphicsStrikesBack.Rectangle box = new Rectangle(15, 20, Color.RED);
        Line line = new Line(50,30);
        Oval oval = new Oval(30, 20, Color.PINK);
        StringLine stringLine1 = new StringLine("Hello", Color.BLUE);

        ArrayList<Sprite> shapes = new ArrayList<>();
        shapes.add(box);
        shapes.add(line);
        shapes.add(oval);
        shapes.add(stringLine1);

        for (int i = 100; i < 150; i = i + 20) {
            for (Sprite shape : shapes) {
                movers.add(new Bouncer(i, i, shape));
                movers.add(new StraightMover(i, i, shape));
            }
        }

        for (Mover mover : movers) {
            Random random = new Random();
            mover.setMovementVector(random.nextInt(6) - 2, random.nextInt(6) - 2);
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {

        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}
