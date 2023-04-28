//inseriamo il tutto nel file: RettangoloDemo.java

import java.util.Scanner;

class Rettangolo { //classe non eseguibile
    /**
     * Rendendo privati gli attributi, un metodo esterno alla classe
     * non puo' piu' modificare base, altezza, area
     */
    private double base;
    private double altezza;
    private double area;

    public Rettangolo(double b, double h) //Costruttore di rettangoli
    {
        base = b;
        altezza = h;
        area = b * h;
    }

    private static Scanner tastiera = new Scanner(System.in); /* Questa
        variabile e' statica, cioe' non appartiene a nessun rettangolo */

    public void setDimensioni(double b, double h)
/** Per modificare base, altezza e area ora e' necessario un metodo
 "set" (uno per attributo, o uno solo per modificare tutti) */
    {
        base = b;
        altezza = h;
        area = b * h;
    }
//Il metodo set aggiorna l'area e non mi consente di modificarla

    /**
     * Per ottenere base, altezza e area ora e' necessario un metodo
     * "get" (uno per attributo)
     */
    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getArea() {
        return area;
    }

    public void leggiInput() {
        System.out.println(" base = ");
        base = tastiera.nextDouble();
        tastiera.nextLine();
        /* nextLine() consuma il carattere "return" */
        System.out.println(" altezza = ");
        altezza = tastiera.nextDouble();
        tastiera.nextLine();
        area = base * altezza;
    }

    /**
     * Metodo di conversione rettangolo --> stringa
     */
    public String toString() {
        return " base = " + base + "\n altezza = " + altezza +
                "\n area = " + area;
    }
}

/**
 * La classe RettangoloDemo, che da' il nome al file
 */
public class RettangoloDemo {
    public static void main(String[] args) {
        Rettangolo R = new Rettangolo(2, 2);
        //R nasce come rettangolo 2x
        System.out.println("Inserisci nuovi valori per R");
        R.leggiInput();
        System.out.println("Valori inseriti di R \n" + R);
        //Se R viene concatenato con una stringa, viene interpretato come
        //R.toString()

        System.out.println("Modifico R con base=altezza=5");
        /** Se cerco di assegnare R.base = 5; R.altezza = 5; ottengo un
         errore perche' gli attributi base e altezza sono privati. Devo invece
         37
         scrivere: */
        R.setDimensioni(5, 5);
        System.out.println("Valori modificati di R \n" + R);
    }
}