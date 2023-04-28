//FrazioneDemo.java (classe per esperimenti su frazioni)
public class FrazioneDemo {
    public static void main(String[] args) {
        Frazione t = new Frazione(2, 3), u = new Frazione(1, 6),
                v = new Frazione(1, 6); //t=2/3, u=1/6, v=1/6
        System.out.println("t,u,v valgono");
        System.out.println(t + "\n" + u + "\n" + v);
        //t+u+v=(2/3)+(1/6)+(1/6)=((4+1+1)/6)=(6/6)=1
        System.out.println("t+u+v deve fare 1:");
        Frazione w = (t.somma(u)).somma(v);
        System.out.println(w);
        //t*u*v=((2*1*1)/(3*6*6))=(2/108)=(1/54)
        System.out.println("t*u*v deve fare (1/54)");
        Frazione z = (t.prodotto(u)).prodotto(v);
        System.out.println(z);
    }
}