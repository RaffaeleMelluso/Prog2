//Branch.java
public class Branch extends Tree {
    private int elem; //radice
    private Tree left, right;

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }
    // Un albero non vuoto non e' vuoto

    /* visita in-order:scendo a sinistra,visito la radice, scendo a
   destra */
    public void inOrder() {
        left.inOrder();
        System.out.print(elem + " ");
        right.inOrder();
    }

    /* visita pre-order: visito la radice, scendo a sinistra, scendo a
   destra */
    public void preOrder() {
        System.out.print(elem + " ");
        left.preOrder();
        right.preOrder();
    }

    /* visita post-order: scendo a sinistra, scendo a destra, visito la
    radice */
    public void postOrder() {
        left.postOrder();
        right.postOrder();
        System.out.print(elem + " ");
    }

    public String livello(int n) {
        if (n == 0) return elem + " ";
        else return left.livello(n - 1) + right.livello(n - 1);
    }

    public void livello() {
        int liv = 0;
        String s = livello(liv);
        while (s.length() > 0) {
            System.out.println(s);
            liv++;
            s = livello(liv);
        }
    }

    public int leavesAt(int n) {
        if (n == 0)
            return 0;
        else
            return left.leavesAt(n - 1) + right.leavesAt(n - 1);
    }

    //Metodo che gestisce la parte NON pubblica della stampa.
    //Non forniamo spiegazioni sul suo funzionamento, non e' essenziale.
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, " /", " ", " ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, " \\", " ¦", " ");
    }
}
