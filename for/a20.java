/* เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย (3 และ 5 ลงตัว), (3 และ 7 ลงตัว) หรือ (5 และ 7 ลงตัว) ซึ่งอยู่ ระหว่าง 1 และ 1000 */
public class a20 {
    public static void main(String[] args) {
        System.out.println("จำนวนที่หารด้วย (3 และ 5 ลงตัว), (3 และ 7 ลงตัว) หรือ (5 และ 7 ลงตัว) ที่อยู่ระหว่าง 1 และ 1000:");

        for (int i = 1; i <= 1000; i++) {
            // ใช้เงื่อนไขหารด้วย 3 และ 5 ลงตัว
            boolean isDivisibleBy3And5 = (i % 3 == 0) && (i % 5 == 0);
            // ใช้เงื่อนไขหารด้วย 3 และ 7 ลงตัว
            boolean isDivisibleBy3And7 = (i % 3 == 0) && (i % 7 == 0);
            // ใช้เงื่อนไขหารด้วย 5 และ 7 ลงตัว
            boolean isDivisibleBy5And7 = (i % 5 == 0) && (i % 7 == 0);

            // ตรวจสอบว่า i หารด้วย (3 และ 5 ลงตัว) หรือ (3 และ 7 ลงตัว) หรือ (5 และ 7 ลงตัว) หรือไม่
            if (isDivisibleBy3And5 || isDivisibleBy3And7 || isDivisibleBy5And7) {
                System.out.println(i);
            }
        }
    }
}
