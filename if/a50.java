import java.util.Scanner;

public class a50{
    public static void main(String[] args) {
        // สร้าง Scanner object เพื่อรับ input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // รับ input 3 ตัว คือ Shopping, Hour, และ Minute
        System.out.print("Enter shopping amount: ");
        int shopping = scanner.nextInt();

        System.out.print("Enter parking hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter parking minutes: ");
        int minutes = scanner.nextInt();

        // คำนวณราคาที่จอดรถ
        int parkingHours = hours;
        if (minutes > 0) {
            parkingHours++; // ถ้ามีเศษของชั่วโมงให้นับเป็น 1 ชั่วโมง
        }

        int parkingCost;
        if (shopping >= 1000) {
            // กรณีซื้อของครบ 1000 บาทขึ้นไป
            if (parkingHours <= 4) {
                parkingCost = 0; // จอดฟรีถ้าไม่เกิน 4 ชั่วโมง
            } else {
                parkingCost = (parkingHours - 4) * 30; // เสียค่าจอดที่เกิน 4 ชั่วโมง
            }
        } else {
            // กรณีซื้อของไม่ถึง 1000 บาท
            if (parkingHours <= 1) {
                parkingCost = 0; // จอดฟรีถ้าไม่เกิน 1 ชั่วโมง
            } else {
                parkingCost = (parkingHours - 1) * 30; // เสียค่าจอดที่เกิน 1 ชั่วโมง
            }
        }

        // แสดงผลราคาที่จอดรถ
        System.out.println("Parking cost: " + parkingCost + " บาท");

        // ปิด Scanner object
        scanner.close();
    }
}
