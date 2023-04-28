interface I {
    public void m1(J obj);
}

interface J {
    public void m2();
}

abstract class C implements I {
    public abstract void m1(J obj);
}

class D extends C implements J {
    public void m1(J obj) {
        if (this != obj) obj.m2();
        System.out.println("D.m1");
    }

    public void m2() {
        System.out.println("D.m2");
        m1(this);
    }
}

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println(" Domanda 2");
        I obj2 = new D(); //D inclusa in I: downcast compila
        ((D) obj2).m2(); //D inclusa in I: downcast corretto
        /*Risultato: D.m2 D.m1 */
        System.out.println(" Domanda 3");
        J obj3 = new D();//D inclusa in J: downcast compila
        C x = (C) obj3; //J, C hanno D in comune: downcast compila
        x.m1(new D()); //Durante esecuzione x in D: downcast eseguito

        /*Risultato:
         D.m2 // chiamata di m1 a m2: il resto di m1 e' in sospeso
         D.m1 // chiamata di m2 a m1: m1 si trova sullo stack due volte
         D.m1 // fine prima delle chiamate di m1 in sospeso
        */
         /* System.out.println( " Domanda 4");
         C obj4 = new D();
         obj4.m1(obj4); */
         /* Risposta. obj4, per essere inserito come argomento di m1,
        dovrebbe avere un tipo apparente che si converte a J, ma obj4 ha un
        tipo apparente C, che si converte ad I, ma non si converte a J.
        Compilando, si ottiene l’errore:
         no suitable method found for m1(C)
         method I.m1(J) is not applicable
         (argument mismatch; C cannot be converted to J)
         method C.m1(J) is not applicable
         (argument mismatch; C cannot be converted to J)
        Se invece si scrive obj4.m1((J)obj4); l’istruzione e' corretta: C, J
        hanno una classe D in comune, e durante l’esecuzione obj4 sta in D
        */
    }
}