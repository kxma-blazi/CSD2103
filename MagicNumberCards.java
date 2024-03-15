import java.util.Scanner;

public class MagicNumberCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าเลขที่ผู้เล่นเลือก
        System.out.print("กรุณาระบุเลขที่คุณเลือก (1-100): ");
        int playerNumber = scanner.nextInt();

        // แปลงเลขที่ผู้เล่นเลือกให้เป็นเลขฐานสอง
        String binaryPlayerNumber = Integer.toBinaryString(playerNumber);

        // เก็บผลรวมของหลักแรกของบัตรทำนายแต่ละใบ
        int sumFirstBit = 0;

        // ใบทำนายแต่ละใบจะมี 7 หลักเนื่องจาก 2^7 = 128 ซึ่งมากกว่า 100
        int numberOfCards = 7;

        // แปลงเลข 1-7 เป็นเลขฐานสองในแต่ละใบทำนาย
        for (int i = 1; i <= 7; i++) {
            String binaryCardNumber = Integer.toBinaryString(i);
            int cardLength = binaryCardNumber.length();
            binaryCardNumber = String.format("%7s", binaryCardNumber).replace(' ', '0');

            // ตรวจสอบว่าเลขของผู้เล่นอยู่ในบัตรทำนายหรือไม่
            boolean found = false;
            for (int j = 0; j < cardLength; j++) {
                if (binaryCardNumber.charAt(j) == '1') {
                    found = true;
                    sumFirstBit += Math.pow(2, cardLength - 1 - j);
                }
            }

            // แสดงผลลัพธ์
            if (found) {
                System.out.println("ใบทำนายที่ " + i + ": " + binaryCardNumber + " - มี");
            } else {
                System.out.println("ใบทำนายที่ " + i + ": " + binaryCardNumber + " - ไม่มี");
            }
        }

        // แสดงผลลัพธ์คำตอบเลขที่ผู้เล่นเลือก
        System.out.println("ผู้เล่นเลือกเลข: " + playerNumber);
        System.out.println("คำตอบคือ: " + sumFirstBit);

        scanner.close();
    }
}
