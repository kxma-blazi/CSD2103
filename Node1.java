package work.CSD2103;
// ตัวอย่างโปรเเกรมเชื่อมโหนด
public class Node1 {
    public static void main(String[] args) {
        IntegerNode head;
        IntegerNode n1 = new IntegerNode(42);
        IntegerNode n2 = new IntegerNode(-3);
        IntegerNode n3 = new IntegerNode(17);
        IntegerNode n4 = new IntegerNode(9);
        head = n1;
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(null);
    }
}