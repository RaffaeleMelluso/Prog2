// GenericNode.java
public class GenericNode<T> { /* Attenzione qui sotto a non scrivere
    GenericNode al posto di GenericNode<T> */
    private T elem;
    private GenericNode<T> next;

    public GenericNode(T elem, GenericNode<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setElem() {
        this.elem = elem;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}
