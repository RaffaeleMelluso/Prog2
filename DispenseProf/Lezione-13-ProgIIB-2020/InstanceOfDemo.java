public class InstanceOfDemo {
    public static void main(String[] args) {
        //s,t definiti da costruttore quindi !=null
        Bottiglia a10 = new BottigliaConTappo(10);
        Bottiglia b10 = new Bottiglia(10);
        BottigliaConTappo u = null;
        System.out.println("a10 instanceof BottigliaConTappo = " + (a10 instanceof BottigliaConTappo)); // true
        System.out.println("b10 instanceof BottigliaConTappo = " + (b10 instanceof BottigliaConTappo)); // false
        System.out.println("u=null instanceof BottigliaConTappo = " + (u instanceof BottigliaConTappo)); // false
        System.out.println();
        System.out.println("a10 instanceof Bottiglia = " + (a10 instanceof Bottiglia)); // true
        System.out.println("b10 instanceof Bottiglia = " + (b10 instanceof Bottiglia)); // true
        System.out.println("u=null instanceof Bottiglia = " + (u instanceof Bottiglia)); // false
    }
}
