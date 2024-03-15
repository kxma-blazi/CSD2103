/* เขียนโปรแกรมพิมพ์ 0, 1, 2, ... 99 */
public class a1 {
    public static void main(String[] args) {
        // ใช้ลูป for เพื่อวนรอบตั้งแต่ 0 ถึง 99
        for (int i = 0; i < 100; i++) {
            System.out.print(i); // พิมพ์ตัวเลขที่เก็บไว้ใน i ในแต่ละรอบของลูป
            System.out.print(" "); // พิมพ์ช่องว่างเพื่อคั่นตัวเลขให้ดูง่าย
        }
    }
}
