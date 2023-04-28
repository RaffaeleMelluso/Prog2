abstract class Tree {
    public abstract Tree insert(int elem);
}

class Leaf extends Tree {
    public Tree insert(int elem) {
        return new Branch(elem, this, this);
    }
}

class Branch extends Tree {
    private int elem;
    private Tree left;
    private Tree right;

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public Tree insert(int elem) {
        System.out.println("CHECK POINT 2");
        if (elem < this.elem) left = left.insert(elem);
        else if (elem > this.elem) right = right.insert(elem);
        return this;
    }
}


public class Esercizio4 {
    public static void main(String[] args) {
        Tree t = new Leaf();
        t = t.insert(3);
        t = t.insert(1);
        t = t.insert(4);
        t = t.insert(2);
        System.out.println("CHECK POINT 1");
    }
}
