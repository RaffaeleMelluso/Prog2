class Esercizio3 {
    public static boolean OK(Node p) //OK(p) controlla
    // che ogni elemento negativo in p sia seguito da un altro elemento
    {
        while (p != null) {
            if (p.getElem() < 0 && p.getNext() == null)
            //se p ha un elemento negativo che non e' seguito da elementi allora:
                return false;
            p = p.getNext();
        } /*Se il while finisce, allora ogni elemento
            negativo in p e' seguito da un elemento, allora: */
        return true;
    }

    /* DESCRIZIONE metodo(p): per ogni elemento negativo in p, il metodo
    elimina l'elemento seguente se positivo. Quindi metodo(p) solleva
    eccezione se: un elemento negativo non ha seguente */
    public static void metodo(Node p) {
        assert OK(p) :
                "C'e' un elemento negativo nella lista senza elemento seguente";
        while (p != null) {
            if (p.getElem() < 0 && p.getNext().getElem() > 0)
                p.setNext(p.getNext().getNext());
            p = p.getNext();
        }
    }

    public static void scriviOutput(Node p) {
        while (p != null) {
            System.out.println("  " + p.getElem());
            p = p.getNext();
        }
    }

    public static void main(String[] args) {
        Node p = new Node(0, new Node(-1, null)); //p={0,-1}
        Node q = new Node(0, new Node(-1, new Node(+1, null))); //q={0,-1,+1}
        System.out.println(" OK(p)=" + OK(p) + " OK(q)=" + OK(q));
        System.out.println(" p =");
        scriviOutput(p);
        if (!OK(p)) //p non viene accettata da OK(p) perche’:
            System.out.println("l’elemento -1 non ha successore in p");
        System.out.println(" q =");
        scriviOutput(q);
        metodo(q);
        //metodo(q) cancella +1 perche' +1 segue -1 in q
        System.out.println("dopo metodo(q): q=");
        scriviOutput(q);
    }
}
