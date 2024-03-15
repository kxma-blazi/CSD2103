import java.util.Scanner;

public class a9 {
   public static void main(String[] args) {
      Scanner os = new Scanner(System.in);

      System.out.print("กรุณาใส่ค่า n: ");
      int n = os.nextInt();

      int sum = 1;
      for (int i = 1; i <= n; i++) {

         sum *= i;
      }

      System.out.print(sum);
   }

}