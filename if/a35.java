/* เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0, น้อย กว่า 0 หรือ เท่ากับ 0 
• ถ้ามีค่ามากกว่า 0 ให้พิมพ์ > 0 
• ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ < 0 
• ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ = 0 
 */
import java.util.Scanner;

public class a35 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้ป้อนตัวเลข
        System.out.print("กรุณาป้อนตัวเลขจำนวนเต็ม: ");

        // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร number
        int number = scanner.nextInt();

        // ตรวจสอบค่าที่รับมาว่ามีค่ามากกว่า 0, น้อยกว่า 0 หรือเท่ากับ 0
        if (number > 0) {
            System.out.println("> 0"); // ถ้ามีค่ามากกว่า 0 ให้พิมพ์ "> 0"
        } else if (number < 0) {
            System.out.println("< 0"); // ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ "< 0"
        } else {
            System.out.println("= 0"); // ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ "= 0"
        }

        scanner.close();
    }
}
