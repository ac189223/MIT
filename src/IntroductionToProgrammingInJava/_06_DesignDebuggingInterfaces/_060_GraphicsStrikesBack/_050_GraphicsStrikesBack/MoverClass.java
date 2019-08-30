package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._060_GraphicsStrikesBack._050_GraphicsStrikesBack;

import java.awt.*;

public class MoverClass implements Mover {
    protected int x;
    protected int y;
    int xDirection;
    int yDirection;
    protected Sprite sprite;

    /** Create a Mover that positions sprite at (startX, startY). */
    MoverClass(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;
    }
}
