//Cerchio.java

import java.awt.*; //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfacce grafiche

public class Cerchio extends Figura {
    private int x;
    private int y;
    private int raggio;
    private Color c;

    //COSTRUTTORE
    public Cerchio(int x, int y, int raggio, Color c) {
        this.x = x;
        this.y = y;
        this.raggio = raggio;
        this.c = c;
    }

    public void draw(Graphics g) {
        g.setColor(c);
        g.drawOval(x - raggio, y - raggio, 2 * raggio, 2 * raggio);
    }
}