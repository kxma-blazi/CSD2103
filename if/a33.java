/* เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็มบวก และตรวจสอบว่าเป็นเลขคู่หรือเลขคี่ 
• ถ้าเป็นเลขคู่ให้พิมพ์ even 
• ถ้าเป็นเลขคี่ให้พิมพ์ odd
 */

import java.util.Scanner;

public class a33 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้ป้อนตัวเลข
        System.out.print("กรุณาป้อนตัวเลขจำนวนเต็มบวก: ");

        // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร number
        int number = scanner.nextInt();

        // ตรวจสอบว่าตัวเลขที่ผู้ใช้ป้อนเป็นเลขคู่หรือเลขคี่
        if (number % 2 == 0) {
            System.out.println("even"); // ถ้าเป็นเลขคู่ให้พิมพ์ "even"
        } else {
            System.out.println("odd"); // ถ้าเป็นเลขคี่ให้พิมพ์ "odd"
        }
        
        scanner.close();
    }
}
