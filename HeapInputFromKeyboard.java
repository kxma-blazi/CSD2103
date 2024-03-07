import java.util.*;

public class HeapInputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // สร้าง Scanner เพื่อรับข้อมูลจากคีย์บอร์ด
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // สร้าง PriorityQueue เพื่อใช้เป็น Min Heap

        System.out.println("Enter elements to insert into the heap (enter -1 to stop):");

        while (true) {
            int element = scanner.nextInt(); // รับค่าจากผู้ใช้

            if (element == -1) {
                break; // หยุดรับข้อมูลเมื่อผู้ใช้ป้อน -1
            }

            minHeap.offer(element); // เพิ่มค่าลงใน Min Heap โดยใช้ offer method
        }

        System.out.println("Extracting elements from the heap in ascending order:");

        while (!minHeap.isEmpty()) {
            int minValue = minHeap.poll(); // ดึงค่าที่น้อยที่สุดออกจาก Min Heap โดยใช้ poll method
            System.out.print(minValue + " "); // แสดงค่าที่ถูกดึงออกมา
        }

        scanner.close(); // ปิด Scanner
    }
}
