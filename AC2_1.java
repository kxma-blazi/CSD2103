/*
int g1(int n, int a[]) {
    s = 0;
    for (int i = 1; i < n; ++i)
        s = s + a[i] - a[i-1];
    return s;
}
 */
// Method นี้ใช้คำนวณผลรวมโดยหาผลต่างค่าสูงสุดและค่าต่ำสุดในอาเรย์
public class AC2_1 {
    public static int calculate_s(int[] a) {
        // หาค่าสมาชิกแรกและสมาชิกสุดท้ายในอาร์เรย์
        int ElementA = a[0];
        int ElementB = a[a.length - 1];

         // คำนวณผลต่างระหว่างค่าสมาชิกสูงสุดและต่ำสุดเเละส่งค่ากลับ
        int range = ElementB - ElementA;
        return range;
    }

    public static void main(String[] args) {
        // สมาชิกในอาร์เรย์
        int[] values = {10, 20, 30, 40, 50};

        // เรียกใช้เมธอด calculate_s และเก็บผลลัพธ์ในตัวแปร result
        int result = calculate_s(values);
        System.out.println("ผลต่างระหว่างสมาชิกทีมีค่าสูงสุดเเละสมาชิกที่มีค่าต่ำสุดในอาร์เรย์นี้ คือ: " + result);
    }
}
