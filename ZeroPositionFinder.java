public class ZeroPositionFinder {

    // ฟังก์ชันค้นหาตำแหน่งของ 0 ในอาร์เรย์ a2
    public static int findZeroPosition(int[] a2) {
        int low = 0;
        int high = a2.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a2[mid] == 0) {
                return mid; // หาตำแหน่งของ 0 ใน a2
            } else if (a2[mid] < 0) {
                low = mid + 1; // ค้นหาด้านขวาของตัวกลาง
            } else {
                high = mid - 1; // ค้นหาด้านซ้ายของตัวกลาง
            }
        }

        return -1; // ไม่พบ 0 ใน a2
    }

    // ฟังก์ชันค้นหาตำแหน่งใน a1 โดยใช้ตำแหน่งของ 0 ใน a2
    public static int findPositionInA1(int[] a1, int zeroPosition) {
        return zeroPosition - 1; // เนื่องจาก arrays เริ่มต้นนับตำแหน่งที่ 0
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
        int[] a2 = {1, 3, 0, 4, 6, 7, 8, 9, 20};

        int zeroPosition = findZeroPosition(a2);

        if (zeroPosition != -1) {
            int positionInA1 = findPositionInA1(a1, zeroPosition);
            System.out.println("ตำแหน่งของ 0 ใน a2: " + zeroPosition);
            System.out.println("ตำแหน่งใน a1: " + positionInA1);
        } else {
            System.out.println("ไม่พบ 0 ใน a2");
        }
    }
}