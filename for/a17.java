/*  เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3, 5 และ 7 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100  */
public class a17 {
    public static void main(String[] args) {
        System.out.println("จำนวนที่หารด้วย 3 หรือ 5 ลงตัวที่อยู่ระหว่าง 1 และ 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}