import java.util.*;
import java.io.*; //per IOException

class DenZeroException extends IOException { //controllata
    private int den; //den viene rifiutato quanto den<=0

    public DenZeroException(int den) {
        this.den = den;
    }

    public int getDen() {
        return den;
    }
}

class Frazione {
    private int num;
    private int den;

    // Invariante classe: il denominatore deve essere > 0
    public Frazione() {
        num = 1;
        den = 1;
    } //costruttore pubblico:

    //restituisce un valore di default = 1/1
    // uso un costruttore private, puo' creare frazioni
    // non ben formate, ma non e' accessibile dall'esterno
    private Frazione(int n, int d) {
        num = n;
        den = d;
    }

    // Inserisco l'eccezione in un metodo create pubblico
    // che non chiamo costruttore. create usa il costruttore privato
    // e se necessario solleva un’eccezione
    public static Frazione create(int n, int d)
            throws DenZeroException {
        if (d <= 0) throw new DenZeroException(d);
        return new Frazione(n, d);
    }
    // Quando uso il metodo create devo inserire il metodo dentro un
    // "try"
    // e aggiungere alla fine un "catch" per trattare il caso
    // dell'eccezione di tipo "DenZeroException"
    // DenZeroException e' una eccezione controllata, se la sollevo
    //sono obbligato ad aggiungere "throws DenZeroException" alla
    //segnatura di create, e sono obbligato a catturare l’eccezione
    //ogni volta che uso create

    public String toString() {
        return num + "/" + den;
    }
}

public class ProvaFrazione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//per leggere input
        boolean done = false;
        int n, d;
        Frazione f = new Frazione(); //f=default=1/1
        //f = Frazione.create(2,3);
        //NO: solleva come eccezione: "unreported
        //exception", non ho catturato DenZeroException
        while (!done)
            try {
                System.out.println("Inserisci il numeratore:");
                n = scanner.nextInt();
                System.out.println("Inserisci il denominatore (>0):");
                d = scanner.nextInt();
                f = Frazione.create(n, d); //posso usare create solo dentro try{}
                done = true;
            } catch (DenZeroException err) {//Se leggo un d<=0 chiedo di nuovo
                System.out.println
                        ("Den. " + err.getDen() + "<= 0!. Inserisci ancora:");
            }
        System.out.println("Hai inserito " + f);
    }
}

