//TestGenericPair.java
public class TestGenericPair {
    /* Attenzione qui sotto a non scrivere GenericPair al posto di
    GenericPair<S,T> */
    public static <T, S> GenericPair<S, T> inv(GenericPair<T, S> p) {
        return new GenericPair<S, T>(p.getSecond(), p.getFirst());
    }

    public static void main(String[] args) {
    /* Al posto di GenericPair<S,T> posso scrivere GenericPair<>,
    purche' Java sia in grado di dedurre in modo unico i valori di S,T */
        GenericPair<String, Integer> p = new GenericPair<>("pluto", 1);
        // nel seguito, "\t" e' la tabulazione e inserisce spazi bianchi
        System.out.println("p = \t\t\t\t" + p);
        System.out.println("inv(p) = \t\t\t" + inv(p));
        System.out.println("p non cambia: \t" + p);
        //Dato che inv e' un metodo statico, al di fuori della sua classe
        //deve venire chiamato p. es. come:
        // TestGenericPair.<String,Integer>inv(p);
    }
}