/* 
เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็มบวก และตรวจสอบว่า รากที่สองของจำนวนที่รับมาเป็น จำนวนเต็มหรือไม่ (Hint 1: x**(1/2) = รากที่ 2 ของ x, Hint 2: ถ้า x เป็นจำนวนเต็ม แล้ว x%1 = 0) 
• ถ้าเป็นจำนวนเต็ม ให้พิมพ์ Yes, It’s interger 
• ถ้าไม่เป็นจำนวนเต็ม ให้พิมพ์ No, It isn’t integer
 */
import java.util.Scanner;

public class a45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกจำนวนเต็มบวก: ");
        double number = scanner.nextDouble();

        double sqrt = Math.sqrt(number);

        if (sqrt % 1 == 0) {
            System.out.println("Yes, It's integer");
        } else {
            System.out.println("No, It isn't integer");
        }
    }
}
