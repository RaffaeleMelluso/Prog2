//Quadrato.java

import java.awt.*; //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfacce grafiche

public class Quadrato extends Figura {
    private int x;
    private int y;
    private int lato;
    private Color c;

    //Costruttore
    public Quadrato(int x, int y, int lato, Color c) {
        this.x = x;
        this.y = y;
        this.lato = lato;
        this.c = c;
    }

    public void draw(Graphics g) {
        g.setColor(c);
        int m = lato / 2;
        g.drawLine(x + m, y + m, x - m, y + m); //disegno primo lato su g
        g.drawLine(x - m, y + m, x - m, y - m); //disegno secondo lato su g
        g.drawLine(x - m, y - m, x + m, y - m); //disegno terzo lato su g
        g.drawLine(x + m, y - m, x + m, y + m); //disegno quarto lato su g
    }
}
