public class Node<T> {
    private T elem;
    private Node<T> next;

    public Node(T elem, Node<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public T getElem() {
        return this.elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}