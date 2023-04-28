import java.util.*; //Importiamo tutte le Java utilities

//inclusa la classe Random dei generatori di numeri casuali
public class TestGenericStack {

    public static void main(String[] args) {
    // Creiamo uno stack per contenere stringhe
        System.out.println(" ---> Stampo p = {\"hello \", \"world!\"} ");
        /* Al posto di GenericStack<String> posso scrivere GenericStack<> */
        GenericStack<String> p = new GenericStack<>(); //p pila String
        p.push("world!");
        // OK: il metodo push si aspetta un argomento di tipo String
        p.push("hello ");
        System.out.println(p); // stampo 2 strighe
        String s1 = p.pop();
        // OK: il metodo pop ritorna un valore di tipo String
        String s2 = p.pop();
        p.push(s2 + s1); // OK: s2 + s1 produce una nuova stringa
        System.out.println(" ---> Stampo p = {\"hello world!\"} ");
        System.out.println(p);
        // p.push(1);
        // ERRORE: non posso inserire int in uno stack di String
        // Creiamo uno stack per contenere numeri interi.
        // NON e` possibile usare tipi primitivi int, boolean double
        // per istanziare classi generiche, dunque DOBBIAMO usare il tipo
        // Integer (i numeri devono comparire "inscatolati" nello stack)
        System.out.println(" ---> Stampo q = {2,1} ");
        GenericStack<Integer> q = new GenericStack<>(); //q pila Integer
        q.push(1);
        /* OK: il metodo push si aspetta un argomento di tipo Integer, gli
        forniamo un int che puo' essere convertito in Integer grazie
        all'autoboxing */
        q.push(2);
        System.out.println(q);// stampo 2, 1 interi
        q.push(q.pop() + q.pop());
        /* OK: il metodo pop ritorna un Integer da cui Java estrae
        automaticamente un int nel momento in cui vede che usiamo il valore
        per un'operazione primitiva (+) */
        System.out.println(" ---> Stampo q = {2+1} ");
        System.out.println(q); // stampo 3 intero
        // q.push("hello"); // ERRORE: non posso inserire String in
        // uno stack di Integer
        // Inserisco alcuni numeri casuali tra 0 e 1 in una pila s di
        // Double
        Random r = new Random();//r = generatore numeri casuali
        GenericStack<Double> s = new GenericStack<Double>();
        //s pila Double
        //Scelgo a caso la dimensione dello stack, al massimo 20 elementi
        int n = r.nextInt(20);
        //Scelgo a caso ogni elemento dello stack e lo aggiungo a s
        for (int i = 0; i < n; i++)
            s.push(r.nextDouble());
         /* Il metodo toString() ci fornisce una versione stampabile per
        Stack di elementi di tipo arbitrario (ma tutti dello stesso tipo) */
        System.out.println(" ---> ora p e' uno stack di 1 stringa");
        System.out.println(p); // OK: p e' uno Stack di String
        System.out.println(" ---> ora q e' uno stack di 1 Integer");
        System.out.println(q); // OK: q e' uno Stack di Integer
        System.out.println(" ---> s e' uno stack di " + n + " Double");
        System.out.println(s); // OK: s e' uno Stack di Double
    }
}