package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._060_GraphicsStrikesBack._050_GraphicsStrikesBack;

import java.awt.*;

public class Line implements Sprite {
    private int xChange;
    private int yChange;

    Line(int width, int height) {
        this.xChange = width;
        this.yChange = height;
    }

    @Override
    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawLine(x, y, x + xChange, y + yChange);
    }

    @Override
    public int getWidth() {
        return xChange;
    }

    @Override
    public int getyChange() {
        return yChange;
    }
}
