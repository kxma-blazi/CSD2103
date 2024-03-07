package tree;
import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    private TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            // คำอธิบาย: ถ้าข้อมูลน้อยกว่าค่าในโหนดปัจจุบัน
            // ให้แทรกไปทางซ้ายของโหนด
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            // คำอธิบาย: ถ้าข้อมูลมากกว่าค่าในโหนดปัจจุบัน
            // ให้แทรกไปทางขวาของโหนด
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            // คำอธิบาย: ท่องในลำดับ In-order คือ
            // 1. ท่องไปทางซ้าย
            // 2. แสดงค่าในโหนดปัจจุบัน
            // 3. ท่องไปทางขวา
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}

public class BinaryTreeOneDimensional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the binary tree: ");
        int height = scanner.nextInt();

        BinaryTree tree = new BinaryTree();

        System.out.println("Enter data for each level:");

        for (int level = 1; level <= height; level++) {
            System.out.print("Level " + level + ": ");
            for (int i = 0; i < Math.pow(2, level - 1); i++) {
                int data = scanner.nextInt();
                tree.insert(data);
            }
        }

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal();
    }
}