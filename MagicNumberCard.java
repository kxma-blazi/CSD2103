import java.util.Scanner;

public class MagicNumberCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับจำนวนใบทำนาย
        System.out.print("กรุณาระบุจำนวนใบทำนาย: ");
        int n = scanner.nextInt();

        // คำนวณจำนวนเต็มบวกที่น้อยที่สุดที่มากกว่าหรือเท่ากับ x (จำนวนที่ต้องการทาย)
        int x = 31; // ตัวอย่างเช่น ทายวันเกิด 1-31
        int nCards = 1;
        while (nCards < x) {
            nCards *= 2;
        }
        // รับค่าในแต่ละใบทำนายและแปลงเป็นเลขฐานสอง
        int[] magicNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" กรุณาระบุเลขในใบทำนายที่ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            magicNumbers[i] = numToBinary(num, n);
        }
        // นับเลขหนึ่งในแต่ละหลักของเลขฐานสองและบวกกัน
        int[] sumBinary = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((magicNumbers[i] >> j) & 1) == 1) {
                    sumBinary[j] = 1;
                }
            }
        }
        // แปลงผลลัพธ์กลับเป็นเลขฐานสิบ
        int result = binaryToNum(sumBinary);
        System.out.println("วันเกิดคือวันที่: " + result);

        scanner.close();
    }
    // เมธอดสำหรับแปลงจำนวนฐานสิบเป็นจำนวนฐานสองที่ตัวเลขมีความยาว n บิต
    private static int numToBinary(int num, int n) {
        int binaryNum = 0;
        int multiplier = 1;

        while (num > 0) {
            int bit = num % 2;
            binaryNum += bit * multiplier;
            multiplier *= 10;
            num /= 2;
        }

        return binaryNum;
    }
    // เมธอดสำหรับแปลงจำนวนฐานสองกลับเป็นจำนวนฐานสิบ
    private static int binaryToNum(int[] binaryArray) {
        int num = 0;
        int multiplier = 1;
        for (int i = 0; i < binaryArray.length; i++) {
            num += binaryArray[i] * multiplier;
            multiplier *= 2;
        }
        return num;
    }
}
