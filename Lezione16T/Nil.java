public class Nil extends List
{
    public boolean empty(){
        return true;
    }
    public int size(){
        return 0;
    }
    public boolean contains(int x){
        return false;
    }
    public abstract List insert(int x){
        return new Cons(elem, this); 
            /*Nil è la classe che crea un oggetto vuoto
            usando this passiamo l'oggetto implicito alla classe
            senza creare un nuovo oggetto risparmiando memoria*/
    }
    public abstract List append(List l){
        return l;
    }
    public String toString(){
        
    }
}