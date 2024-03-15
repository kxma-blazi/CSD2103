/* เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0 หรือไม่ 
• ถ้ามีค่ามากกว่า 0 ให้พิม์ more than zero 
• ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ less or equal zero 
 */
import java.util.Scanner;

public class a34 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            // แสดงข้อความให้ผู้ใช้ป้อนตัวเลขจำนวนเต็ม
            System.out.print("กรุณาป้อนตัวเลขจำนวนเต็ม: ");
            // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร number
            number = scanner.nextInt();

            // ตรวจสอบค่าที่รับมาว่ามีค่ามากกว่า 0 หรือไม่
            if (number > 0) {
                System.out.println("more than zero"); // ถ้ามีค่ามากกว่า 0 ให้พิมพ์ "more than zero"
            } else {
                System.out.println("less or equal zero"); // ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ "less or equal zero"
            }
        } while (number <= 0);

        scanner.close();
    }
}
