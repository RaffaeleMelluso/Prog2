public class CaneDemo { /** abbiamo scritto public class CaneDemo, quindi la classe CaneDemo puo' essere usata da classi in altri files, e deve essere salvata nel file CaneDemo.java */
 //Una classe e' eseguibile se ha un main, come questo:
    public static void main(String[] args) {
        Cane fido = new Cane();
/** Il comando C x = new C(); definisce un nuovo oggetto x di tipo C 
 con valori di default per gli attributi. Nel caso di un cane: null (stringa indefinita), null (stringa indefinita), 0 per gli attributi: nome, razza, anni */

        System.out.println("fido prima inserimento dati");
// stampo i valori di default: null,null,0
        System.out.println(fido);
        System.out.println("Inserisci dati fido");
        fido.leggiInput();
        System.out.println("Dati inseriti fido");
// stampo i valori veri
        System.out.println(fido);
        System.out.println("eta' fido in anni umani  "
                + fido.getEtaInAnniUmani());

        Cane bobi = new Cane(); /** Questo definisce un nuovo cane con
         valori di default null, null, 0 per gli attributi nome, razza, anni*/
        System.out.println("Inserisco dati bobi dentro il programma");
        bobi.nome = "Bobi";
        bobi.razza = "Terrier";
        bobi.anni = 5;
        System.out.println(bobi);
    }
}
