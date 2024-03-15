/*
เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม (Hour, Minute) เพื่อคำนวณค่าที่จอดรถ โดยชั่วโมง แรกจอดฟรี หลังจากนั้นเสียค่าจอดชั่วโมงละ 30 บาท เศษของชั่วโมงนับเป็น 1 ชั่วโมง ถ้าผู้ใช้ โปรแกรมป้อน input ตัวใดตัวหนึ่ง หรือ ทั้งสองตัวเป็นจำนวนเต็มลบ ให้พิมพ์ It can’t be negative และไม่ต้องคำนวณค่าที่จอดรถ
*/
import java.util.Scanner;

public class a49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกจำนวนชั่วโมงที่จอดรถ: ");
        int hour = scanner.nextInt();

        System.out.print("กรุณากรอกจำนวนนาทีที่จอดรถ: ");
        int minute = scanner.nextInt();

        if (hour < 0 || minute < 0) {
            System.out.println("It can't be negative");
        } else {
            // คำนวณเวลาที่จอดรถเป็นชั่วโมงทั้งหมด
            int totalParkingHours = hour + (minute / 60);

            // คำนวณค่าจอดรถ
            int parkingFee = (totalParkingHours - 1) * 30; // ชั่วโมงแรกจอดฟรี

            // แสดงผลลัพธ์
            System.out.println("ค่าจอดรถ: " + parkingFee + " บาท");
        }
    }
}
