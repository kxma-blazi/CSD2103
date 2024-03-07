import java.util.Arrays;
import java.util.Scanner;
//งานDivideandConquer
public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าขนาดของอาร์เรย์แรก
        System.out.println("ป้อนขนาดของอาร์เรย์แรก");
        int n = scanner.nextInt();
        double[] array1 = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ป้อนค่าสำหรับอาร์เรย์แรกที่ลำดับ " + i + ": ");
            array1[i] = scanner.nextDouble();
        }

        // รับค่าขนาดของอาร์เรย์ที่สอง
        System.out.println("ป้อนขนาดของอาร์เรย์ที่สอง");
        int m = scanner.nextInt();
        double[] array2 = new double[m];
        for (int i = 0; i < m; i++) {
            System.out.print("ป้อนค่าสำหรับอาร์เรย์ที่สองลำดับ " + i + ": ");
            array2[i] = scanner.nextDouble();
        }

        // รวมอาร์เรย์และเรียงลำดับ
        double[] combinedArray = new double[n + m];
        System.arraycopy(array1, 0, combinedArray, 0, n);
        System.arraycopy(array2, 0, combinedArray, n, m);
        Arrays.sort(combinedArray);

        System.out.println("รวมอาร์เรย์ที่จัดเรียงและรวม:");
        for (double value : combinedArray) {
            System.out.println(value);
        }
    }
}
