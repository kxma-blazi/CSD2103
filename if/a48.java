/* 
เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม (Hour, Minute) เพื่อคำนวณค่าที่จอดรถ โดยชั่วโมง แรกจอดฟรี หลังจากนั้นเสียค่าจอดชั่วโมงละ 30 บาท เศษของชั่วโมงนับเป็น 1 ชั่วโมง
 */
import java.util.Scanner;

public class a48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกจำนวนชั่วโมงที่จอดรถ: ");
        int hour = scanner.nextInt();

        System.out.print("กรุณากรอกจำนวนนาทีที่จอดรถ: ");
        int minute = scanner.nextInt();

        // คำนวณเวลาที่จอดรถเป็นชั่วโมงทั้งหมด
        int totalParkingHours = hour + (minute / 60);

        // คำนวณค่าจอดรถ
        int parkingFee = (totalParkingHours - 1) * 30; // ชั่วโมงแรกจอดฟรี

        // แสดงผลลัพธ์
        System.out.println("ค่าจอดรถ: " + parkingFee + " บาท");
    }
}
