//Quadrato.java

import java.awt.*;    //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfaccie grafiche

public class Quadrato extends Figura {
    private int x;
    private int y;
    private int lato;
    private Color dentro, bordo;

    //Costruttore
    public Quadrato(int x, int y, int lato, Color dentro, Color bordo) {
        this.x = x;
        this.y = y;
        this.lato = lato;
        this.dentro = dentro;
        this.bordo = bordo;
    }

    public void draw(Graphics g) {
        g.setColor(dentro);
        int m = lato / 2;
        g.fillRect(x - m, y - m, lato, lato);
        g.setColor(bordo);
        g.drawRect(x - m, y - m, lato, lato);
    }
}
