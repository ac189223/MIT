package IntroductionToProgrammingInJava._06_DesignDebuggingInterfaces._050_GraphicsStrikesBack;

import java.awt.*;

public interface Mover {

    void setMovementVector(int xIncrement, int yIncrement);

    void draw(Graphics surface);

}
