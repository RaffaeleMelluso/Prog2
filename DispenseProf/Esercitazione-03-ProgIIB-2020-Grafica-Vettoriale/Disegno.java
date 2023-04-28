//Disegno.java

import java.awt.*; //Abstract Window Toolkit (finestre grafiche)
import javax.swing.*; //estensione di awt per interfacce grafiche
import java.util.Random; //per i numeri casuali

public class Disegno extends JFrame {
    private Figura[] figure;

    //COSTRUTTORE
    public Disegno(Figura[] figure) {
        super(); //Assegnamo tutti i parametri di un JFrame
        this.figure = figure; //Aggiungiamo un array di figure
    }

    public void paint(Graphics g) {
        int w = getSize().width; // base frame g
        int h = getSize().height; // altezza frame g
        g.clearRect(0, 0, w, h); // azzero contenuto del frame g
        g.translate(w / 2, h / 2);// traslo sistema di riferimento a centro frame
        for (int i = 0; i < figure.length; ++i) figure[i].draw(g);
    }

    public static Random random = new Random();

    public static int v() {
        return random.nextInt(255);
    }

    public static Color c() {
        return new Color(v(), v(), v());
    }

    public static int p() {
        return random.nextInt(400) - 200;
    }

    public static void main(String[] args) {
        int n = 20;
        int i;
        Figura[] figure = new Figura[3 * n];
        for (i = 0; i < n; ++i) figure[i] = new Quadrato(p(), p(), p(), c());
        for (i = n; i < 2 * n; ++i) figure[i] = new Cerchio(p(), p(), p(), c());
        for (i = 2 * n; i < 3 * n; ++i) figure[i] = new Triangolo(p(), p(), p(), p(), c());
        Disegno frame = new Disegno(figure);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}