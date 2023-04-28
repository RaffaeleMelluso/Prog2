package Lezione5L;

// Pila di dimensione variable di interi, 
// realizzata come lista concatenata di Nodi
public class PilaDinamica {
    // Riferimento al nodo contenente l'elemento in cima alla pila
    // Invariante: top==null se la pila e' vuota, top!= null altrimenti.
    private Node top;
    

    // Costruttore: crea una pila vuota
    public PilaDinamica() {
        this.top = null;
    }

    // Ritorna true se la pila e' vuota
    public boolean vuota() {
        return this.top == null;
    }

    // Ritorna true se la pila e' piena. 
    // Poiche' la pila ha dimensione dinamica, non puo' mai 
    // essere piena, a meno di finire la memoria
    public boolean piena() {
        return false;
    }

    // Aggiungi l'intero @x in cima alla pila
    public void push(int x) {
        top = new Node(x, top);
    }

    // Elimina l'elemento in cima alla pila, e ritornane il valore.
    public int pop() {
        assert !vuota() : "non si puo' chiamare il metodo pop() se la pila e' vuota.";
        int tmp = top.getElem();
        top = top.getNext();
        return tmp;
    }
    public void duplica()
    {
        
        
    }
    public int dimensione()
    {
        Node tmp=top;
        int c=0;
        while(tmp!=null)
        {
            tmp=tmp.getNext();
            c++;
        }
        return c;
        
    }
    public int [] toArray()
    {
        Node tmp=top;
        int dim=dimensione();
        int [] arr= new int [dim];
        for(int i=dim-1;i>=0;i--)
        {
            arr[i]=tmp.getElem();
            tmp=tmp.getNext();
        }

        return arr;
    }
    public Node fromTo(int m, int n)
    {
        if(m>n)
            return null;
        Node tmp=top;
        PilaDinamica nuova= new PilaDinamica();
        while(tmp!=null)
        {
            if(tmp.getElem()>=m && tmp.getElem()<=n)
            {
                nuova.push(tmp.getElem());
            }
            tmp=tmp.getNext();
        }
        return nuova.top;

    }

    public static int occurrences(Node p, int x)
    {
        int c=0;
        Node tmp=p;
        
        while(tmp!=null)
        {
            if(tmp.getElem()==x)
                c++;
            tmp=tmp.getNext();
        }
        return c;
    }
    public static boolean included(Node p, Node q)
    {
        int c=0;
        PilaDinamica tmp= new PilaDinamica();
        tmp.top=q;
        int n=tmp.dimensione();
        while(tmp.top!=null)
        {
                while(tmp.top.getElem()!=p.getElem() || p.getNext()==null)
                {
                    p=p.getNext();
                }
                if(tmp.pop()==p.getElem())
                {
                    p=p.getNext();
                    c++;
                    if(n==c)
                        return true;
                }
                else
                    c=0;
                
                    
        }
        return false;
    }
}