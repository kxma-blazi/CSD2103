/*  เขียนโปรแกรมรับ input 1 ตัว ที่เป็นสายอักขระ และตรวจสอบว่ามี a, e, i, o, u ในสายอักขระหรือไม่ 
• ถ้ามีให้พิมพ์ There is vowel 
• ถ้าไม่มีให้พิมพ์ There is not vowel
 */
import java.util.Scanner;

public class a36 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้ป้อนสายอักขระ
        System.out.print("กรุณาป้อนสายอักขระ: ");

        // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร input
        String input = scanner.nextLine().toLowerCase();

        // ตรวจสอบว่าในสายอักขระมี a, e, i, o, u หรือไม่
        if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
            System.out.println("There is vowel"); // ถ้ามี a, e, i, o, u ให้พิมพ์ "There is vowel"
        } else {
            System.out.println("There is not vowel"); // ถ้าไม่มี a, e, i, o, u ให้พิมพ์ "There is not vowel"
        }

        scanner.close();
    }
}
