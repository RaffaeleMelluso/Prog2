// TestTree

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        Tree t = new Branch(1,
                new Branch(2,
                        new Leaf(),
                        new Leaf()),
                new Branch(3,
                        new Leaf(),
                        new Branch(72,
                                new Leaf(),
                                new Branch(9,
                                        new Leaf(),
                                        new Leaf()))));
        /* Albero t (radice a sinistra, figli dall’alto in basso). Radice 1,
        figlio sinistro 2, figlio destro 3, che ha figlio destro 72, che ha
        figlio destro 9.

                    /leaf
                 /[2]
                |  \leaf
         ___[1]
                |   /leaf
                 \[3]
                   |   /leaf
                    \[72]
                      |   /leaf
                       \[9]
                          \leaf

        Rappresentazione per livelli dello stesso albero t. Al livello 0
        vediamo 1, al livello 1 vediamo i figli 2 e 3, al livello 2 vediamo
        tre foglie e il nipote 72, al livello 3 vediamo il pronipote 9 e una
        foglia, al livello 4 due foglie. I successivi livelli sono vuoti.

        Livello                  Albero t (radice in alto, figli da sinistra)
        -----------------------------------------------------|--------------- -
        0                                              ______1______
        ----------------------------------------------/-------------\---------
        1                                             2             --3---
        ---------------------------------------------/\------------/------\------
        2                                        leaf leaf       leaf    72
        ----------------------------------------------------------------/--\-----
        3                                                             leaf  9
        --------------------------------------------------------------------/\---
        4                                                               leaf leaf

        t in pre-order: 1 2 3 72 9
        t in in-order: 2 1 3 72 9
        t in post-order: 2 9 72 3 1
        t per livelli: 1 2 3 72 9
        */
        System.out.println("\n L’albero t: \n" + t);
        System.out.println("\n Visita pre-order t:");
        t.preOrder();
        System.out.println("\n Visita in-order t:");
        t.inOrder();
        System.out.println("\n Visita post-order t:");
        t.postOrder();
        System.out.println("\n Visita per livelli t:");
        t.livello();
        System.out.println("\n Foglie per livello t:");
        for (int i = 0; i <= 5; i++)
            System.out.println("t.leavesAt(" + i + ") = " + t.leavesAt(i));
        /* risultato: foglie per livello = 0 0 3 1 2 0 */
    }
}