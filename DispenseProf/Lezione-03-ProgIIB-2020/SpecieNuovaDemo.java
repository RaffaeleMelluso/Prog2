//salviamo tutto nel file SpecieNuovaDemo.java

import java.util.Scanner;

class SpecieNuova { /** Classe non pubblica */
    /**
     * Rendendo privati gli attributi di Specie, un metodo esterno
     * alla classe non puo' piu' modificare direttamente gli attributi:
     * nome, popolazione, tassoCrescita
     */
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    /**
     * Per modificare gli attributi della classe ora e' necessario un
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
     * Per ottenere gli attributi della classe ora e' necessario un
     * metodo "get". Se un dato e' riservato, basta togliere il suo metodo
     * "get" e l’attributo non e' piu' accessibile dall’esterno della
     * classe.
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

    private static Scanner tastiera = new Scanner(System.in);

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

    /**
     * Metodo di conversione specie --> stringa
     */
    public String toString() {
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
    }

    /**
     * Questo metodo dinamico assegna gli attributi di this agli
     * attribuiti dell’oggetto "altraSpecie" passato come argomento.
     */
    public void cambia(SpecieNuova altraSpecie) {
        altraSpecie.nome = this.nome;
        altraSpecie.popolazione = this.popolazione;
        altraSpecie.tassoCrescita = this.tassoCrescita;
    }

    /**
     * Dobbiamo aggiungere un metodo per confrontare due oggetti: usare
     * direttamente == tra gli oggetti non va sempre bene, perche' ==
     * confronta gli indirizzi dei due oggetti, invece qui vogliamo
     * confrontare i valori dei attributi
     */
    public boolean equals(SpecieNuova altraSpecie) {
        return (nome.equalsIgnoreCase(altraSpecie.nome))
                && (popolazione == altraSpecie.popolazione)
                && (tassoCrescita == altraSpecie.tassoCrescita);
    }
}

//Usiamo una classe SpecieNuovaDemo per sperimentare la classe Specie
public class SpecieNuovaDemo { //classe eseguibile pubblica
    private static void pause() {
        /** questo metodo ferma l’esecuzione del programma e aspetta un a
         capo per continuare. E' statico, quindi non viene inviato a un
         oggetto, ma chiamato scrivendo: pause(); */
        Scanner tastiera = new Scanner(System.in);
        System.out.println("............. premi a capo per continuare");
        tastiera.nextLine();
    }

    public static void main(String[] args) {
        SpecieNuova specieTerrestre = new SpecieNuova();//primo oggetto
        System.out.println("\n 1. Inserisco specieTerrestre usando un set");
/** Non possiamo assegnare nome, popolazione e tasso di crescita
 direttamente perche' questi attributi sono privati */
        specieTerrestre.setSpecie("Bufalo Nero", 500, 3);

        System.out.println("\n 2. Dati inseriti specieTerrestre");
        System.out.println(specieTerrestre);
//sta per: System.out.println(specieTerrestre.toString());
        pause();

        SpecieNuova specieKlingon = new SpecieNuova();//secondo oggetto
        System.out.println("\n 3. Inserisco specieKlingon usando un set");
/** Non possiamo assegnare nome, popolazione e tasso di crescita
 direttamente perche' questi attributi sono privati */
        specieKlingon.setSpecie("Bufalo Klingon", 1000, 10);
        System.out.println("\n 4. Dati inseriti specieKlingon");
        System.out.println(specieKlingon);
        pause();

        System.out.println("\n 5. Assegno specieterrestre = specieKlingon");
        specieTerrestre = specieKlingon;
        System.out.println("Ho identificato i due oggetti, ora valgono:");
        System.out.println(specieTerrestre);
        System.out.println(specieKlingon);

        System.out.println("\n 6. Per rendermi conto che i due oggetti sono identificati: ");
        System.out.println("se modifico la specie terrestre in Elefante modifico anche il Klingon");
        specieTerrestre.setSpecie("Elefante", 100, 2);
        System.out.println(specieTerrestre);
        System.out.println(specieKlingon);
        pause();

        System.out.println("\n 7. Vediamo ora il modo corretto di modificare gli oggetti");
        System.out.println("Creo \"specieAfricana\" e le assegno i valori Elefante");
        SpecieNuova specieAfricana = new SpecieNuova(); //terzo oggetto
/** Copio i dati da specieTerrestre in specieAfricana */
        specieTerrestre.cambia(specieAfricana);
        System.out.println(specieAfricana);
        pause();

        System.out.println("\n 8. I primi due oggetti sono lo stesso: (specieTerrestre == specieKlingon) vale : "
                + (specieTerrestre == specieKlingon));
/** Vero, sono lo stesso indirizzo */

        System.out.println("\n 9. Invece il primo e il terzo oggetto no: (specieTerrestre == specieAfricana) vale : "
                + (specieTerrestre == specieAfricana));
/** falso, hanno gli stessi valori ma non lo stesso indirizzo */

        System.out.println("\n 10. Pero' il primo e il terzo oggetto hanno gli stessi attributi: (specieTerrestre.equals(specieAfricana)) vale : " + (specieTerrestre.equals(specieAfricana)));
/** vero, hanno gli stessi valori, anche se indirizzo diverso */
        pause();

        System.out.println("\n 11. Una controprova: modifico la specie Africana in Elefante Africano.");
        specieAfricana.setSpecie("Elefante Africano", 100, 2);
        System.out.println(specieAfricana);

        System.out.println("\n 12. NON modifico anche la specie Klingon perche' i due oggetti hanno indirizzi diversi: ");
        System.out.println(specieKlingon);
    }
}
