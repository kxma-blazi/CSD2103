/*
เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0, น้อย กว่า 0 หรือเท่ากับ 0 
• ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ zero 
• ถ้ามีค่ามากกว่า 0 ให้ตรวจสอบว่าเป็นเลขคู่หรือเลขคี่ 
• ถ้าเป็นเลขคู่ ให้พิมพ์ Positive Even 
• ถ้าเป็นเลขคี่ ให้พิมพ์ Positive Odd 
• ถ้ามีค่าน้อยกว่า 0 ให้ตรวจสอบว่าเป็นเลขคู่หรือเลขคี่
• ถ้าเป็นเลขคู่ ให้พิมพ์ Negative Even 
• ถ้าเป็นเลขคี่ ให้พิมพ์ Negative Odd 
 */
import java.util.Scanner;

public class a44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกจำนวนเต็ม: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("zero"); // ถ้าnumberเป็น 0 จะเเสดงข้อความ 'zero'
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even"); 
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }
}
