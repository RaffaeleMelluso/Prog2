//GenericPair.java
public class GenericPair<T, S> {
    private T first;
    private S second;

    /* Dobbiamo chiamare il costruttore GenericPair, senza <T,S>*/
    public GenericPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // Il metodo toString() appartiene a qualunque classi T, U
    // quindi puo' essere usato
    public String toString() {
        return "(" + first.toString() + "," + second.toString() + ")";
    }
}
