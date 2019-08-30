package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._060_GraphicsStrikesBack._050_GraphicsStrikesBack;

import java.awt.*;

public class StringLine implements Sprite {
    private String stringLine;
    private Color color;

    StringLine(String stringLine, Color color) {
        this.stringLine = stringLine;
        this.color = color;
    }

    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(color);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawString (stringLine, x, y);
    }

    public int getWidth() { return stringLine.length() * 6; }

    public int getyChange() {
        return 0;
    }
}
