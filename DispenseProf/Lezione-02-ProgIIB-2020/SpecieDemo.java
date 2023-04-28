/**
 * Introduciamo una classe eseguibile SpecieDemo per sperimentare la
 * classe Specie. Proviamo a inserire i dati di una specie sia da
 * tastiera che usando un metodo set. Usando il Java Visualizer, vediamo cosa succede se assegnamo un oggetto a un altro.
 */
public class SpecieDemo {
//Classe eseguibile e pubblica, deve stare in: SpecieDemo.java

    public static void main(String[] args) {
        Specie bufaloTerrestre = new Specie();

        System.out.println("BufaloTerrestre prima inserimento dati \n" +
                bufaloTerrestre);
        //"bufaloTerrestre"  abbrevia "bufaloTerrestre.toString()"

        System.out.println("Inserisci dati BufaloTerrestre");
        bufaloTerrestre.leggiInput();

        System.out.println("Dati inseriti BufaloTerrestre \n" +
                bufaloTerrestre);
        //"bufaloTerrestre"  abbrevia "bufaloTerrestre.toString()"

        System.out.println("BufaloTerrestre dopo 10 anni = "
                + bufaloTerrestre.prediciPopolazione(10));

        Specie bufaloKlingon = new Specie();
        System.out.println("Inserisco dati BufaloKlingon usando set");

        /** Non possiamo assegnare nome, popolazione e tasso di crescita
         direttamente perche' questi attributi sono privati:
         bufaloKlingon.nome = "BK"; //ERRORE! DOBBIAMO SCRIVERE INVECE:*/
        bufaloKlingon.setSpecie("BK", 1000, 10);

        System.out.println("Dati inseriti BufaloKlingon \n" +
                bufaloKlingon);
        System.out.println("Bufalo Klingon dopo 10 anni = "
                + bufaloKlingon.prediciPopolazione(10));

        System.out.println("Identifico Bufalo terrestre e Klingon");
        bufaloTerrestre = bufaloKlingon;
        System.out.println(bufaloTerrestre);
        System.out.println(bufaloKlingon);
    }
}

/** Effetto dell'assegnazione
 bufaloTerrestre = bufaloKlingon;
 1. L'indirizzo di bufaloTerrestre diventa uguale a quello di
 bufaloKlingon. In altre parole, bufaloTerrestre adesso e' un alias
 di bufaloKlingon. Avete visto lo stesso fenomeno quando si assegna
 un array a un altro (ProgI sezione 6.4)
 2. abbiamo l'impressione che i dati del bufaloTerrestre siano
 scomparsi. In realta' sono diventati irraggiungibili: non ho piu' il
 loro indirizzo. Java dopo un poco ricicla le aree di memoria
 irraggiungibili, che a questo punto spariscono davvero (tramite un
 processo che gira in parallelo con il nostro programma, detto Garbage
 Collector). */
