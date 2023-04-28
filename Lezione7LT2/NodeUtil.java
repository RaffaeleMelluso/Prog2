package Lezione7LT2;

public class NodeUtil {
    
    public static <T> int size(Node <T> p)
    {
        int c=0;
        while(p!=null)
        {
            p=p.getNext();
            c++;
        }
        return c;
    }
    public static <T> int occurrences(Node<T> p, T x)
    {
        int c=0;
        while(p.getNext()!=null)
        {
            if(x.equals(p.getElem()))
                c++;
            p=p.getNext();
        }
        return c;
    }
    public static <T> boolean included(Node<T> p, Node<T> q)
    {
        while(p!=null && q!=null)
        {
            if(p.getElem()==q.getElem())
                p=p.getNext();
            q=q.getNext();
        }
        return (p==null)?true:false;
    }
    public static <T> Node <T> reverse(Node<T> p){
        Node<T> q = null;
        while (p != null) {
            q = new Node <T> (p.getElem(), q);
            p = p.getNext();
        }
        return q;
    }

    public static <T> void printList(Node<T> p)
    {
        int i=0;
        while(p!=null)
        {
            System.out.println("["+i+"]"+" -> " + p.getElem());
            i++;
            p=p.getNext();
        }
    }


    public static <T> Node <Integer> listOfListsSizes(Node<Node<T>> p)
    {
        Node<Integer> ret=null;
        while(p!=null)
        {
            Node <T> tmp = p.getElem();
            ret=new Node<>(NodeUtil.size(tmp), ret);
            p=p.getNext();
        }
        return reverse(ret);

    }

}
