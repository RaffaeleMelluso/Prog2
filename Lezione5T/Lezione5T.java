package Lezione5T;
public class Lezione5T {
    public static /*assegna a tutti gli oggetti della classe lo stesso indirizzo */ final /* non può essere modificato */ int DIMENSIONE = 120;
    String [] Array = new String[DIMENSIONE];
    private static void ciao() /* i metodi statici non hanno this dato che non accedono alla memoria */
    {
        System.out.println("Ciao"); /*posso chiamare solo metodi statici in metodi statici */
        int i=dinamico(2); /*da errore perchè dinamico è un metodo dinamico*/
    }
    private int dinamico(int i)
    {
        i=i+1;
        return i;

    }
    public static void main(String[] args) {
        
    }
}
