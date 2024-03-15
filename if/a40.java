/* 
เขียนโปรแกรมรับ input 1 ตัว เป็นปีคริสตศักราช (จำนวนเต็ม) และตรวจสอบว่า จำนวนที่รับมามีค่า มากกว่าหรือเท่ากับ 0 หรือไม่ 
• ถ้ามีค่ามากกว่าหรือเท่ากับ 0 ให้คำนวณปีพุทธศักราช (ปีคริสตศักราช + 543) และพิมพ์ค่าออกมา 
• ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ Please insert number that is greater or equal zero 
 */
import java.util.Scanner;

public class a40 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้ป้อนปีคริสตศักราช
        System.out.print("กรุณาป้อนปีคริสตศักราช: ");

        // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร christianYear
        int christianYear = scanner.nextInt();

        // ตรวจสอบว่าปีคริสตศักราชมีค่ามากกว่าหรือเท่ากับ 0 หรือไม่
        if (christianYear >= 0) {
            // คำนวณปีพุทธศักราช (ปีคริสตศักราช + 543) และพิมพ์ค่าออกมา
            int buddhistYear = christianYear + 543;
            System.out.println("ปีพุทธศักราชที่เท่ากับ " + buddhistYear);
        } else {
            System.out.println("Please insert number that is greater or equal zero");
        }

        // ปิด Scanner เพื่อควบคุมทรัพยากร
        scanner.close();
    }
}
