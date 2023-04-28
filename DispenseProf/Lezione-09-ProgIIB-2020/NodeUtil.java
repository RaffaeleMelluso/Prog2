//NodeUtil.java:
public class NodeUtil {
    //0. STAMPA dei nodi della lista in ordine inverso (vedi Lez.08)
    public static void scriviOutput(Node p) {
        while (p != null) {
            System.out.println(p.getElem());
            p = p.getNext();
        }
    }

    //1. Length. Metodo che calcola la lunghezza di una lista.
    public static int length(Node p) {
        int l = 0;
        while (p != null) {
            //ogni volta che incontro un nodo incremento di 1 la lunghezza
            p = p.getNext();
            l++;
        }
        return l;
    }

    //versione ricorsiva
    public static int length_rec(Node p) {
        if (p == null) return 0;
        else return 1 + length_rec(p.getNext());
    }

    //2. Sum. Somma degli elementi di una lista.
    public static int sum(Node p) {
        int s = 0;
        while (p != null) {
            //ogni volta che incontro un nodo ne aggiungo il contenuto alla
            //somma
            s = s + p.getElem();
            p = p.getNext();
        }
        return s;
    }

    //versione ricorsiva
    public static int sum_rec(Node p) {
        if (p == null) return 0;
        else return p.getElem() + sum_rec(p.getNext());
    }

    //3. Max. Massimo degli elementi di una lista non nulla
    //(non definito per la lista vuota)
    public static int max(Node p) {
        assert p != null : "Err. Massimo di una lista vuota";
        int m = p.getElem();
        p = p.getNext();
        // m=massimo dei nodi gia' visti, all’inizio m=nodo in cima
        while (p != null) {
            // a ogni passo prendo il massimo tra m (max nodi gia' visti)
            // e il nodo corrente.
            m = Math.max(m, p.getElem());
            p = p.getNext();
        }
        //alla fine m e' il massimo tra tutti i nodi
        return m;
    }

    //versione ricorsiva
    public static int max_rec(Node p) {
        assert p != null : "Err. Massimo di una lista vuota";
        if (p.getNext() == null) return p.getElem();
        else return Math.max(p.getElem(), max_rec(p.getNext()));
    }

    //4. Member. Metodo che controlla se x dato compare in una lista p.
    public static boolean member(Node p, int x) {
        while (p != null) {
            //a ogni passo se trovo x restituisco "true"
            if (p.getElem() == x) return true;
            else p = p.getNext();
        }
        //se ho esaurito la lista senza trovare x allora x non c'e'
        return false;
    }

    //versione ricorsiva
    public static boolean member_rec(Node p, int x) {
        if (p == null) return false;
        else if (p.getElem() == x) return true;
        else return member_rec(p.getNext(), x);
    }

    // 5. String toString(Node p) restituisce una stringa
    // con i nodi di p separati da spazi
    public static String toString(Node p) {
        String s = " ";
        while (p != null) {
            s = s + p.getElem() + " ";
            p = p.getNext();
        }
        return s;
    }

    // 6. Sorted(Node p) verifica se una lista concatenata
    // è ordinata in modo debolmente crescente
    public static boolean sorted(Node p) {
        if (p == null) return true; //lista vuota: ordinata
        while (p.getNext() != null) {
            if (p.getNext().getElem() > p.getElem())
                return false;
            //se (secondo elemento > primo elemento): lista non ordinata
            p = p.getNext();
        }
        //finita la lista, non c'e' un elemento > del seguente:lista
        //ordinata
        return true;
    }

    // 7. equals(Node p, Node q) verifica se due liste concatenate
    // sono uguali
    public static boolean equals(Node p, Node q) {
        while ((p != null) && (q != null)) {
            if (p.getElem() != q.getElem()) return false;
            //se trovo due elementi in posizioni uguali e diversi: p,q diverse
            p = p.getNext();
            q = q.getNext();
        }
        //finito il while abbiamo p=null oppure q=null. Quindi:
        //1. se p,q sono lo stesso indirizzo, allora p=q=null e p,q
        //contenevano lo stesso numero di elementi uguali a due a due:
        //erano uguali
        //2. se p,q sono indirizzo diversi, allora uno e' null e l'altro no
        //quindi p,q avevano lunghezze diverse:
        //erano diversi
        return (p == q); //in ogni caso e’ la risposta giusta
    }


    public static void main(String[] args) {
        System.out.println("Main di prova per gli esercizi 0-7");
        System.out.println("---------------------");
        //aggiungo i nodi di q={10,20,30,40} a sinistra, dunque parto da 40
        Node q = new Node(40, null);
        q = new Node(30, q);
        q = new Node(20, q);
        q = new Node(10, q);
        System.out.println("Lista q:");
        scriviOutput(q);
        System.out.println("---------------------");
        //aggiungo i nodi di p={10,20,30,40,30,20,10} a sinistra
        Node p = new Node(10, null);
        p = new Node(20, p);
        p = new Node(30, p);
        p = new Node(40, p);
        p = new Node(30, p);
        p = new Node(20, p);
        p = new Node(10, p);
        System.out.println("Lista p:");
        scriviOutput(p);
        System.out.println("---------------------");
        System.out.println("1. length(p) = " + length(p));
        System.out.println("1. length_rec(p) = " + length_rec(p));
        System.out.println("---------------------");
        System.out.println("2. sum(p) = " + sum(p));
        System.out.println("2. sum_rec(p) = " + sum_rec(p));
        System.out.println("---------------------");
        System.out.println("3. max(p) = " + max(p));
        System.out.println("3. maxr_rec(p) = " + max_rec(p));
        System.out.println("---------------------");
        System.out.println("4. member(p,30) = " + member(p, 30));
        System.out.println("4. member(p,50) = " + member(p, 50));
        System.out.println("4. member_rec(p,30) = " + member_rec(p, 30));
        System.out.println("4. member_rec(p,50) = " + member_rec(p, 50));
        System.out.println("---------------------");
        System.out.println("5. toString(q) = " + toString(q));
        System.out.println("5. toString(p) = " + toString(p));
        System.out.println("---------------------");
        System.out.println("6. sorted(q) = " + sorted(q));
        System.out.println("6. sorted(p) = " + sorted(p));
        System.out.println("---------------------");
        System.out.println("7. equals(p,q) = " + equals(p, q));
        System.out.println("7. equals(p,p) = " + equals(p, p));
        System.out.println("7. equals(q,q) = " + equals(q, q));
        System.out.println("7. equals(q,p) = " + equals(q, p));
    }

}