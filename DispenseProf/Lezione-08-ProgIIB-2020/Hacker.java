//Hacker.java (Vediamo come aggirare i divieti di scrittura)
public class Hacker {
    public static void main(String[] args) {
        System.out.println("Definisco Fido e Bobi");
        CoppiaAnimali c = new CoppiaAnimali("Fido", 3, 5.0, "Bobi", 2, 4.0);
        System.out.println(c);
        System.out.println("Chiedo una copia dell'indirizzo di Fido");
        Animale f = c.getPrimo();
        System.out.println("Anche con una copia dell'indirizzo posso modificare Fido");
        System.out.println("Invece non si puo' modificare Fido se getPrimo da' un clone");
        f.setNome("X");
        System.out.println(c);
        System.out.println("f viene modificato in ogni caso");
        System.out.println(f);
    }
}