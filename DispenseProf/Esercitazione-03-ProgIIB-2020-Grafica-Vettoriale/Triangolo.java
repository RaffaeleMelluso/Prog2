//Triangolo.java

import java.awt.*; //Abstract Window Toolkit
import javax.swing.*; //estensione di awt per interfacce grafiche

public class Triangolo extends Figura {
    private int x;
    private int y;
    private int b;
    private int h;
    private Color c;

    //COSTRUTTORE
    public Triangolo(int x, int y, int b, int h, Color c) {
        this.x = x;
        this.y = y;
        this.b = b; /*base*/
        this.h = h; /*altezza*/
        this.c = c;
    }

    public void draw(Graphics g) {
        g.setColor(c);
        g.drawLine(x - b / 2, y, x + b / 2, y); //base triangolo
        g.drawLine(x - b / 2, y, x, y + h); //lato sinistro
        g.drawLine(x + b / 2, y, x, y + h); //lato destro
    }
}