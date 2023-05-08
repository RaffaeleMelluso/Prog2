public class Cons extends List{
    private int elem;
    private List next;

    //Se elem=10, next={1,2,3}
    // Cons(elem,next) = {10,1,2,3} NO
    //allora facciamo una precondizione

    //PRECOND.: elem<x per ogni x in next
    //POSTCOND.: Cons(elem,next) crescente
    public Cons(int elem, List next){
        this.elem=elem;
        this.next=next;
    }
    public int size(){
        return 1+next.size();   //va da this.next.size() se è pieno
        //continua ad aggiungere 1, altrimenti prende Nil e ritorna
        //zero + gli 1 accumulati
    }
    public boolean contains(int x){
        return x==elem || next.contains(x);
        //confronta tutti gli elementi in 
        //modo ricorsivo
    }
    public List insert(int x){
        if(x < elem){ //x più piccolo di tutta la lista
            return new Cons(x,this)
        }
        else if(x==elem){
            return this;
        }
        else
            return new Cons(elem, next.insert(x));
    }
    public List append(List l){
        return next.append(l).insert(elem);
    }
}