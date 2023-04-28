/**
 * DEMO LISTE CONCATENATE. Definiamo una rappresentazione
 * MiniLinkedList
 * di un vettore l attraverso una lista di nodi l_0, ..., l_(size-1),
 * ognuno dei quali punta al successivo. Definiamo operazioni
 * l.get(i) = contenuto di l_i
 * l.set(i,x) che assegna l_i al valore x
 * l.add(i,x) che aggiunge un nodo di contenuto x tra l_i e l_(i+1)
 * l.remove(i.x) che cancella l_i dalla lista
 * Controlliamo il buon funzionamento di MiniLinkedList
 */

public class TestMiniLinkedList {
    public static void main(String[] args) {
        MiniLinkedList l = new MiniLinkedList();
        int n = 10;

        //Definisco una lista l = {9,8,7,6,5,4,3,2,1,0} aggiungendo 0,1,2,3,4,5,6,7,8,9
        //sempre in posizione 0, dunque ogni elemento davanti ai precedenti
        for (int i = 0; i < n; i++)
            l.add(0, i);

        for (int i = 0; i < n; i++)
            System.out.println(l.get(i));

        //Cancello il settimo elemento, cioe' il terzo dal fondo: il 2
        System.out.println("l.remove(7) = " + l.remove(7));

        //Stampo gli n-1 elementi rimasti, raggiunti con il metodo get
        for (int i = 0; i < n - 1; i++)
            System.out.println(l.get(i));
        //Dunque stampo: 9,8,7,6,5,4,3,1,0
        //Questa stampa avviene in modo poco efficiente:
        //ogni get(i) ripercorre l'intera lista, anziche' continuare dal posto i-1
    }

}
