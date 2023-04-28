package Lezione2L;
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack s = new Stack(3), t = new Stack(3);
        s.push(10); 
        s.push(20); 
        s.push(30);
        
        System.out.println("s = {10,20,30} e' pieno e diverso da t che e' vuoto");
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));

        System.out.println("Eliminando uno dopo l'altro gli elementi in s otteniamo: ");
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());
        System.out.println(" s.pop() = " + s.pop());

        System.out.println("Adesso s e' vuoto e uguale a t");
        System.out.println(" s.full() = " + s.full());
        System.out.println(" s.empty() = " + s.empty());
        System.out.println(" s.equals(t) = " + s.equals(t));
    }
}