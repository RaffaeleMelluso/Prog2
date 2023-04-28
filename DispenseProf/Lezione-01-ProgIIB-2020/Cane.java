import java.util.Scanner; //Usiamo la classe Scanner (java utility)

class Cane /* Classe non pubblica, utilizzabile solo all'interno dello stesso file. Le classi iniziano con la maiuscola */ {
    public String nome;
    public String razza;
    public int anni;
    /**
     * Metodi dinamici public: se senza argomenti, si scrivono
     * public tipo metodo(){... ...}
     * Variabili e metodi iniziano con la minuscola, se uniamo piu' parole dalla seconda in poi iniziano con la maiuscola. Es.: leggiInput()
     * Dentro il metodo indichiamo con this il cane a cui invieremo il metodo.
     */

    Scanner tastiera = new Scanner(System.in);
    /**
     * Definisco un nuovo oggetto "tastiera" di tipo Scanner, capace di
     * tradurre un input in caratteri, inviato da tastiera, nella sua
     * rappresentazione Java. Il metodo nextLine(); se inviato a "tastiera"
     * richiede una riga di input da tastiera e restituisce una stringa.
     */

    public void leggiInput() //metodo dinamico: chiediamo a un cane
//di assumere nome, razza e eta' che gli inviamo da tastiera
    {
        System.out.println(" nome = ");
        this.nome = tastiera.nextLine(); //nome cane che riceve il metodo
        System.out.println(" razza = ");
        this.razza = tastiera.nextLine(); //razza cane che riceve il metodo
        System.out.println(" anni = ");
        this.anni = tastiera.nextInt(); //eta'  cane che riceve il metodo
        tastiera.nextLine();/* consumo il return dopo il numero anni */
    }

    public String toString()/* metodo dinamico: chiediamo a un cane
di fornire una stringa contenente i suoi dati. Possiamo abbreviare this.nome con nome, eccetera. Ogni "\n" va a capo. */ {
        return " nome  = " + nome + "\n razza = " + razza +
                "\n anni = " + anni;
    }

    public int getEtaInAnniUmani() {//metodo dinamico: chiediamo a un
//cane di mandarci i suoi anni trasformati in anni corrispondenti 
//per l'uomo. Conto 11 anni ciascuno i primi due anni del cane, 
//conto 5 anni ogni altro anno 
        if (anni <= 2)
            return anni * 11;
        else
            return 22 + (anni - 2) * 5;
    }
}

