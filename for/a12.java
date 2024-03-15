//  เขียนโปรแกรมรับค่า n แล้วคำนวณค่าต่อไปนี้ √6 * ( 1/1^2 + 1/2^2 +1/3^2 +1/4^2 + ... + 1/n^2)
import java.util.Scanner;
public class a12 {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);

        System.out.print("กรอกค่า n: "); //เก็บค่าเอาไว้ในตัวเเปร n
    double n = os.nextDouble();

    
    double sum = 0.0; // สร้างตัวแปร sum ใช้เก็บผลรวมของค่าที่คำนวณ และกำหนดค่าเริ่มต้นเป็น 0.0
    for (int i = 1; i <= n; i++) { // i จะเพิ่มขึ้นเรื่อยๆจนกว่าจะถึงค่าที่ user กรอกเข้ามา
        sum += 1.0 / (i*i);
    }

    System.out.println( "ผลรวมของค่าคือ:  " + sum);
    }
}