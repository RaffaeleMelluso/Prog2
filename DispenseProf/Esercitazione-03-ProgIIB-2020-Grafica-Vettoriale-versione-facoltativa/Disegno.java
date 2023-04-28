//Disegno.java

import java.awt.*;    //Abstract Window Toolkit (finestre grafiche)
import javax.swing.*; //estensione di awt per interfacce grafiche
import java.util.Random; //per i numeri casuali 

public class Disegno extends JFrame {
    private Figura[] figure;

    //COSTRUTTORE
    public Disegno(Figura[] figure) {
        super();              //Assegnamo tutti i parametri di un JFrame
        this.figure = figure; //Aggiungiamo un vettore di figure
    }

    public void paint(Graphics g) {
        int w = getSize().width;  // base    frame g
        int h = getSize().height; // altezza frame g
        g.clearRect(0, 0, w, h);  // azzero  contenuto del frame g
        g.translate(w / 2, h / 2);//translo sistema di riferimento a centro frame

        for (int i = 0; i < figure.length; ++i) figure[i].draw(g);
    }

    public static Random random = new Random();
    private static int a = 20;

    public static int v() {
        return random.nextInt(255);
    } //v [0,256[

    public static Color c() {
        return new Color(v(), v(), v());
    } //colore rgb a caso

    public static int x() {
        return random.nextInt(28 * a) - 14 * a;
    }// x [-14a,14a[

    public static int y() {
        return random.nextInt(28 * a) - 14 * a;
    }// y [-14a,14a[

    public static int l() {
        return random.nextInt(2 * a) + 2 * a;
    }//lato [2a,4a[

    public static int r() {
        return random.nextInt(a) + a;
    }//raggio [a,2a[

    public static int b() {
        return random.nextInt(2 * a) + 2 * a;
    }//semibase [2a,4a[

    public static int h() {
        return random.nextInt(8 * a) - 4 * a;
    }//altezza [-4a,4a[


    public static void main(String[] args) {
        int nFigure = 1000, f;
        Figura[] figure = new Figura[nFigure];
        for (int i = 0; i < nFigure; ++i) {
            f = random.nextInt(3); //f=0,1,2
            if (f == 0) figure[i] = new Quadrato(x(), y(), l(), c(), c());
            else if (f == 1) figure[i] = new Cerchio(x(), y(), r(), c(), c());
            else figure[i] = new Triangolo(x(), y(), b(), h(), c(), c()); //f=2
        }

        Disegno frame = new Disegno(figure);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
