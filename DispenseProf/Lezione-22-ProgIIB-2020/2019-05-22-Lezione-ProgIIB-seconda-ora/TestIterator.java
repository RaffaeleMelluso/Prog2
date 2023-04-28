import java.util.*; //per le interfacce Iterable<T> e Iterator<T>

class Node {
    private int elem;
    private Node next;

    public Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    public int getElem() {
        return elem;
    }

    public Node getNext() {
        return next;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class Interval implements Iterable<Integer> {
    private Node first, last;

    public Interval(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    public Iterator<Integer> iterator() {
        return new IntervalIterator(first, last);
    }
}

class IntervalIterator implements Iterator<Integer> {
    private Node first, last;

    public IntervalIterator(Node first, Node last) {
        this.first = first;
        this.last = last;
    }

    // [first,last[ ha almeno un nodo se first!=last e first!=null
    public boolean hasNext() {
        return first != last && first != null;
    }

    public Integer next() //portiamo avanti first senza cambiare last
    //e restituiamo il contenuto del first originario
    {
        assert first != last && first != null;
        int elem = first.getElem();
        first = first.getNext();
        return elem;
    }
}

// TestIterator.java. Scrivo una classe per
// sperimentare l’istruzione: for(Integer n:interval){...n...}
public class TestIterator {
    public static void main(String[] args) {
        System.out.println("p={1,2,3,4}");
        Node p = new Node(1, new Node(2, new Node(3, new Node(4, null))));
        System.out.println("q=quarto nodo di p");
        Node q = p.getNext().getNext().getNext();
        //salto i primi 3 nodi di p

        System.out.println("\n [p,q[ = i primi tre nodi di p");
        Interval interval = new Interval(p, q);
        System.out.println("stampo [p,q[={1,2,3}");
        for (Integer n : interval) System.out.println(n);

        System.out.println("\n [p,null[ = p");
        //nodi di p fino alla fine
        Interval interval2 = new Interval(p, null);
        System.out.println("stampo [p,null[=p={1,2,3,4}");
        for (Integer n : interval2) System.out.println(n);
        System.out.println("\n [p,p[ = {}"); // nessun nodo di p
        Interval interval3 = new Interval(p, p);
        System.out.println("stampo [p,p[={}");
        for (Integer n : interval3) System.out.println(n);
    }
}