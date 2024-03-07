package tree;
import java.util.Scanner;

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

public class BinaryTree {
    // เมธอดสร้างต้นไม้โดยใช้ลำดับ In-order และ Post-order
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

        // สร้างส่วนของต้นไม้ทางซ้ายและขวา
        root.left = buildTree(inOrder, postOrder, inStart, rootIndex - 1, postStart, postStart + leftTreeSize - 1);
        root.right = buildTree(inOrder, postOrder, rootIndex + 1, inEnd, postStart + leftTreeSize, postEnd - 1);

        return root;
    }

    // เมธอดท่องต้นไม้แบบ In-order และแสดงผลลัพธ์
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // เมธอดท่องต้นไม้แบบ Post-order และแสดงผลลัพธ์
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนค่าความสูงของต้นไม้: ");
        int height = scanner.nextInt();

        int[] inOrder = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] postOrder = {2, 1, 4, 6, 5, 3, 8, 7};

        TreeNode root = buildTree(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1);

        System.out.println("In-order traversal of the binary tree:");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("Post-order traversal of the binary tree:");
        postOrderTraversal(root);
        System.out.println();
    }
}
