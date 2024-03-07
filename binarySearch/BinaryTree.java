/**
Simple Binary Tree
 */
class BinaryTree<T extends Comparable> {
    private BinaryNode<T> root;
    //create an empty tree
    BinaryTree() {
        root = null;
    }
    //tree with one node
    BinaryTree(T item) {
        root = new BinaryNode<T>(item, null, null);
    }
    //calculate size of tree
    public int size() {
       return root.size(root);
    }
    //calculate height of tree
    public int height() {
        return root.height(root);
    }
    // make this tree with given data and
    // connect its left and right to the given trees
    public void makeTree(T item, BinaryTree<T> left, BinaryTree<T> right) {
        root = new BinaryNode<T>(item, left.root, right.root);
    }
    // return true if tree is empty
    private boolean empty() {
        if (root == null)
        return true;
        else 
        return false;
    }
    // print data of each node in tree
    public void printBinaryTree() {
        System.out.print("Items in tree: ");
        if(!empty())
            root.postorderPrint();
        else
        System.out.println("Sorry! Tree is emply.");
        System.out.println();
    }
}
