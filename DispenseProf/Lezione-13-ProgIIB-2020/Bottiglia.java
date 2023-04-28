//Bottiglia.java
/* Versione con: uso assert, con this omesso ove possibile, con
metodi get e set. Per evitare modifiche alla capacita' non forniamo
un metodo set per la capacita'. */
public class Bottiglia { //Nota: quantita' intere espresse in galloni
    private int capacita; // 0 <= capacita
    private int livello; // 0 <= livello <= capacita'

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        /** "this.capacita" e' un attributo di bottiglia mentre "capacita"
         e' l'unico argomento del costruttore Bottiglia */
        livello = 0;
        assert (0 <= livello) && (livello <= capacita);
    }

    /**
     * Aggiungiamo tutta la parte di una quantita' data che trova posto
     * nella bottiglia (dunque il minimo tra la quantita' data e la
     * capacita' residua). Restituiamo la quantita` che abbiamo aggiunto
     * (che puo' essere meno della richiesta).
     */
    public int aggiungi(int quantita) {
        assert quantita >= 0 :
                "la quantita' doveva essere >=0 invece vale " + quantita;
        int aggiunta = Math.min(quantita, capacita - livello);
        livello = livello + aggiunta;
        assert (0 <= livello) && (livello <= capacita);
        return aggiunta;
        /** min e' un metodo statico della classe Math, quindi fuori dalla
         classe Math lo indico con Math.min */
    }

    /**
     * Rimuoviamo da una bottiglia una quantita' richiesta se c'e',
     * altrimenti togliamo tutto (dunque il minimo tra la quantita'
     * richiesta e il livello). Restituiamo la quantita' rimossa
     * (che puo' essere meno della richiesta)
     */
    public int rimuovi(int quantita) {
        assert quantita >= 0 :
                "la quantita' doveva essere >=0 invece vale " + quantita;
        int rimossa = Math.min(quantita, livello);
        livello = livello - rimossa;
        assert (0 <= livello) && (livello <= capacita);
        return rimossa;
    }

    public int getCapacita() {
        return this.capacita;
    }

    public int getLivello() {
        return this.livello;
    }

    // Non consentiamo di cambiare la capacita'
    public void setLivello(int livello) {
        this.livello = livello;
        /** "this.livello" e' un attributo di bottiglia mentre "livello" e'
         l'unico argomento del metodo setLivello */
        assert (0 <= livello) && (livello <= capacita);
    }

    public String toString() //conversione bottiglia --> stringa
    {
        return livello + "/" + capacita;
    }
}
