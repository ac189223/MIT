package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._040_GraphicsStrikesBack;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    ArrayList<Bouncer> movingSprites = new ArrayList<>();
    ArrayList<StraightMover> straightMovers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
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
                movingSprites.add(new Bouncer(i, i, shape));
                straightMovers.add(new StraightMover(i, i, shape));
            }
        }

        for (Bouncer movingSprite : movingSprites) {
            Random random = new Random();
            movingSprite.setMovementVector(random.nextInt(6) - 2, random.nextInt(6) - 2);
        }

        for (StraightMover straightMover : straightMovers) {
            Random random = new Random();
            straightMover.setMovementVector(random.nextInt(6) - 2, random.nextInt(6) - 2);
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {

        for (Bouncer movingSprite : movingSprites) {
            movingSprite.draw(surface);
        }

        for (StraightMover straightMover : straightMovers) {
            straightMover.draw(surface);
        }

    }
}
