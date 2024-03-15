public class AVLTree {
    private AVLNode root;

    public AVLTree() {
        root = null;
    }

    // ฟังก์ชันสำหรับคืนค่าความสูงของโหนด ถ้าโหนดเป็น null คืนค่า -1
    private int height(AVLNode avlNode) {
        return avlNode == null ? -1 : avlNode.height;
    }

    // ฟังก์ชันสำหรับคืนค่าสูงสุดระหว่างความสูงของโหนดซ้ายและขวา
    private int max(int lHeight, int rHeight) {
        return lHeight > rHeight ? lHeight : rHeight;
    }

    // ฟังก์ชันในการแทรกข้อมูลลงในต้นไม้
    public void insert(int data) {
        root = insert(data, root);
    }

    // ฟังก์ชันแทรกข้อมูลลงในโหนดและคืนโหนดใหม่
    private AVLNode insert(int data, AVLNode currentNode) {
        if (currentNode == null) {
            return new AVLNode(data);
        }

        if (data < currentNode.data) {
            currentNode.left = insert(data, currentNode.left);
        } else if (data > currentNode.data) {
            currentNode.right = insert(data, currentNode.right);
        } else {
            // ไม่อนุญาตให้ข้อมูลที่ซ้ำกัน ไม่ต้องทำอะไร
            return currentNode;
        }

        // ปรับค่าความสูงของโหนด
        currentNode.height = max(height(currentNode.left), height(currentNode.right)) + 1;

        // ตรวจสอบสมดุลและทำการหมุนเพื่อรักษาความสมดุล
        int balance = getBalance(currentNode);

        // Left Heavy
        if (balance > 1 && data < currentNode.left.data) {
            return rightRotation(currentNode);
        }

        // Right Heavy
        if (balance < -1 && data > currentNode.right.data) {
            return leftRotation(currentNode);
        }

        // Left-Right Heavy
        if (balance > 1 && data > currentNode.left.data) {
            currentNode.left = leftRotation(currentNode.left);
            return rightRotation(currentNode);
        }

        // Right-Left Heavy
        if (balance < -1 && data < currentNode.right.data) {
            currentNode.right = rightRotation(currentNode.right);
            return leftRotation(currentNode);
        }

        return currentNode;
    }

    // ฟังก์ชันสำหรับการหมุนโครงสร้างต้นไม้ไปทางขวา
    private AVLNode rightRotation(AVLNode avlNode) {
        AVLNode node = avlNode.left;
        avlNode.left = node.right;
        node.right = avlNode;
        avlNode.height = max(height(avlNode.left), height(avlNode.right)) + 1;
        node.height = max(height(node.left), height(node.right)) + 1;
        return node;
    }

    // ฟังก์ชันสำหรับการหมุนโครงสร้างต้นไม้ไปทางซ้าย
    private AVLNode leftRotation(AVLNode avlNode) {
        AVLNode node = avlNode.right;
        avlNode.right = node.left;
        node.left = avlNode;
        avlNode.height = max(height(avlNode.left), height(avlNode.right)) + 1;
        node.height = max(height(node.left), height(node.right)) + 1;
        return node;
    }

    // ฟังก์ชันสำหรับการคำนวณค่าสมดุลของโหนด
    private int getBalance(AVLNode avlNode) {
        return avlNode == null ? 0 : height(avlNode.left) - height(avlNode.right);
    }

    // คลาสภายในเพื่อแทนโหนดในต้นไม้ AVL
    private class AVLNode {
        int data;
        AVLNode left;
        AVLNode right;
        int height;

        AVLNode(int data) {
            this.data = data;
            this.height = 0;
        }
    }
}
