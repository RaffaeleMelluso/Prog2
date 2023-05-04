/**
 * Branch.java Sotto-classe di Tree degli alberi non vuoti:
 * elem
 * / \
 * left right
 * Gli elementi a sinistra sono minori di elem, quelli a destra sono
 * maggiori
 */

public class Branch extends Tree {
    private int elem; //radice
    private Tree left; //nodi a sinistra: piu' piccoli della radice
    private Tree right; //nodi a destra: piu' grandi della radice

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }

    public int max(){
        if(left.empty())
            return elem; //perchè è il più grande
        else
            return right.max();
    }

    public boolean contains(int x){
        if (x == elem) // abbiamo trovato l'elemento
            return true;
        else if (x < elem)
            // x se c'e' si trova tra i nodi piu' piccoli a sinistra
            return left.contains(x);
        else //x>elem
            // x se c'e' si trova tra i nodi piu' grandi a destra
            return right.contains(x);
    }

    public Tree insert(int x){
        if(x<elem)
            left=left.insert(x);
        else if(x>elem)
            right=right.insert(x);
        return this;
    }
    public Tree remove(int x){
        if(x<elem){
            left=left.remove(x);
            return this;
        }
        else if(x>elem){
            right=right.remove(x);
            return this;
        }
        else if(left.empty())
            return right;
        else if(right.empty())
            return left;
        else
        {
            elem = right.max();
            right= right.remove(elem);
            return this;
        }
        
    }


    //Metodo che gestisce la parte NON pubblica della stampa.
    //Non forniamo spiegazioni sul suo funzionamento,
    // non e' essenziale.
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, " /", " ", " ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, " \\", " ¦", " ");
    }
}
