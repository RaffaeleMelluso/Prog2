// Classe per modellare uno stack di interi con capacita' non
// modificabile. Deve essere pubblica, trattandosi di una libreria
// La salviamo in StackDemo.java
class Stack {
    private int[] stack;// inizialmente stack e' l’array vuoto.
    //non fissiamo subito una massima dimensione per tutti gli stack
    private int size = 0;

    // size=numero elementi inseriti: chiediamo 0 <= size <= stack.length
    public Stack(int capacity) {
        assert capacity >= 0 :
                "la capacita' dello stack doveva essere >=0 invece vale" + capacity;
        // adesso fissiamo: massimo numero elementi stack = capacity
        stack = new int[capacity];
        // size = numero di elementi inseriti all'inizio e' 0
        size = 0;
    }

    // e' conveniente mettere a disposizione due operazioni per sapere
    // se lo stack e' vuoto o pieno. Cio' consente all'utilizzatore
    // dello stack di sapere quando un'operazione push/pop e' lecita
    public boolean empty() {
        return size == 0;
    }

    public boolean full() {
        return size == stack.length;
    }

    public void push(int x) {
        assert !full() :
                "tentativo push in uno stack pieno di elementi: " + size;
        stack[size] = x;
        size++;
    }

    public int pop() {
        assert !empty() :
                "tentativo pop da uno stack vuoto";
        --size;
        return stack[size];
    }

    /**
     * Per fare esperimenti con gli stack, definiamo un metodo equals
     * che controlla se due stack sono identici in tutto: stessa capienza,
     * stesso numero size di elementi utilizzati, stessi elementi tra quelli
     * di indice 0, ..., size-1. In questo modo possiamo controllare se uno
     * stack contiene gli elementi che dovrebbe contenere
     */
    public boolean equals(Stack altroStack) {
        if (this.size != altroStack.size) return false;
        if (this.stack.length != altroStack.stack.length) return false;
        int i = 0;
        while (i < size) {
            if ((this.stack)[i] != (altroStack.stack)[i]) return false;
            i++;
        }
        return true;
    }
}

// StackDemo.java (sperimentiamo la classe Stack)
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(3), t = new Stack(3);
        System.out.println("s,t stacks con capacita' 3 entrambi vuoti");
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("s={10,20,30} pieno, diverso da t={} vuoto");
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));

        System.out.println("Eliminiamo uno alla volta gli elementi in s");
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());

        System.out.println("Adesso s e' vuoto e uguale a t");
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));

        System.out.println("Pongo s={40,50} e t={40,60}: s,t diversi");
        s.push(40);
        s.push(50);
        t.push(40);
        t.push(60);
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));
    }
}