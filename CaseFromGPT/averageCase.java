package CaseFromGPT;
public class averageCase {
    public static int averageCaseLinearSearch(int[] arr, int target) {
        int n = arr.length;
        int foundAtIndex = -1; // เริ่มต้นที่ -1 หากไม่พบเป้าหมาย
        
        // เริ่มการค้นหาจากอินเด็กซ์แรก
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                // หากพบเป้าหมาย ให้เก็บอินเด็กซ์ที่พบและหยุดการค้นหา
                foundAtIndex = i;
                break;
            }
        }
        
        // คืนค่าอินเด็กซ์ที่พบหรือ -1 หากไม่พบเป้าหมาย
        return foundAtIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 25;

        // เรียกใช้ฟังก์ชัน Linear Search ในกรณีเฉลี่ย
        int result = averageCaseLinearSearch(arr, target);

        if (result != -1) {
            System.out.println("เป้าหมาย " + target + " พบที่อินเด็กซ์ " + result);
        } else {
            System.out.println("เป้าหมาย " + target + " ไม่พบในอาร์เรย์");
        }
    }
}
// การหากรณีเชิงเส้นมีเวลาการทำงานเฉลี่ย O(n/2) อยู่ระหว่าง O(1) ถึง O(n) ขึ้นอยู่กับข้อมูล