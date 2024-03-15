package work.CSD2103;

class TestIntegerNode {
    public static void main(String[] args)
    {   IntegerNode list = new IntegerNode(10, new IntegerNode(20));
        list = new IntegerNode(30, list);
       
        IntegerNode current = list;
        while (current != null){
            System.out.println(current.getItem());
            current = current.getNext();
        }

        IntegerNode list1 = new IntegerNode(100);
        System.out.println(list1.getNext());
        list1 = new IntegerNode(200, list1);
        list1.getNext().setNext(new IntegerNode(300));

        current = list1;
        while (current != null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
       
    }
}
