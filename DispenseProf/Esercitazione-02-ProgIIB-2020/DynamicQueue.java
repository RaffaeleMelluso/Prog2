//DinamicQueue.java
public class DynamicQueue {
    private Node first;
    private Node last;

    public DynamicQueue() {
        first = last = null;
    }

    //Conversione DynamicQueue --> String
    public String toString() {
        Node temp = first; //partiamo dal primo nodo della coda
        String s = "";
        while (temp != null) {
            //ci fermiamo quando temp arriva al nodo null
            s = s + " || " + temp.getElem() + "\n";
            temp = temp.getNext(); // arretriamo al nodo precedente
        }
        return s;
    }

    // Inserimento di un elemento in fondo alla coda
    public void enqueue(int x) {
        Node node = new Node(x, null);
        if (first == null)
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }
    }

    // Rimozione del first elemento della coda
    public int dequeue() {
        assert !empty() : "Err. rimozione da coda vuota.";
        int x = first.getElem();
        first = first.getNext();
        if (first == null) last = null;
        return x;
    }

    // Calcolo della dimensione della coda
    public int size() {
        int n = 0;
        for (Node p = first; p != null; p = p.getNext())
            n++;
        return n;
    }

    // Test per verificare se la coda e' vuota
    public boolean empty() {
        return first == null;
    }

    // Metodo per leggere senza rimuovere il primo elemento della coda
    public int front() {
        assert !empty() : "Err. lettura da coda vuota.";
        return first.getElem();
    }

    // Test per verificare se la lista p contiene x
    public boolean contains(int x) {
        Node p = first;
        while (p != null) {
            if (p.getElem() == x) return true;
            else p = p.getNext();
        }
        return false;
    }
}