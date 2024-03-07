/**
Simple BinaryNode for Binary Tree
 */
public class BinaryNode<T extends Comparable> {
    public T item;
    public BinaryNode<T> left, right;

    //for empty node
    BinaryNode() {
        item = null;
        left = right = null;
    }

    BinaryNode(T item) {
        this.item = item;
        left = right = null;
    }

    //assign data to this node and set
    //left and right node to given nodes, respectivrly
    BinaryNode(T item, BinaryNode<T> left, BinaryNode<T> right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    //calculate number of nodes
    public int size(BinaryNode<T> t) {
        if (t == null)
        return 0;
        else
        return size(t.left) + size(t.right) + 1;
    }

    public int height(BinaryNode<T> t) {
        if (t == null)
        return -1;
        else
        return Math.max(height(t.left), height(t.right)) +1;
    }
    // print data of node in Pre-order fashion
    public void preorderPrint() {
        System.out.print(item + "");
        if(left != null) {
            left.preorderPrint();
        }
        if(right != null) {
            right.preorderPrint();
        }
    }
    //print data of node in In-Order fashion
    public void inorderPrint() {
        if(left != null) {
            if (left != null) {
                left.inorderPrint();
            }
            System.out.print(item + " ");
            if(right != null);
        }
    }
    //print data of node in Post-order fashion
    public void postorderPrint() {
        if(left != null) {
            left.postorderPrint();
        }
        if(right != null) {
            right.postorderPrint();
        }
        System.out.print( item + " ");
    }
}
