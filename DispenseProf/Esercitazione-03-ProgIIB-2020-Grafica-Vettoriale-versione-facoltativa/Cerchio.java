//Cerchio,java

import java.awt.*;    //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfaccie grafiche

public class Cerchio extends Figura {
    private int x;
    private int y;
    private int raggio;
    private Color dentro, bordo;

    //COSTRUTTORE
    public Cerchio(int x, int y, int raggio, Color dentro, Color bordo) {
        this.x = x;
        this.y = y;
        this.raggio = raggio;
        this.dentro = dentro;
        this.bordo = bordo;
    }

    public void draw(Graphics g) {
        g.setColor(dentro);
        g.fillOval(x - raggio, y - raggio, 2 * raggio, 2 * raggio);
        g.setColor(bordo);
        g.drawOval(x - raggio, y - raggio, 2 * raggio, 2 * raggio);
    }
}
