/* เขียนโปรแกรมรับ input 1 ตัว ที่เป็นอักขระ (A, B, C, D, F) และตรวจสอบอักขระ 
• ถ้าเป็น A ให้พิมพ์ [80, 100] 
• ถ้าเป็น B ให้พิมพ์ [70, 80)
• ถ้าเป็น C ให้พิมพ์ [60, 70) 
• ถ้าเป็น D ให้พิมพ์ [50, 60) 
• ถ้าเป็น F ให้พิมพ์ [0, 50)
 */
import java.util.Scanner;

public class a37 {
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่ออ่านค่า input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้ป้อนอักขระ (A, B, C, D, F)
        System.out.print("กรุณาป้อนอักขระ (A, B, C, D, F): ");

        // อ่านค่า input จากผู้ใช้เก็บไว้ในตัวแปร Text
        String text = scanner.nextLine().toUpperCase();

        // ตรวจสอบอักขระและแสดงผลคะแนนความเสี่ยงตามเกณฑ์
        switch (text) {
            case "A":
                System.out.println("[80, 100]");
                break;
            case "B":
                System.out.println("[70, 80)");
                break;
            case "C":
                System.out.println("[60, 70)");
                break;
            case "D":
                System.out.println("[50, 60)");
                break;
            case "F":
                System.out.println("[0, 50)");
                break;
            default:
                System.out.println("กรุณาป้อนอักขระที่ถูกต้อง (A, B, C, D, F)");
        }

        // ปิด Scanner เพื่อควบคุมทรัพยากร
        scanner.close();
    }
}
