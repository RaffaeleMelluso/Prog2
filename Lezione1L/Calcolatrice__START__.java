package Lezione1L;
class Calcolatrice { //classe non eseguibile e non pubblica
    // una calcolatrice e' una pila che contiene fino a 100 interi.
    // L'ultimo intero e' il risultato delle operazioni fatte finora
    // e la prossima operazione agisce sugli ultimi due interi a,b
    // e li rimpiazza con a+b (per una addizione) oppure a*b (per una moltiplicazione)

    // stack = pila che contiene fino a 100 interi */
    private int[] stack = new int[100];

    // size = numero di interi introdotti: all'inizio 0
    // le posizioni occupate dell'array hanno indice: 0, 1, ..., size-1
    private int size = 0;

    // push(x): aggiunge un intero x allo stack dopo la parte utilizzata
    // e aumenta di 1 la parte di stack utilizzata (variabile size)
    private void push(int x) {
        stack[size]=x;
        size++;
    }

    // pop(): restituisce l'ultima intero dello stack
    // e lo "cancella" riducendo di 1 la parte di stack utilizzata (variabize size)
    private int pop() {
        size--;
        return stack[size];
    }

    // questo e' un metodo pubblico
    public int esegui(String istruzioni) {
        //char[] v = istruzioni.toCharArray();
        char c;
        int a,b;
        int idx=0;
        int len=istruzioni.length();
        while(idx<len)
        {
            c=istruzioni.charAt(idx);
            if(c>='0' && c<='9')
                push(c-'0');
            else if(c=='+')
                push(pop()+pop()); //estrae gli ultimi due numeri dallo stack e li rimette nello stack tramite il push  ES.push(A+B)
            else if(c=='*')
                push(pop()*pop());
            else if(c=='-')
                push(pop()-pop());
            else if(c=='/')
            {
                b=pop();
                a=pop();
                push((int)(a/b));
            }
                
            else if(c=='%')
            {
                b=pop();
                a=pop();
                push(a%b);
            }
            else if(c=='#')
                stampa();
            else if(c=='s')
            {
                if(pop()%2==0)
                    push(0);
                else
                    push(1);
            }
            idx++;
        }
        return pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }
    public void stampa()
    {
        System.out.println(size);
    }
}
class Main
{
    public static void main(String[] args) {
        Calcolatrice c = new Calcolatrice();
        //1
        System.out.println("\nPunto 1");
        String t1="96+88++98+*";
        String t2="91+9*8*7*6*5*4*3*2*";
        String t3="99*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*99*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*9*";
        System.out.println(c.esegui(t3));
        System.out.println(c.esegui(t1));
        System.out.println(c.esegui(t2));
        
        //2
        System.out.println("\nPunto 2");
        String t4="12-";
        String t5="32/";
        String t6="53%";
        System.out.println(c.esegui(t4));
        System.out.println(c.esegui(t5));
        System.out.println(c.esegui(t6));
        //3
        System.out.println("\nPunto 3");
        String t7="32+##";
        System.out.println(c.esegui(t7));
        //5
        System.out.println("\nPunto 5");
        String t8="2s";
        System.out.println(c.esegui(t8));
        //6
        /*System.out.println("\nPunto 6");
        String t9="";
        System.out.println(c.esegui(t9));*/

    }
}
