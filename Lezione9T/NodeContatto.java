package Lezione9T;
public class NodeContatto {
    private Contatto elem;
    private NodeContatto next;

    public NodeContatto(Contatto elem, NodeContatto next) {
        this.elem = elem;
        this.next = next;
    }

    public Contatto getElem() {
        return elem;
    }

    public NodeContatto getNext() {
        return next;
    }

    public void setElem(Contatto elem) {
        this.elem = elem;
    }

    public void setNext(NodeContatto next) {
        this.next = next;
    }

}
