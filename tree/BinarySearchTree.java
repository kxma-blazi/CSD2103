package tree;
import java.util.*;

// สร้างคลาส TreeNode สำหรับแทนโหนดใน Binary Tree
class TreeNode {
    int data; // ข้อมูลในโหนด
    TreeNode left; // ลิงค์ไปยังโหนดลูกทางซ้าย
    TreeNode right; // ลิงค์ไปยังโหนดลูกทางขวา

    // คอนสตรักเตอร์ของ TreeNode รับค่าข้อมูลและกำหนดลิงค์เริ่มต้นเป็น null
    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root; // โหนดรากของต้นไม้

    // คอนสตรักเตอร์ของคลาส BinarySearchTree
    public BinarySearchTree() {
        root = null;
    }

    // เมธอดสำหรับเพิ่มโหนดในต้นไม้
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // เมธอดเพิ่มโหนดในต้นไม้แบบที่รับค่า root ปัจจุบันและข้อมูลที่ต้องการเพิ่ม
    private TreeNode insertRec(TreeNode root, int data) {
        // ถ้าต้นไม้ว่างให้สร้างโหนดใหม่และส่งคืน
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // นำข้อมูลไปเขียนลงในต้นไม้ตามเงื่อนไขของ Binary Search Tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // เมธอดสำหรับแสดงผล In-order traversal ของต้นไม้
    public void inorder() {
        inorderRec(root);
    }

    // เมธอดที่ทำ In-order traversal แบบลูกซ้าย-ราก-ลูกขวา
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        System.out.print("ป้อนความสูงของต้นไม้: ");
        int height = scanner.nextInt();

        System.out.println("ป้อนค่าข้อมูลของต้นไม้:");

        for (int i = 0; i < height; i++) {
            int data = scanner.nextInt();
            tree.insert(data);
        }

        System.out.println("In-order traversal ของต้นไม้:");
        tree.inorder();
    }
}
