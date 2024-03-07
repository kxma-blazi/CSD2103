package tree;
import java.awt.*;
import javax.swing.*;
import java.util.*;

// สร้างคลาส TreeNode สำหรับแทนโหนดใน Binary Tree
class TreeNode {
    int data;        // ข้อมูลในโหนด
    TreeNode left;   // ลิงค์ไปยังโหนดลูกทางซ้าย
    TreeNode right;  // ลิงค์ไปยังโหนดลูกทางขวา

    // คอนสตรักเตอร์ของ TreeNode รับค่าข้อมูลและกำหนดลิงค์เริ่มต้นเป็น null
    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// คลาส BinaryTreePanel เป็น JPanel ที่ใช้สำหรับวาด Binary Tree บน GUI
class BinaryTreePanel extends JPanel {
    private TreeNode root;

    public BinaryTreePanel(TreeNode root) {
        this.root = root;
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, getWidth() / 2, 30, root, getWidth() / 4);
    }

    private void drawTree(Graphics g, int x, int y, TreeNode node, int xOffset) {
        if (node != null) {
            g.setColor(Color.BLACK);
            g.fillOval(x - 20, y - 20, 40, 40);
            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(node.data), x - 5, y + 5);
            if (node.left != null) {
                int xLeft = x - xOffset;
                int yLeft = y + 60;
                g.setColor(Color.BLACK);
                g.drawLine(x, y, xLeft, yLeft);
                drawTree(g, xLeft, yLeft, node.left, xOffset / 2);
            }
            if (node.right != null) {
                int xRight = x + xOffset;
                int yRight = y + 60;
                g.setColor(Color.BLACK);
                g.drawLine(x, y, xRight, yRight);
                drawTree(g, xRight, yRight, node.right, xOffset / 2);
            }
        }
    }
}

public class BinaryTreeOneDimensional3 {
    // ฟังก์ชันสร้าง Binary Tree จากลำดับ In-order และ Post-order
    public static TreeNode buildTree(int[] inOrder, int[] postOrder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd)
            return null;

        int rootValue = postOrder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        int leftTreeSize = rootIndex - inStart;

        root.left = buildTree(inOrder, postOrder, inStart, rootIndex - 1, postStart, postStart + leftTreeSize - 1);
        root.right = buildTree(inOrder, postOrder, rootIndex + 1, inEnd, postStart + leftTreeSize, postEnd - 1);

        return root;
    }

    // ฟังก์ชันท่องต้นไม้แบบ In-order
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // ฟังก์ชันท่องต้นไม้แบบ Post-order
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the binary tree: ");
        int height = scanner.nextInt();

          // กำหนดลำดับ In-order และ Post-order
        int[] inOrder = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] postOrder = {2, 1, 4, 6, 5, 3, 8, 7};

        // สร้าง Binary Tree จากลำดับ In-order และ Post-order
        TreeNode root = buildTree(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1);

        // สร้างตัว JFrame สำหรับแสดง Binary Tree
        JFrame frame = new JFrame("Binary Tree Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BinaryTreePanel(root));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        System.out.println("In-order traversal of the binary tree:");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("Post-order traversal of the binary tree:");
        postOrderTraversal(root);
        System.out.println();
    }
}
