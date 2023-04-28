abstract class List {public abstract List reverse(List prev);}

class Nil extends List {public List reverse(List prev) 
{System.out.println( "CHECK POINT 2"); return prev;}}

class Cons extends List {private int elem;private List next;
public Cons(int elem, List next) {this.elem = elem;this.next = next;}
public List reverse(List prev) 
{List next = this.next;this.next = prev;return next.reverse(this);}}

public class Esercizio4 {public static void main(String[] args) {
List l = new Cons(1, new Cons(2, new Nil()));
System.out.println( "CHECK POINT 1"); 
l = l.reverse(new Nil());}}
