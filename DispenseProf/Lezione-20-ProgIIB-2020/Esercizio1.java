public class Esercizio1 {/* inComune(p,q) controlla se due liste p,q
su T hanno almeno un elemento in comune nella stessa posizione,
supponendo che gli elementi di p, q siano tutti !=null. Usa
x.equals(T y) per controllare se x,y sono uguali. */

    public static <T> boolean inComune(Node<T> p, Node<T> q) {
        if ((p == null) || (q == null)) // non ci sono elementi in comune
            return false;
        else // p!=null e q!=null
        {
            T x = p.getElem(), y = q.getElem();
            Node<T> l = p.getNext(), m = q.getNext();
            return (x.equals(y)) || inComune(l, m);
             /* true se: il primo elemento e' in comune oppure ci sono elementi
            in comune dopo */
        }
    }

    /* Main di prova: anche questo non e' richiesto all'esame, se
    necessario ve lo forniremo noi */
    public static void main(String[] args) {
        Node<String> p = null, q = null, r = null;
        String i = "i", p1 = "a", p2 = "b" + i, q1 = "b" + i, q2 = "b" + i, r1 = "b" + i, r2 = "c";
        p = new Node<String>(p1, new Node<String>(p2, null)); //p={"a", "bi"}
        q = new Node<String>(q1, new Node<String>(q2, null)); //q={"bi","bi"}
        r = new Node<String>(r1, new Node<String>(r2, null)); //r={"bi","c" }
        System.out.println("p={a,bi}, q={bi,bi}: bi in comune in pos. 1");
        System.out.println(" inComune(p,q) = " + inComune(p, q) + "\n");
        System.out.println("q={bi,bi}, r={bi,c} : bi in comune in pos. 0");
        System.out.println(" inComune(q,r) = " + inComune(q, r) + "\n");
        System.out.println("r={bi,c}, p={a,bi} : nessun elemento comune");
        System.out.println(" inComune(r,p) = " + inComune(r, p) + "\n");
    }
}
