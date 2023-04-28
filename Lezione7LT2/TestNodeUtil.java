package Lezione7LT2;
/// Test per i metodi della classe NodeUtil
public class TestNodeUtil {
    public static void main(String[] args) 
    {
        //LISTE DI Integer
        Node<Integer> in1 = new Node<>(1,null);
        Node<Integer> in2 = new Node<>(2,in1);
        Node<Integer> in3 = new Node<>(1,in2);
        Node<Integer> in4 = new Node<>(4,in3);
        Node<Integer> im1 = new Node<>(3,null);
        Node<Integer> im2 = new Node<>(1,im1);
        Node<Integer> im3 = new Node<>(3,im2);
        Node<Integer> im4 = new Node<>(2,im3);
        Node<Integer> im5 = new Node<>(3,im4);
        Node<Integer> im6 = new Node<>(1,im5);
        Node<Integer> im7 = new Node<>(4,im6);
        Node<Integer> im8 = new Node<>(3,im7);
        
        
        System.out.println("\n===LISTE DI Integer===");
        System.out.print("Lista1 (con testa in4): ");
        NodeUtil.printList(in4);
        System.out.print("Lista2 (con testa im8): ");
        NodeUtil.printList(im8);
        System.out.println("\n- NodeUtil.size(in4): "+NodeUtil.size(in4));
        System.out.println("- NodeUtil.size(im8): "+NodeUtil.size(im8));
        //System.out.println("\n- NodeUtil.sizeRec(in4): "+NodeUtil.sizeRec(in4));
        //System.out.println("- NodeUtil.sizeRec(im8): "+NodeUtil.sizeRec(im8));
        System.out.println("\n- NodeUtil.occurrences(in4,1): "+NodeUtil.occurrences(in4,1));
        System.out.println("- NodeUtil.occurrences(in4,4): "+NodeUtil.occurrences(in4,4));
        System.out.println("- NodeUtil.occurrences(in4,5): "+NodeUtil.occurrences(in4,5));
        
        /*
        
        
        
        System.out.println("\n- NodeUtil.occurrencesRec(in4,1): "+NodeUtil.occurrencesRec(in4,1));
        System.out.println("- NodeUtil.occurrencesRec(in4,4): "+NodeUtil.occurrencesRec(in4,4));
        System.out.println("- NodeUtil.occurrencesRec(in4,5): "+NodeUtil.occurrencesRec(in4,5));


        */


        System.out.println("\n- NodeUtil.included(in4,im8): "+NodeUtil.included(in4,im8));
        System.out.println("- NodeUtil.included(im8,in4): "+NodeUtil.included(im8,in4));



        /*
        System.out.println("\n- NodeUtil.includedRec(in4,im8): "+NodeUtil.includedRec(in4,im8));
        System.out.println("- NodeUtil.includedRec(im8,in4): "+NodeUtil.includedRec(im8,in4));
        */

        Node<Integer> irevList = NodeUtil.reverse(in4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo iterativo): ");
        NodeUtil.printList(irevList);
        irevList = NodeUtil.reverse(im8);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo iterativo): ");
        NodeUtil.printList(irevList);
        
        /*
        irevList = NodeUtil.reverseRec(in4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(irevList);
        irevList = NodeUtil.reverseRec(im8);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(irevList); 
        */




        
        System.out.println("\n\n===LISTA DI LISTE DI Integer===");
        Node<Node<Integer>> ill1 = new Node<>(im8,null);
        Node<Node<Integer>> ill2 = new Node<>(in4,ill1);
        Node<Node<Integer>> ill3 = new Node<>(null,ill2);
        System.out.print("Lista di liste di Integer: [\n");
        for(Node<Node<Integer>> p = ill3;p!=null;p=p.getNext()) {
            System.out.print("\n");
            NodeUtil.printList(p.getElem());
        }
        System.out.println("]");
        Node<Integer> cardList = NodeUtil.listOfListsSizes(ill3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo iterativo): ");
        NodeUtil.printList(cardList);


        /*
        cardList = NodeUtil.listOfListsSizesRec(ill3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(cardList);

        */

        /*
       
        //LISTE DI Double
        Node<Double> dn1 = new Node<>(1.0,null);
        Node<Double> dn2 = new Node<>(2.0,dn1);
        Node<Double> dn3 = new Node<>(1.0,dn2);
        Node<Double> dn4 = new Node<>(4.0,dn3);
        
        Node<Double> dm1 = new Node<>(3.14,null);
        Node<Double> dm2 = new Node<>(1.2,dm1);
        Node<Double> dm3 = new Node<>(3.14,dm2);
        
        System.out.println("\n\n===LISTE DI Double===");
        System.out.print("Lista1 (con testa dn4): ");
        NodeUtil.printList(dn4);
        System.out.print("Lista2 (con testa dm3): ");
        NodeUtil.printList(dm3);
        System.out.println("\n- NodeUtil.size(dn4): "+NodeUtil.size(dn4));
        System.out.println("- NodeUtil.size(dm3): "+NodeUtil.size(dm3));
        System.out.println("\n- NodeUtil.sizeRec(dn4): "+NodeUtil.sizeRec(dn4));
        System.out.println("- NodeUtil.sizeRec(dm3): "+NodeUtil.sizeRec(dm3));
        System.out.println("\n- NodeUtil.occurrences(dn4,1.0): "+NodeUtil.occurrences(dn4,1.0));
        System.out.println("- NodeUtil.occurrences(dn4,2.0): "+NodeUtil.occurrences(dn4,2.0));
        System.out.println("- NodeUtil.occurrences(dn4,5.0): "+NodeUtil.occurrences(dn4,5.0));
        
        System.out.println("\n- NodeUtil.occurrencesRec(dn4,1.0): "+NodeUtil.occurrencesRec(dn4,1.0));
        System.out.println("- NodeUtil.occurrencesRec(dn4,2.0): "+NodeUtil.occurrencesRec(dn4,2.0));
        System.out.println("- NodeUtil.occurrencesRec(dn4,5.0): "+NodeUtil.occurrencesRec(dn4,5.0));
        
        System.out.println("\n- NodeUtil.included(dn4,dm3): "+NodeUtil.included(dn4,dm3));
        System.out.println("- NodeUtil.included(dm3,dn4): "+NodeUtil.included(dm3,dn4));
        
        System.out.println("\n- NodeUtil.includedRec(dn4,dm3): "+NodeUtil.includedRec(dn4,dm3));
        System.out.println("- NodeUtil.includedRec(dm3,dn4): "+NodeUtil.includedRec(dm3,dn4));
        
        Node<Double> drevList = NodeUtil.reverse(dn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo iterativo): ");
        NodeUtil.printList(drevList);
        drevList = NodeUtil.reverse(dm3);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo iterativo): ");
        NodeUtil.printList(drevList);
        
        drevList = NodeUtil.reverseRec(dn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(drevList);
        drevList = NodeUtil.reverseRec(dm3);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(drevList);
        
        System.out.println("\n\n===LISTA DI LISTE DI Double===");
        Node<Node<Double>> dll1 = new Node<>(dm3,null);
        Node<Node<Double>> dll2 = new Node<>(dn4,dll1);
        Node<Node<Double>> dll3 = new Node<>(null,dll2);
        System.out.print("Lista di liste di Double: [\n");
        for(Node<Node<Double>> p = dll3;p!=null;p=p.getNext()) {
            System.out.print("\t");
            NodeUtil.printList(p.getElem());
        }
        System.out.println("]");
        cardList = NodeUtil.listOfListsSizes(dll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo iterativo): ");
        NodeUtil.printList(cardList);
        cardList = NodeUtil.listOfListsSizesRec(dll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(cardList);
        
        //LISTE DI String
        Node<String> sn1 = new Node<>("qua",null);
        Node<String> sn2 = new Node<>("quo",sn1);
        Node<String> sn3 = new Node<>("qui",sn2);
        Node<String> sn4 = new Node<>("paperino",sn3);
        
        Node<String> sm1 = new Node<>("minnie",null);
        Node<String> sm2 = new Node<>("clarabella",sm1);
        Node<String> sm3 = new Node<>("paperina",sm2);
        
        System.out.println("\n\n===LISTE DI String===");
        System.out.print("Lista1 (con testa sn4): ");
        NodeUtil.printList(sn4);
        System.out.print("Lista2 (con testa sm3): ");
        NodeUtil.printList(sm3);
        System.out.println("\n- NodeUtil.size(sn4): "+NodeUtil.size(sn4));
        System.out.println("- NodeUtil.size(sm3): "+NodeUtil.size(sm3));
        System.out.println("\n- NodeUtil.sizeRec(sn4): "+NodeUtil.sizeRec(sn4));
        System.out.println("- NodeUtil.sizeRec(sm3): "+NodeUtil.sizeRec(sm3));
        System.out.println("\n- NodeUtil.occurrences(sn4,\"qui\"): "+NodeUtil.occurrences(sn4,"qui"));
        System.out.println("- NodeUtil.occurrences(sn4,\"pippo\"): "+NodeUtil.occurrences(sn4,"pippo"));
        System.out.println("- NodeUtil.occurrences(sn4,\"paperino\"): "+NodeUtil.occurrences(sn4,"paperino"));
        
        System.out.println("\n- NodeUtil.occurrencesRec(sn4,\"qui\"): "+NodeUtil.occurrencesRec(sn4,"qui"));
        System.out.println("- NodeUtil.occurrencesRec(sn4,\"pippo\"): "+NodeUtil.occurrencesRec(sn4,"pippo"));
        System.out.println("- NodeUtil.occurrencesRec(sn4,\"paperino\"): "+NodeUtil.occurrencesRec(sn4,"paperino"));
        
        System.out.println("\n- NodeUtil.included(sn4,sm3): "+NodeUtil.included(sn4,sm3));
        System.out.println("- NodeUtil.included(sm3,sn4): "+NodeUtil.included(sm3,sn4));
        
        System.out.println("\n- NodeUtil.includedRec(sn4,dm3): "+NodeUtil.includedRec(sn4,sm3));
        System.out.println("- NodeUtil.includedRec(sm3,sn4): "+NodeUtil.includedRec(sm3,sn4));
        
        Node<String> srevList = NodeUtil.reverse(sn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo iterativo): ");
        NodeUtil.printList(srevList);
        srevList = NodeUtil.reverse(sm3);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo iterativo): ");
        NodeUtil.printList(srevList);
        
        srevList = NodeUtil.reverseRec(sn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(srevList);
        srevList = NodeUtil.reverseRec(sm3);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(srevList);
        
        System.out.println("\n\n===LISTA DI LISTE DI String===");
        Node<Node<String>> sll1 = new Node<>(sm3,null);
        Node<Node<String>> sll2 = new Node<>(sn4,sll1);
        Node<Node<String>> sll3 = new Node<>(null,sll2);
        System.out.print("Lista di liste di String: [\n");
        for(Node<Node<String>> p = sll3;p!=null;p=p.getNext()) {
            System.out.print("\t");
            NodeUtil.printList(p.getElem());
        }
        System.out.println("]");
        cardList = NodeUtil.listOfListsSizes(sll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo iterativo): ");
        NodeUtil.printList(cardList);
        cardList = NodeUtil.listOfListsSizesRec(sll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(cardList);
        
        //LISTE DI Person
        Person p1 = new Person("Mario","Rossi");
        Person p2 = new Person("Luisa","Verdi");
        Person p3 = new Person("Carla","Bianchi");
        Node<Person> pn1 = new Node<>(p1,null);
        Node<Person> pn2 = new Node<>(p2,pn1);
        Node<Person> pn3 = new Node<>(p3,pn2);
        Node<Person> pn4 = new Node<>(p3,pn3);
        
        Person p4 = new Person("Gino","Gialli");
        Person p5 = new Person("Paola","Indaco");
        Node<Person> pm1 = new Node<>(p4,null);
        Node<Person> pm2 = new Node<>(p5,pm1);
        
        System.out.println("\n\n===LISTE DI Person===");
        System.out.print("Lista1 (con testa pn4): ");
        NodeUtil.printList(pn4);
        System.out.print("Lista2 (con testa pm2): ");
        NodeUtil.printList(pm2);
        System.out.println("\n- NodeUtil.size(pn4): "+NodeUtil.size(pn4));
        System.out.println("- NodeUtil.size(pm2): "+NodeUtil.size(pm2));
        System.out.println("\n- NodeUtil.sizeRec(pn4): "+NodeUtil.sizeRec(pn4));
        System.out.println("- NodeUtil.sizeRec(pm2): "+NodeUtil.sizeRec(pm2));
        System.out.println("\n- NodeUtil.occurrences(pn4,p1): "+NodeUtil.occurrences(pn4,p1));
        System.out.println("- NodeUtil.occurrences(pn4,p2): "+NodeUtil.occurrences(pn4,p2));
        System.out.println("- NodeUtil.occurrences(pn4,p3): "+NodeUtil.occurrences(pn4,p3));//Stampa 2 in quanto
                                //la persona p3 compare due volte nella lista la cui testa è pn4
        System.out.println("- NodeUtil.occurrences(pn4,new Person(\"Carla\",\"Bianchi\")): "
                        +NodeUtil.occurrences(pn4,new Person("Carla","Bianchi")));//Stampa 0 in quanto
                        //il metodo NodeUtil.occurrences(...) è basato sull'implementazione
                        //di default del metodo equals(...) di Java, il quale considera uguali due
                        //oggetti se e solo se sono lo stesso oggetto. Questo criterio di uguaglianza
                        //è adatto in questo contesto in cui si confrontano oggetti di tipo
                        //Person, in quanto due persone p1 e p2 sono uguali se e solo se
                        //sono la stessa persona (e non, ovviamente, se sono due persone diverse,
                        //anche se omonime)
        System.out.println("\n- NodeUtil.occurrencesRec(pn4,p1): "+NodeUtil.occurrencesRec(pn4,p1));
        System.out.println("- NodeUtil.occurrencesRec(pn4,p2): "+NodeUtil.occurrencesRec(pn4,p2));
        System.out.println("- NodeUtil.occurrencesRec(pn4,p3): "+NodeUtil.occurrencesRec(pn4,p3));//Stampa 2 in quanto
                                //la persona p3 compare due volte nella lista la cui testa è pn4
        System.out.println("- NodeUtil.occurrencesRec(pn4,new Person(\"Carla\",\"Bianchi\")): "
                        +NodeUtil.occurrencesRec(pn4,new Person("Carla","Bianchi")));//Stampa 0 in quanto
                        //il metodo NodeUtil.occurrences(...) è basato sull'implementazione
                        //di default del metodo equals(...) di Java, il quale considera uguali due
                        //oggetti se e solo se sono lo stesso oggetto. Questo criterio di uguaglianza
                        //è adatto in questo contesto in cui si confrontano oggetti di tipo
                        //Person, in quanto due persone p1 e p2 sono uguali se e solo se
                        //sono la stessa persona (e non, ovviamente, se sono due persone diverse,
                        //anche se omonime)
        System.out.println("\n- NodeUtil.included(pn4,pm2): "+NodeUtil.included(pn4,pm2));
        System.out.println("- NodeUtil.included(pm2,pn4): "+NodeUtil.included(pm2,pn4));
        
        System.out.println("\n- NodeUtil.includedRec(pn4,pm2): "+NodeUtil.includedRec(pn4,pm2));
        System.out.println("- NodeUtil.includedRec(pm2,pn4): "+NodeUtil.includedRec(pm2,pn4));
        
        Node<Person> prevList = NodeUtil.reverse(pn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo iterativo): ");
        NodeUtil.printList(prevList);
        prevList = NodeUtil.reverse(pm2);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo iterativo): ");
        NodeUtil.printList(prevList);
        
        prevList = NodeUtil.reverseRec(pn4);
        System.out.println("\n- Inversa di Lista1 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(prevList);
        prevList = NodeUtil.reverseRec(pm2);
        System.out.println("\n- Inversa di Lista2 (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(prevList);
        
        System.out.println("\n\n===LISTA DI LISTE DI Person===");
        Node<Node<Person>> pll1 = new Node<>(pm2,null);
        Node<Node<Person>> pll2 = new Node<>(pn4,pll1);
        Node<Node<Person>> pll3 = new Node<>(null,pll2);
        System.out.print("Lista di liste di Person: [\n");
        for(Node<Node<Person>> p = pll3;p!=null;p=p.getNext()) {
            System.out.print("\t");
            NodeUtil.printList(p.getElem());
        }
        System.out.println("]");
        cardList = NodeUtil.listOfListsSizes(pll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo iterativo): ");
        NodeUtil.printList(cardList);
        cardList = NodeUtil.listOfListsSizesRec(pll3);
        System.out.println("\n- Lista di cardinalita' di liste (prodotta con metodo ricorsivo): ");
        NodeUtil.printList(cardList);
        */
    }
    
    
}
