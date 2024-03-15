/* เขียนโปรแกรมรับ input 1 ตัว เป็นอุณหภูมิในหน่วยฟาเรนไฮต์ (จำนวนจริง) และตรวจสอบว่า จำนวนที่ รับมามีค่ามากหรือเท่ากับ 32 หรือไม่ 5x(F − 32) 
• ถ้ามีค่ามากกว่าหรือเท่ากับ 32 ให้คำนวนอุณหภูมิในหน่วยองศาเซลเซียส (((c = 5x(F-32)/9)
(C = 9 ) และพิมพ์ค่าออกมา 
• ถ้ามีค่าน้อยกว่า 32 ให้พิมพ์ Too cold to live 
 */
import java.util.Scanner;

public class a41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกอุณหภูมิในหน่วยฟาเรนไฮต์: ");
        double fahrenheit = scanner.nextDouble();

        if (fahrenheit >= 32) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println("อุณหภูมิในหน่วยเซลเซียส: " + celsius + " องศาเซลเซียส");
        } else {
            System.out.println("Too cold to live");
        }
    }
}
