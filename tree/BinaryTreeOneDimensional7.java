package tree;
public int numberOfLeaves() {
    // เรียกใช้เมธอด numberOfLeaves ของโหนด root เพื่อเริ่มการนับ
    return numberOfLeaves(root);
}

private int numberOfLeaves(BTNode<T> node) {
    // ถ้าโหนดนี้เป็น null คืนค่า 0 เนื่องจากไม่มีใบไม้ในโหนดนี้
    if (node == null) {
        return 0;
    }
    
    // ถ้าโหนดนี้เป็นใบไม้ (ไม่มีลูก) คืนค่า 1
    if (node.leftChild == null && node.rightChild == null) {
        return 1;
    }
    
    // เรียกเมธอด numberOfLeaves สำหรับลูกด้านซ้ายและลูกด้านขวาแล้วรวมผลลัพธ์
    int leftLeaves = numberOfLeaves(node.leftChild);
    int rightLeaves = numberOfLeaves(node.rightChild);
    
    return leftLeaves + rightLeaves;
}