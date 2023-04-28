package Lezione4T;
import java.util.Scanner;

public class Lezione4T {
    int a;
    String s;
    public void setA(int a)
    {
        this.a=a;
    }
    public void setS(String s)
    {
        this.s=s;
    }
    public String getAS()
    {
        return "Hai inserito "+s+" "+a;
    }
    public static void main(String[] args) {
    int a=-10;
    //assert a>=0: "Errore a<0";
    //le code sono leggermente più difficili degli stack, perchè il pop si fa da sinistra e il push da destra
    /* Quindi possiamo o spostare tutti gli elementi a sx dopo il pop o usare due indici start ed end che quando si incontrano significa
       che la coda è piena.
    */
    //provare gli scanner
    Lezione4T obj1= new Lezione4T();
    Scanner input= new Scanner(System.in);
    System.out.println("Inserisci un numero");
    obj1.setA(input.nextInt());
    input.nextLine();
    System.out.println("Inserisci una frase");
    obj1.setS(input.nextLine());
    System.out.println(obj1.getAS());
    
    }
}
