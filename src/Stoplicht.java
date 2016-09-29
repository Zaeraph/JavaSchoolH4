import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{
    public void inint(){
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(80, 40, 50, 110);
        g.setColor(Color.RED);
        g.fillArc(92, 50, 25, 25, 90, 360);
        g.setColor(Color.ORANGE);
        g.fillArc(92, 85, 25, 25, 90, 360);
        g.setColor(Color.GREEN);
        g.fillArc(92, 120, 25, 25, 90, 360);
    }
    }