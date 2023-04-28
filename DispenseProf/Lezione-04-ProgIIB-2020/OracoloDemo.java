//salveremo tutto nel file: OracoloDemo.java

import java.util.Scanner;

class Oracolo { //classe non eseguibile
    private String vecchiaRisposta = "la risposta e' nel tuo cuore";
    private String nuovaRisposta;
    private String domanda;
    private static Scanner tastiera = new Scanner(System.in);

    public void parla() {
        String continua = "si";
        while (continua.equalsIgnoreCase("si")) {
            System.out.println("Cosa vuoi chiedere?");
            domanda = tastiera.nextLine();
            rispondi();
            aggiorna();
            System.out.println("Vuoi continuare?");
            continua = tastiera.nextLine();
        }
        System.out.println("L'oracolo ora riposa");
    }

    private void rispondi() {
        System.out.println
                ("Avrei bisogno di un suggerimento: cosa mi suggerisci?");
        nuovaRisposta = tastiera.nextLine();
        System.out.println("Hai posto la domanda : " + domanda);
        System.out.println("Ecco la tua risposta : " + vecchiaRisposta);
    }

    private void aggiorna() {
        vecchiaRisposta = nuovaRisposta;
    }
}

public class OracoloDemo {
    // Classe eseguibile pubblica. Salvare in: OracoloDemo.java
    public static void main(String[] args) {
    // Costruiamo un singolo oracolo e iniziamo a parlare con lui
        Oracolo delfi = new Oracolo();
        delfi.parla();
    }
}
