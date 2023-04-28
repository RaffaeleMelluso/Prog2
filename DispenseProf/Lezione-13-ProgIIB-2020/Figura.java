// Graphics = classe del pacchetto awt, con gli oggetti grafici
// JFrame = classe del pacchetto swing, con "finestre" fornite di:
// border + title + close-iconify button
// FIGURA = oggetti con un metodo "draw" per disegnare una figura
// in un oggetto grafico g. Uguale all’unione di tutte le classi
// di figure. Ci consente di definire array di figure prese da
// classi diverse e di disegnarle usando un unico comando draw.
// Figura.java

import java.awt.*; //Abstract Window Toolkit (finestre grafiche)
import javax.swing.*; //estensione di awt per interfacce grafiche

public class Figura {
    // Dichiariamo il metodo di disegno draw ma lo definiamo vuoto:
    // serve solo per ricordarci di definire un metodo draw in ogni
    // sottoclasse della classe Figura.
    public void draw(Graphics g) { /* vuoto */ }
}
