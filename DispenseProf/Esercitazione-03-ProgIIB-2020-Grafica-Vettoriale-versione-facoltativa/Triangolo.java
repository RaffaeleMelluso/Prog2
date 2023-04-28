//Triangolo.java

import java.awt.*;       //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfaccie grafiche

public class Triangolo extends Figura {
    private int x;
    private int y;
    private int b;
    private int h;
    private Color dentro, bordo;

    //COSTRUTTORE
    public Triangolo(int x, int y, int b, int h, Color dentro, Color bordo) {
        this.x = x;
        this.y = y;
        this.b = b; /*base*/
        this.h = h; /*altezza*/
        this.dentro = dentro;
        this.bordo = bordo;
    }

    public void draw(Graphics g) {
        g.setColor(dentro);
        int[] xPoints = {x - b / 2, x, x + b / 2};
        int[] yPoints = {y, y + h, y};
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(bordo);
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
