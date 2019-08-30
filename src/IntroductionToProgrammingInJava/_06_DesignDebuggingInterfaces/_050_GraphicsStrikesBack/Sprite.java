package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._050_GraphicsStrikesBack;

import java.awt.*;

public interface Sprite {
    /**
     * Draws this sprite on surface, with the coordinate (leftX, topY) as the
     * top left corner.
     */
    void draw(Graphics surface, int leftX, int topY);

    /** Returns the width of the sprite. */
    int getWidth();

    /** Returns the height of the sprite. */
    int getyChange();
}
