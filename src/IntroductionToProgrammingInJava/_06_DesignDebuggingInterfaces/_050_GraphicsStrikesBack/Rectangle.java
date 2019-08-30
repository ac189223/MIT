package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._050_GraphicsStrikesBack;

import java.awt.*;

public class Rectangle implements Sprite {
    private int width;
    private int height;
    private Color color;

    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */
    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(color);
        surface.fillRect(x, y, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawRect(x, y, width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getyChange() {
        return height;
    }
}
