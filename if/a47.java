/* 
เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า ผลบวกของจำนวนทั้ง 2 มีค่ามากกว่า 0, น้อยกว่า 0 หรือ เท่ากับ 0 
• ถ้ามีค่ามากกว่า 0 ให้ตรวจสอบว่า เป็นเลขคู่หรือไม่
• ถ้าเป็นเลขคู่ให้พิมพ์ Positive Even 
• ถ้าเป็นเลขคี่ให้พิมพ์ Positive Odd 
• ถ้ามีค่าน้อยกว่า 0 ให้ตรวจสอบว่า เป็นเลขคู่หรือไม่
• ถ้าเป็นเลขคู่ให้พิมพ์ Negative Even 
• ถ้าเป็นเลขคี่ให้พิมพ์ Negative Odd 
• ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ Zero 
 */
import java.util.Scanner;

public class a47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกจำนวนเต็มตัวแรก: ");
        int a = scanner.nextInt();

        System.out.print("กรุณากรอกจำนวนเต็มตัวที่สอง: ");
        int b = scanner.nextInt();

        int sum = a + b;

        if (sum > 0) {
            if (sum % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else if (sum < 0) {
            if (sum % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
