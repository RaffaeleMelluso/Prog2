import java.util.Scanner;
//Specie e' una classe non pubblica e non eseguibile 
//per rappresentare delle specie di esseri viventi.
//Scriveremo un programma per sperimentare Specie in una classe
//di nome SpecieDemo, e salveremo tutto nel file: SpecieDemo.java

class Specie { /** Classe non pubblica, deve stare nello stesso file della classe che la usa */
    /**
     * Rendendo privati gli attributi di Specie, un metodo esterno alla classe non puo' piu' modificare direttamente gli attributi:
     * nome, popolazione, tassoCrescita
     */
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    /**
     * per modificare gli attributi della classe ora e' necessario un
     * metodo "set": cosi' posso inserire un test per controllare che la
     * modifica sia sensata.
     */
    public void setSpecie(String n, int p, double t) {
        nome = n;
        if (p < 0)
            System.out.println("Valori negativi popolazione non accettati");
        else popolazione = p;
        tassoCrescita = t;
    }

    /**
     * per ottenere gli attributi della classe ora e' necessario un metodo "get". Se un dato e' riservato, basta togliere il suo metodo "get" e l'attributo non e' piu' accessible dall'esterno della classe.
     */
    public String getNome() {
        return nome;
    }

    public int getPopolazione() {
        return popolazione;
    }

    public double getTassoCrescita() {
        return tassoCrescita;
    }

    Scanner tastiera = new Scanner(System.in);

    public void leggiInput() {
        System.out.println(" nome = ");
        nome = tastiera.nextLine();

        System.out.println(" popolazione = ");
        popolazione = tastiera.nextInt();
        tastiera.nextLine();

        System.out.println(" tasso di crescita = ");
        tassoCrescita = tastiera.nextDouble();
        tastiera.nextLine();
    }

    public String toString() //Stringa che descrive una specie
    {
        return " nome = " + nome + "\n popolazione = " + popolazione +
                "\n tasso crescita = " + tassoCrescita;
    }

    public int prediciPopolazione(int anni) {
        double p = popolazione;
        while (anni > 0) {
            p = p + p * tassoCrescita / 100;
            --anni;
        }
        return (int) p;
        /* (int) p dice al compilatore che il reale p va visto come un intero */
    }
}

