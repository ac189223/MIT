package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._060_GraphicsStrikesBack._050_GraphicsStrikesBack;

import java.awt.*;

public class Bouncer extends MoverClass {

    /** Create a Bouncer that positions sprite at (startX, startY). */
    Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    /** Draws the sprite at its current position on to surface. */
    @Override
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getyChange() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }
}
