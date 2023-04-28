class Node<T> {
    public T elem;
    public Node<T> next;

    public Node(T elem, Node<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class Esercizio3 {
    public static void scriviOutput(Node p) {
        while (p != null) {
            System.out.println("" + p.getElem());
            p = p.getNext();
        }
    }

    public static <T extends Comparable<T>> void metodo(Node<T> p, T x) {
        assert OK(p, x); //Per prevenire una NullPointerException
        while (x.compareTo(p.getElem()) < 0) //x < p.getElem() (in T)
            p = p.getNext();
        p.setNext(null);
    }

    public static <T extends Comparable<T>> boolean OK(Node<T> p, T x) {
        if (x == null) return false;
        // adesso sappiamo che x!=null
        while ((p != null) && (x.compareTo(p.getElem()) < 0))
        // x<p.getElem() e p!=null, dunque p.getElem() esiste
            p = p.getNext();
        return p != null; /* se sono arrivato a p==null allora metodo produce
            una NullPointerException. Altrimenti metodo tronca al primo elemento
            e di p tale che sia x>=e */
    }

    //main di prova per il metodo OK
    public static void main(String[] args) {
        Node<Integer> p = new Node<>(30, new Node<>(20, new Node<>(10, null)));
        System.out.println("Sia p={30,20,10}");
        scriviOutput(p);
        System.out.println("Esempi di valori di OK:");
        System.out.println(" OK(null,30)=" + OK(null, 30));
        //OK(null,30)=false
        System.out.println(" OK(p,null)=" + OK(p, null));
        //OK(p,null)=false
        System.out.print("\n Uso metodo per ");
        System.out.println("eliminare gli elementi di p dopo il primo <=10");
        System.out.println("Dato che p={30,20,10}, p resta uguale");
        System.out.println(" OK(p,10)=" + OK(p, 10)); //OK(p,10)=true
        System.out.println(" Applico metodo(p,10): ottengo");
        metodo(p, 10);
        scriviOutput(p);
        System.out.print("\n Uso metodo per ");
        System.out.println("eliminare gli elementi di p dopo il primo <=20");
        System.out.println("Dato che p={30,20,10}, p diventa {30,20}");
        System.out.println(" OK(p,20)=" + OK(p, 20)); //OK(p,20)=true
        System.out.println(" Applico metodo(p,20): ottengo");
        metodo(p, 20);
        scriviOutput(p);
        System.out.print("\n Uso metodo per ");
        System.out.println("eliminare gli elementi di p dopo il primo <=10");
        System.out.println("Dato che p={30,20}, ottengo una eccezione");
        System.out.println(" OK(p,10)=" + OK(p, 10)); //OK(p,10)=false
        System.out.println(" Se applico metodo(p,10) sollevo un'eccezione");
        /* System.out.println("Applico metodo(p)");metodo(p,10);
        System.out.println("p=");scriviOutput(p); */
    }
}