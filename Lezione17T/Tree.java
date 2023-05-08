public class Tree{

    //controlla se l'albero è vuoto
    public abstract boolean empty();


    //scorre l'albero e vede il valore massimo
    public abstract int max();

    //controlla l'albero per vedere se l'elemento x è presente
    public abstract boolean contains(int x);


    //inserisce x nell'albero
    public abstract Tree insert(int x);


    //rimuove x nell'albero
    public abstract Tree remove(int x);
}