import java.util.ArrayList;
import java.util.Scanner;

// work Program Greedy
public class TapeRedcord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนจำนวนโปรเเกรมที่ต้องการจัดเก็บ: ");
        int numberOfPrograms = scanner.nextInt();

        // สร้างรายการโปรเเกรม
        ArrayList<String> programs = new ArrayList<>();

        for (int i = 1; i <= numberOfPrograms; i++) {
            System.out.print("ป้อนชื่อโปรเเกรมที่ " + i + ": ");
            String programName = scanner.next();
            programs.add(programName);
        }

        System.out.print("ป้อนความยาวเเต่ละโปรเเกรม (นาที): ");
        int programLength = scanner.nextInt();

        System.out.print("ป้อนความยาวเเต่ละโปรเเกรม (นาที): ");
        int numberOfTapes = scanner.nextInt();

        // เรียกใช้ Method เพื่อจัดเก็บเเละ calculate MRT
        double totalMRT = storeTapes(programs, programLength, numberOfTapes);

        // เเสดง MRT รวมทั้งหมด
        System.out.println("MRT รวมทั้งหมด: " + totalMRT + "นาที");

        scanner.close();
    }

    public static double storeTapes(ArrayList<String> programs, int programLength, int numberOfTapes) {

        double totalMRT = 0;

        for (int i = 1; i <= numberOfTapes; i++) {
            System.out.println("เทปที่" + i + ":");
            double tapeMRT = 0;

            for (String program : programs) {
                System.out.println("-" + program + "(" + programLength + "นาที");
                tapeMRT += programLength;
            }
            System.out.println("MRT เทปที่ " + i + ":" + tapeMRT + "นาที");
            totalMRT += tapeMRT / 3;
            System.out.println("-------");
        }
        System.out.println("เทปถูกจัดเก็บเรียบร้อยเเล้ว!");
        return totalMRT;
    }
}