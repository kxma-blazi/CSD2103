package work.CSD2103;

public class IntegerNode2 {
    private Object element;
    private Node next;

    public Node () {
        this(null, null);
    }

    public Node (Object e, Node n) {
        element = e;
        next = n;
    }

    Object getElement() {
        return element
    }

    Node getNext() {
        return next;
    }

    void setElement (Object newElem) {
        element = newElem;
    }

    void setNext (Node newNext) {
        next = newNext;
    }
} 

