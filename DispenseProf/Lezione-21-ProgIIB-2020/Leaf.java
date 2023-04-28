// Implementazione della classe Leaf per rappresentare alberi vuoti
public class Leaf extends Tree {
    public Leaf() {
    }

    public boolean empty() {
        return true;
    }

    // MaxSuAlberoVuoto e' non controllata, dunque se la sollevo
    // posso scegliere se aggiungere "throws MaxSuAlberoVuoto" alla
    // segnatura di max(). Se lo faccio sono obbligato a catturare
    // l’eccezione ogni volta che uso max()
    public int max() throws MaxSuAlberoVuoto {
        throw new MaxSuAlberoVuoto("max su Leaf");
    } //Notiamo che
    // non e` piu` necessario inserire al fondo un "return 0;"
    // in quanto il compilatore Java e' a conoscenza del fatto
    // che throw causa la terminazione del metodo corrente

    public boolean contains(int x) {
        return false;
    }

    public Tree insert(int x) {
        return new Branch(x, this, this);
    }

    public Tree remove(int x) {
        return this;
    } //non c'e' nulla da
    //cancellare nell'albero vuoto, quindi non cambia nulla

    //Metodo che gestisce la parte NON pubblica della stampa.
    //Non forniamo spiegazioni sul suo funzionamento.
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return prefix + root + "leaf";
    }
}