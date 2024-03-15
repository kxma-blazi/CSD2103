public class LinearSearchExamples {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;

        // Best Case: ค้นหาตัวเลขที่ตัวแรกของอาเรย์
        int bestCasePosition = linearSearchBestCase(arr, target);
        System.out.println("Best Case - Position: " + bestCasePosition);

        // Average Case: ค้นหาตัวเลขที่อยู่ตรงกลางของอาเรย์
        int averageCasePosition = linearSearchAverageCase(arr, target);
        System.out.println("Average Case - Position: " + averageCasePosition);

        // Worst Case: ค้นหาตัวเลขที่ไม่มีในอาเรย์
        int worstCasePosition = linearSearchWorstCase(arr, 6); // 6 ไม่อยู่ในอาเรย์
        System.out.println("Worst Case - Position: " + worstCasePosition);
    }

    // Linear Search Best Case: ค้นหาตัวแรกของอาเรย์
    public static int linearSearchBestCase(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; // คืนตำแหน่งที่พบเป้าหมาย
        }
        return -1; // ไม่พบเป้าหมายในอาเรย์
    }

    // Linear Search Average Case: ค้นหาตรงกลางของอาเรย์
    public static int linearSearchAverageCase(int[] arr, int target)
