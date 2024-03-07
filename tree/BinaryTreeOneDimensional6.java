package tree;
// Method Only
public int countNodesWithOneChild() {
    return countNodesWithOneChild(root);
}

private int countNodesWithOneChild(BTNode<T> node) {
    // ในกรณีที่ไม่มีโหนด (null) หรือโหนดนี้ไม่มีลูก
    if (node == null || (node.leftChild == null && node.rightChild == null)) {
        return 0;
    }
    
    int count = 0;

    // ตรวจสอบลูกด้านซ้ายและลูกด้านขวา
    if ((node.leftChild != null && node.rightChild == null) ||
        (node.leftChild == null && node.rightChild != null)) {
        count = 1;
    }

    // ตรวจสอบลูกด้านซ้ายและลูกด้านขวาแล้วบวกจำนวน vertices จากลูกทั้งสองข้าง
    count += countNodesWithOneChild(node.leftChild);
    count += countNodesWithOneChild(node.rightChild);

    return count;
}
