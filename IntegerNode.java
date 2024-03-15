package work.CSD2103;
// For My Class
public class IntegerNode {
    private int item;
    private IntegerNode next;
    public IntegerNode(int item) { //Overloading Feature 
        this.item = item;
        this.next = null;
    }
    public IntegerNode(int item, IntegerNode next) {
        this.item = item;
        this.next = next;   //End Overloading Feature
    }
    public void setNext(IntegerNode nextNode) {
        next = nextNode;
    }
    public IntegerNode getNext() {
        return next;
    }
    public int getItem() {
        return item;
    }
    public void setItem(int item){
        this.item = item;
    }
}