package CaseFromGPT;
public class bestCase {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // พบค่าเป้าหมาย
            }
        }
        return -1; // ไม่พบค่าเป้าหมาย
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 6;
        int result = search(arr, target);

        if (result != -1) {
            System.out.println("ค้นพบค่า " + target + " ที่ดัชนี " + result);
        } else {
            System.out.println(target + " ไม่พบในอาร์เรย์");
        }
    }
}
// O(n) เพราะ เวลาการทำงานตามขนาดของอาร์เรย์ เเต่ในกรณีที่พบเจอค่าทันทีจะใช้ O(1)เป็นเวลาคงที่ไม่ขึ้นอยู่กับขนาดของอาร์เรย์