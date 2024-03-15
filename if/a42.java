/* 
เขียนโปรแกรมรับ input 1 ตัว เป็นจำนวนเงินในหน่วยดอลล่าสหรัฐ 
(จำนวนจริง) และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0 หรือไม่ 
• ถ้ามีค่ามากกว่า 0 ให้คำนวณจำนวนในหน่วยบาท (THB = USDx32.5) และพิมพ์ค่าออกมา 
• ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ You don’t have money 
 */
import java.util.Scanner;

public class a42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรอกจำนวนเงินในหน่วยดอลล่าสหรัฐ (USD): ");
        double usd = sc.nextDouble();

        if (usd > 0) {
            double thb = usd * 32.5; // คำนวณจำนวนในหน่วยบาท (THB = USDx32.5)
            System.out.println("จำนวนในหน่วยบาท (THB): " + thb);
        } else {
            System.out.println("You don't have money"); // กรณีมีค่าน้อยกว่าหรือเท่ากับ 0
        }
    }
}
