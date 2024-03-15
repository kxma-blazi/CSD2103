//เขียนโปรแกรมรับค่า n แล้วคำนวณค่าต่อไปนี้ 1/1^2+ 1/2^2+ 1/3^2 + 1/4^2+...+1/n^2
import java.util.Scanner;

public class a11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกค่า n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        //for loop เพิ่ม i ไปเรื่อยๆต่อจำนวนรอบ นถึงค่า n ที่user inputเข้ามา
        for (int i = 1; i <= n; i++) {
            double fraction = 1.0 / (i * i);
            sum += fraction;
        }

        System.out.println("ผลรวมของค่าคือ: " + sum);
    }
}
