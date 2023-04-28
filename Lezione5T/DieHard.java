package Lezione5T;

/**
 * Rappresentiamo le operazioni lecite dell'indovinello The Water Jug Riddle in modo object-oriented
 * con tre metodi statici: "riempi, svuota, travasa" di argomenti di tipo Bottiglia. La definiziome di “travasa” è delicata:
 * possiamo togliere da una prima bottiglia fino a quanto ci sta in una seconda bottiglia,
 * ma dobbiamo fermarci non appena la prima bottiglia è vuota. Se usiamo i metodi “rimuovi” e “aggiungi”
 * della classe Bottiglia, ci impediamo di togliere da una bottiglia già vuota e di aggiungere
 * a una bottiglia già piena.
  */

public class DieHard {
    /*
     * Non costruiamo oggetti per DieHard.
     * Dunque i metodi di DieHard non vengono inviati a oggetti della classe
     * e sono dichiarati statici.
     */



    public static void travasa(Bottiglia a, Bottiglia b) {
        // calcolo quanto basta per riempire b
        // non di piu’ perche’ non vada persa acqua
        int capienzaResiduaB = b.getCapacita() - b.getLivello();
       /* rimuovo questa quantita da a, o tutto da a se a non basta a
          riempire b. Aggiungo la quantita' ottenuta alla bottiglia b */
        b.aggiungi(a.rimuovi(capienzaResiduaB));
        //una soluzione alternativa: a.rimuovi(b.aggiungi(a.getLivello()));
    }

    public static void descrizione(String m, Bottiglia b3, Bottiglia b5) {
        System.out.println(m + "\n" + b3 + "\n" + b5);
    }

    public static void main(String[] args) {
        //Una soluzione all'indovinello con le tre operazioni consentite
        Bottiglia b3 = new Bottiglia(3), b5 = new Bottiglia(5);
        descrizione("Inizio", b3, b5);
        b5.riempi();
        descrizione("Riempio b5", b3, b5);
        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
        b3.svuota();
        descrizione("Svuoto b3", b3, b5);
        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
        b5.riempi();
        descrizione("Riempio b5", b3, b5);
        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
    }
}
