package Lezione5L;


public class main {
    public static void main(String[] args) {
        PilaDinamica l= new PilaDinamica();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(5);
        l.push(5);
        l.push(3);
        l.push(3);
        l.push(4);

        int []v=l.toArray();
        for(int i=0;i<v.length;i++)
        {
            System.out.println(i+" -> "+v[i]);
        }


        Node filtro1=l.fromTo(5, 5);
        Node filtro=filtro1;
        System.out.print("[ ");
        while(filtro!=null)
        {
            System.out.print(filtro.getElem()+" ");
            filtro=filtro.getNext();
        }
        System.out.print("]\n");


        Node filtro2=l.fromTo(0, 10);
        /*Node agg = new Node(2, null);
        filtro1.setNext(agg);*/


        System.out.println("Occorrenze di x: "+l.occurrences(filtro1, 3));

        System.out.println("Q inclusa in P? "+l.included(filtro2, filtro1));





        
        
        
        
        
        

    }
}
