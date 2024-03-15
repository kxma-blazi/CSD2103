// เขียนโปรแกรมรับค่า n แล้วคำนวณค่าต่อไปนี้ 1/1+ 1/2+ 1/3+ 1/4+...+1/n
import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกค่า n: ");
        int n = scanner.nextInt();
        
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i*i);
        }

        System.out.println(sum);
    }
}
