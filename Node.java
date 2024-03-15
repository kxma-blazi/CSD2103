package work.CSD2103;

public class Node {
    public static void main(String[] args) {
        IntegerNode head;
        IntegerNode n1 = new IntegerNode(10);
        IntegerNode n2 = new IntegerNode(20);// null
        IntegerNode n3 = new IntegerNode(30);
        IntegerNode n4 = new IntegerNode(10);
        IntegerNode n5 = new IntegerNode(20);// null
        head = n1;
        n1.setNext(n2);
        n2.setNext(null);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(null);
    }
}
